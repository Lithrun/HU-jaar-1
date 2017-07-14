invoer = "5-9-7-1-7-8-3-2-4-8-7-9"
invoer = invoer.split(sep='-')

# string tabel naar int tabel

lst = []

for i in invoer:
    x = int(i)
    lst.append(x)

lst = sorted(lst)

# sorteer lijst

print('De gesorteerde list is: {}'.format(lst))

# Min en Max

minimun = min(lst)
maximun = max(lst)

print('Het Grootste getal: {} en Kleinste getal: {}'.format(maximun,minimun))

# Aantal en de som

aantal = 0
for i in lst:
    aantal += 1

som = sum(lst)

print('Aantal getaalen: {} en Som van de getallen: {}'.format(aantal,som))

# Gemiddelde

gem = som / aantal

print('Gemiddelde: {}'.format(gem))
