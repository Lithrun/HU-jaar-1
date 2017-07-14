import csv

with open('header.csv','r',newline='') as artikelen:
    reader = csv.reader(artikelen,delimiter=';')

    max_prijs = 0
    totaal = 0

    for row in reader:
        try:
            prijs = float(row[-1])
            if prijs > max_prijs:
                max_prijs = prijs
                duurste_artikel = row[2]
                voorraad = row[3]
                artikel_nummer = row[0]
            totaal += int(row[3])
        except:
            pass

print('Het duurste artikel is {} en de kost {}'.format(duurste_artikel,max_prijs))
print('Er zijn slechts {} examplaren in voorraad van het product met nummer {}'.format(voorraad,artikel_nummer))
print('In totaal hebben wij {} producten in ons magazijn liggen'.format(totaal))
