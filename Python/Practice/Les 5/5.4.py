num = None
aantal = 0
lst = []

while num is not 0:
    num = eval(input('Geef een getal #{}: '.format(aantal+1)))
    if num == 0:
        pass
    else:
        aantal = aantal + 1
        lst.append(num)

som = sum(lst)

print('Er zijn {} getallen ingevoerd, de som is: {}'.format(aantal,som))
