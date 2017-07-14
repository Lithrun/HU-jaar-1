def four_letters(list):
    #if len(list) < 2:
    #    print('Lijst is niet lang genoeg')
    #    return False
    #else:
        print(len(list))
        new_list = []
        for i in list:
            if len(i) is not 4:
                pass
            else:
                new_list.append(i)

        return new_list


lst = eval(input('Vul minimaal 10 string in: '))
lst = four_letters(lst)

if lst == False:
    pass
else:
    print('De nieuw-gemaakte lijst met alle vier letter string is {}'.format(lst))
    print(len(lst))
