prijs = 4356
try:
    aantal = eval(input('Voer het aantal personenen in: '))
    if aantal < 0:
        print('Negative getallen zijn niet toegestaan!')
    else:
        print(prijs/aantal)
except NameError:
    print('Waarde moet een getal zijn')
except ZeroDivisionError:
    print('Waarde moet geen nul zijn')
except:
    print('Onjuiste invoer')
