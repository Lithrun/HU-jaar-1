studentencijfers = [[95,92,86],[66,75,54],[89,72,100],[34,0,0]]

def gemiddelde_per_student(studentencijfers):
    antw = []
    for i in studentencijfers:
        totaal = 0
        aantal = 0
        for x in i:
            totaal = totaal + x
            aantal = aantal + 1
        gem = totaal / aantal
        antw.append(gem)

    return antw

def gemiddelde_van_alle_studenten(studentencijfers):
    antw = []
    totaal = 0
    aantal = 0
    for i in studentencijfers:
        for x in i:
            totaal = totaal + x
            aantal = aantal + 1

    gem = totaal / aantal
    antw.append(gem)

    return antw

print(gemiddelde_per_student(studentencijfers))
print(gemiddelde_van_alle_studenten(studentencijfers))
