age = int(input('Geef je leeftijd: '))
id = input('Nederlands paspoort: ')

if age >= 18 and (id == 'ja' or id == 'Ja'):
    print('Gefeliciteerd, je mag stemmen!')
else:
    print('Je mag niet stemming, want je voldoet niet aan de voorwaarden!')
