def ticker(filename):
    file = open(filename,'r')
    content = file.read()
    file.close()
    lst = content.split('\n')
    lst2 = []
    for i in lst:
        x = i.split(':')
        lst2.append(x)
    dict = {}
    for items in lst2:
        try:
            dict[items[0]] = items[1]
        except:
            pass

    return dict

dictionary = ticker('6-2.txt')
print('Dictionary is: {}'.format(dictionary))


text = input('Enter Company name: ')

if text in dictionary.keys():
    print(dictionary[text])
else:
    print('Company not in dictionary')

text2 = input('Enter Ticker symbor: ')

if text2 in dictionary.values():
    print(dictionary.get(text2) ) #Print the key
else:
    print('Ticker not in dictionary')
