dictionary = {}
check = False
i = 1

while check == False:
    invoer = input('Volgende Naam: ')
    if invoer:
        if invoer in dictionary:
            i += 1
            dictionary[invoer] = dictionary[invoer] + 1
        else:
            dictionary[invoer] = i

        i = 1
    else:
        check = True

for naam,waarde in dictionary.items():
    if waarde == 1:
        print('Er is {} student met de naam {}'.format(waarde,naam))
    else:
        print('Er zijn {} studenten met de naam {}'.format(waarde,naam))
