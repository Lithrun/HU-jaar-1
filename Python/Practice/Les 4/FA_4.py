def removeCancelled():
    location1 = 'FA_4-1.txt'

    #Read the file and get it's data

    file1 = open(location1, 'r')
    content1 = file1.read() #readlines
    file1.close()

    # Erase and write a new file

    file1 = open(location1, 'w')

    cancelled = getCancelled()
    list1 = content1.split('\n')


    # 2x a for loop to remove items defined in file 1
    for i in list1:
        list2 = i.split('- ')
        for x in cancelled:
            try:
                if x in list2[1]:
                    list1.remove(i)
            except:
                print('Station {} is al uit de lijst verwijdert'.format(x))

    # A for loop to add the updated items of list1 to the file
    for item in list1:
        file1.write(str(item) + '\n')
    file1.close()


def getCancelled():
    location = 'FA_4-2.txt'
    file = open(location, 'r')
    content = file.read()

    temp_list = content.split('\n')
    list = []

    # A for loop to get the data from the file and format it to a list

    for data in temp_list:
        i = data.split(': ')
        list.append(i[1])
    return list

removeCancelled()
