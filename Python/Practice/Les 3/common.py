def isNumberEqual(x):
    temp = x%2
    if temp == 0:
        res = True
    else:
        res = False
    return res

z = eval(input('Enter the value of Z: '))
y = isNumberEqual(z)

if y == True:
    print('z is equal!')
else:
    print('z is unequal!')
