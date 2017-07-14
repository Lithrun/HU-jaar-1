def four_letter(list):
    new_list = []
    for i in list:
        if len(i) is not 4:
            pass
        else:
            new_list.append(i)

    return new_list


lst = ['dog', 'letter', 'stop', 'door', 'bus', 'dust']

print(four_letter(lst))
