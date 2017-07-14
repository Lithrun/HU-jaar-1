import time
import csv

bestand = 'inloggers.csv'

while True:
    naam = input('Wat is je achternaam? ')

    if naam == 'einde':
        break

    voorl = input('Wat zijn je voorletters? ')
    gbdatum = input('Wat is je geboortedatum? ')
    email = input('Wat is je e-mail adres? ')
    huidige_tijd = time.strftime('%a %d %b %Y at %H:%M ',time.localtime())
    #Eventueel een try except
    with open(bestand, 'a', newline='') as myCSVFile:
        writer = csv.writer(myCSVFile, delimiter=';')
        writer.writerow((huidige_tijd,naam,voorl,gbdatum,email))
        print('Gegevens opgeslagen in {} \n'.format(bestand))
