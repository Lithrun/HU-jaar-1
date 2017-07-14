def seizoen(maand):
    if maand in range(3,6):
        print('Het is lente')
    elif maand in range(6,9):
        print('Het is zomer')
    elif maand in range(9,12):
        print('Het is herfst')
    elif maand < 1 or maand > 12:
        print('Alleen 1 t/m 12 is geldig')
    else:
        print('Het is winter')

getal = eval(input('Vul het maand nummer in: '))

seizoen(getal)
