def arithmetic(int_list):
    difference = int_list[1] - int_list[0]
    for i in range(0, len(int_list)-1):
        avg = int_list[i+1] - int_list[i]
        if avg is not difference:
            return False
    return True

lst = [3,6,9,12,15]

x = arithmetic(lst)

print(x)
