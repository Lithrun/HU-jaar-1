import csv
import random
file = 'kluizen.csv'

options = {
    1 : 'Ik wil een nieuwe kluis',
    2 : 'Ik wil mijn kluis openen',
    3 : 'Ik geef mijn kluis terug',
    4 : 'Ik wil weten hoeveel kluizen nu nog vrij zijn',
    5 : 'Ik wil stoppen'
}

def nieuwe_kluis():
    with open(file,'r',newline='') as bestand:
            reader = csv.reader(bestand,delimiter=';')
            kluizen = []
            kluizen_onbezet = []
            #Lijst van alle kluizen
            for i in reader:
                if int(i[2]) == 0:
                    i[0] = int(i[0])
                    kluizen_onbezet.append(i)
                else:
                    i[0] = int(i[0])
                    kluizen.append(i)
            if kluizen_onbezet == []:
                print('Alle kluizen zijn bezet')
            else:
                for kluis in kluizen_onbezet:
                    print('Kluisnummer(s) {} is beschikbaar!'.format(kluis[0]))
            keuze = eval(input('Kies een van de lege kluizen die U wilt gebruiken: '))
            for kluis in kluizen_onbezet:
                if keuze == kluis[0]:
                    print('U heeft gekozen voor kluisnummer {}'.format(kluis[0]))
                    kluis[1] = random.randint(1000,9999)
                    kluis[2] = 1
                    print('Uw code is: {}'.format(kluis[1]))
                    kluizen.append(kluis)
                else:
                    kluizen.append(kluis)

    kluizen.sort()
    with open('kluizen.csv','w',newline='') as nieuw_bestand:
            writer = csv.writer(nieuw_bestand,delimiter=';')
            for item in kluizen:
                writer.writerow((item))

def kluis_openen():
    print('')
    code_input = input('Vul uw code in: ')
    with open(file,'r',newline='') as bestand:
        reader = csv.reader(bestand,delimiter=';')
        for kluizen in reader:
            if code_input == kluizen[1]:
                print('Kluis {} is geopend'.format(kluizen[0]))
                break
        print('Deze code komt niet voor in de database')

def kluis_teruggeven():
    kluis_code = input('Vul uw kluis code in: ')
    with open(file,'r',newline='') as bestand:
        reader = csv.reader(bestand,delimiter=';')
        kluizen = []
        for kluis in reader:
            if kluis_code == kluis[1]:
                print('Kluis {} wordt teruggegeven'.format(kluis[0]))
                kluis[2] = 0
                kluizen.append(kluis)
            else:
                kluizen.append(kluis)
    kluizen.sort()
    with open('kluizen.csv','w',newline='') as update_bestand:
        writer = csv.writer(update_bestand,delimiter=';')
        for kluis in kluizen:
            writer.writerow((kluis))

def aantal_kluizen_vrij():
    with open(file,'r',newline='') as bestand:
        reader = csv.reader(bestand,delimiter=';')
        kluizen_vrij = 0
        for kluizen in reader:
            if kluizen[2] == '0':
                kluizen_vrij += 1
        print('Er is/zijn {} kluis/kluizen beschikbaar'.format(kluizen_vrij))

while True:
    print('U kunt kiezen uit de volgende opties: \n')
    for option,text in options.items():
        print('{} : {}'.format(option,text))

    try:
        choice = eval(input('\nSelecteer een optie (1 - 5): '))
        if choice == 1:
            nieuwe_kluis()
        elif choice == 2:
            kluis_openen()
        elif choice == 3:
            kluis_teruggeven()
        elif choice == 4:
            aantal_kluizen_vrij()
        elif choice == 5:
            print('\n Bedankt voor het gebruiken van ons kluissysteem, tot ziens!')
            break
        elif choice > 5:
            print('Deze optie bestaat niet')
    except NameError:
        print('U kan alleen een getal invoeren')
    except:
        print('Er is iets misgegaan, probeer het opnieuw')
        continue
    finally:
        print('')
