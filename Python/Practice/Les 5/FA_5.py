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

# Input Begin Station

def inlezen_beginpunt():
    check = False
    while check is False:
        beginstation = input('Wat is uw beginstation? ')
        if beginstation not in stations:
            print('{} is ongeldig'.format(beginstation))
        else:
            check = True
    return beginstation

def inlezen_eindpunt(begin):
    check = False
    index_beginstation = stations.index(begin)

    while check is False:
        eindstation = input('Wat is uw eindstation? ')
        if eindstation not in stations:
            print('Deze trein komt niet in {}'.format(eindstation))
        else:
            index_eindstation = stations.index(eindstation)

            if index_beginstation > index_eindstation:
                print('Beginstation heeft een hogere waarde dan eindstation...')
            else:
                check = True
    return eindstation

def omroep_reis(begin, eind):
    index_beginstation = stations.index(begin)
    index_eindstation = stations.index(eind)
    print('Het beginstation {} is het {}e station in het traject'.format(begin, index_beginstation+1))
    print('Het eindstation {} is het {}e station in het traject'.format(eind, index_eindstation+1))

    aantal_stations = index_eindstation - index_beginstation
    print('De afstand bedraagt {} stations(s)'.format(aantal_stations))

    prijs = aantal_stations * 5
    print('De prijs van het kaartje is {} euro.'.format(prijs))
    print('')
    print('Jij stapt in de trein in: {}'.format(begin))

    for naam in stations:
        index_naam = stations.index(naam)
        if index_naam in range(index_beginstation+1, index_eindstation):
            print(' -  {}'.format(naam))

    print('Jij stapt uit in: {}'.format(eind))

begin = inlezen_beginpunt()
eind = inlezen_eindpunt(begin)

omroep_reis(begin, eind)
