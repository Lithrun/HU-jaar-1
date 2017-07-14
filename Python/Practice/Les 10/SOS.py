gebruiker = input('Voer uw volledige naam in.')
beginstation = input('Voer uw beginstation in.')
eindstation = input('Voer uw eindstation in.')

invoerstring = gebruiker + beginstation + eindstation

def code(invoerstring):

    for c in invoerstring:
        code = chr(int(ord(c)) + 3)
        print(code)

print(code(invoerstring))
