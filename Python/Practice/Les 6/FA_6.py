def code(invoerstring):
    lst = []
    for letter in invoerstring:
        nummer = ord(letter) + 3
        text = chr(nummer)
        lst.append(text)

    return ListToString(lst)

def ListToString(lst):
    nothing = ''
    for char in lst:
        print(char,end='')
    return nothing

text = input('Vul uw gebruikers naam in: ')

print(code(text))

text2 = input('Vul uw beginstation in: ')

print(code(text2))

text3 = input('Vul uw eindstation in: ')

print(code(text3))
