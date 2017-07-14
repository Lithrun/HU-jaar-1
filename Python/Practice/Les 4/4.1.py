def convert(Celsius):
    res = Celsius*1.8 + 32
    return res

def table(min,max):
    print('{:10}{:10}'.format('F','C'))
    for Celsius in range(min,max,10):
        Fahrenheit = convert(Celsius)
        text = '{:10}{:10}'.format(Fahrenheit,Celsius)
        print(text)


temp_min = eval(input('Enter minimun temperature: '))
temp_max = eval(input('Enter maximun temperature: '))

table(temp_min,temp_max)
