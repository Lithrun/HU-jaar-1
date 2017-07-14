woord = "default"

while len(woord) is not 4:
    woord = input('Geef een string van vier letters: ')

    if len(woord) is not 4:
        print('{} heeft {} letters'.format(woord,len(woord)))
    else:
        print('Inlezen van correcte string: {} is gelaagd'.format(woord))
