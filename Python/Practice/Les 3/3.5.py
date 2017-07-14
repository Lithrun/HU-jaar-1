def kwadraten_som(grondgetallen):
    res = 0
    for i in grondgetallen:
        if i > 0:
            res = i * i + res
    return res

lst = [2,3,8,-1]
print(kwadraten_som(lst))
