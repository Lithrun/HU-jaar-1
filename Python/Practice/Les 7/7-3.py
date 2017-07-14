import csv

with open('gamers.csv','r',newline='') as bestand:
    reader = csv.reader(bestand, delimiter=';')
    max_score = 0
    for row in reader:
        score = int(row[-1])

        if score > max_score:
            max_score = score
            text = 'De hoogste score is: {} op {} behaald door {}'.format(row[2],row[1],row[0])

    print(text)
