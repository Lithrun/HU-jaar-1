def monopolyworp():
    import random
    stop = False
    dobbel1 = 0
    dobbel2 = 0
    dubbel = 0
    text = '(dubbel)'

    while dobbel1 == dobbel2 and stop == False:
        dobbel1 = random.randrange(1,7)
        dobbel2 = random.randrange(1,7)
        totaal = dobbel1 + dobbel2
        if dobbel1 == dobbel2:
            if dubbel < 2:
                dubbel += 1
                print('{} + {} = {} {}'.format(dobbel1,dobbel2,totaal,text))
            else:
                text = '(direct naar gevangenis)'
                print('{} + {} = {} {}'.format(dobbel1,dobbel2,totaal,text))
                stop = True
        else:
            print('{} + {} = {}'.format(dobbel1,dobbel2,totaal))

monopolyworp()
