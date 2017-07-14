def wijzig(letterlijst):
    del letterlijst[:]


lst = ['a','b']
print(lst)

wijzig(lst)
lst.append('d')
lst.append('e')
lst.append('f')

print(lst)
