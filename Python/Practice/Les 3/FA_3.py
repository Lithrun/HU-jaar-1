# Functie om prijs te berekenen
def standaardprijs(afstandKM):
    if afstandKM > 0:
        if afstandKM > 50:
            prijs = 15 + (0.6*afstandKM)
        else:
            prijs = 0.8*afstandKM
    else:
        prijs = 0
    return prijs

# Function om leeftijd en prijs te bepalen
def ritprijs(leeftijd, weekendrit, afstandKM):
    prijs = standaardprijs(afstandKM)
    if weekendrit is True:
        if leeftijd < 12 or leeftijd >= 65:
            return (prijs * 0.65)
        else:
            return (prijs * 0.6)
    elif weekendrit is False:
        if leeftijd < 12 or leeftijd >= 65:
            return (prijs * 0.7)
        else:
            return prijs
    else:
        return print('Error, variabele weekendrit is ongeldig')

age = eval(input('Vul uw leeftijd in: '))
weekend = input('Is deze rit in het weekend? ja/nee: ')
afstand = eval(input('Wat is de afstand in KM die u aflegt: '))

for i in weekend:
    if i in 'JaJA':
        weekend = True
    elif i in 'NeNE':
        weekend = False
result = ritprijs(age, weekend, afstand)
if result is None:
    print('De ingevulde gegevens zijn onjuist')
else:
    print('Het bedrag voor uw reis is €' + str(result))
