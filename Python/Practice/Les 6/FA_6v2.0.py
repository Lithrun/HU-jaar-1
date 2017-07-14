def code(invoerstring):
    for i in invoerstring:
        print(chr(ord(i)+3), end='')
    print('\n')

text = input('Vul uw gebruikers naam in: ')

code(text)

text2 = input('Vul uw beginstation in: ')

code(text2)

text3 = input('Vul uw eindstation in: ')

code(text3)

# One Big Lie review calculator

a = 70585
b = 47462

answer = b / a *100
print(100-answer)

a = 70877
b = 47841

answer = b / a *100
print(100-answer)
