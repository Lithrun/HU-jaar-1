stations = ['Schagen',
            'Heerhugowaard',
            'Alkmaar',
            'Castricum',
            'Zaandam',
            'Amsterdam Sloterdijk',
            'Amsterdam Centraal',
            'Amsterdam Amstel',
            'Utrecht Centraal',
            "'s-Hertogenbosch",
            'Eindhoven',
            'Weert',
            'Roermond',
            'Sittard',
            'Maastricht'
            ]

beginstation = stations[0]
eindstation = stations[-1]
beginstation_input = input('Wat is uw beginstation? ')
if not beginstation_input in stations:
    print('Het station ' + beginstation_input + ' is niet geldig, het begin station is: ' + stations[0])
else:
    beginstation = beginstation_input


eindstation_input = input('Wat is uw eindstation? ')
if not eindstation_input in stations:
    print('Eindstation is ongeldig')
    index_beginstation = stations.index(beginstation)
    index_eindstation = stations.index(eindstation)

else:
    eindstation = eindstation_input
    index_beginstation = stations.index(beginstation)
    index_eindstation = stations.index(eindstation)
    if index_beginstation >= index_eindstation:
        print('Beginstation heeft hogere waarde dan eindstation')
        eindstation = stations[-1]

print('Het beginstation ' + beginstation + ' is het ' + str(index_beginstation+1) +'e station in het traject')
print('Het eindstation ' + eindstation + ' is het ' + str(index_eindstation+1) +'e station in het traject')
aantal_stations = index_eindstation - index_beginstation
print('De afstand bedraagt ' + str(aantal_stations) + ' stations(s)')

prijs = aantal_stations * 5
print('De prijs van het kaartje is ' + str(prijs) + ' euro.')

print('Jij stapt in de trein in: ' + beginstation)
tussen_stations = [stations[index_beginstation+1], stations[index_eindstation]]

for naam in stations:
    index_naam = stations.index(naam)
    if index_naam > index_beginstation and index_naam < index_eindstation:
        print(' -  ' + naam)

print('Jij stapt uit in: ' + eindstation)
