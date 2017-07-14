studenten = {
    'Naam' : 3,
    'Naam2' : 10,
    'Naam3' : 9,
    'Naam4' : 7,
    'Naam4' : 9.3,
    'Naam5' : 4,
    'Naam6' : 7,
    'Naam7' : 1,
}

for i,v in studenten.items():
    if v > 9:
        print('{} heeft een {} gehaald'.format(i,v))
