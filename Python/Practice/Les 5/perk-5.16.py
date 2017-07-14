def indexes(input, letter):
    temp_lst = []
    for i in input:
        temp_lst.append(i)
    index = 0
    lst = []
    for x in temp_lst:
        if x in letter:
            index = temp_lst.index(x,(index+1))
            lst.append(index)
    del temp_lst
    return lst


text = input('Enter a word: ')
letter = input('Enter a letter: ')

print (indexes(text,letter))
