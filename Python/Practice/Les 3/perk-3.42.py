def avg(list):
    for i in list:
        lenght = len(i)
        total = 0
        for x in i:
            total = total + x
        gem = total / lenght
        print(gem)

lijst = [[95, 92, 86, 87], [66, 54], [89, 72, 100], [33, 0, 0]]
avg(lijst)
