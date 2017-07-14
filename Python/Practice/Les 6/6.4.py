bruin = {'Boxtel','Best','Beukenlaan','Eindhoven', 'Helmond \'t Hout','Helmond','Helmond Brouwhuis','Deurne'}
groen = {'Boxtel','Best','Beukenlaan','Eindhoven','Geldrop','Heeze','Weert'}


print(bruin.intersection(groen))

print(bruin.difference(groen))

var1 = bruin.difference(groen)
var2 = groen.difference(bruin)
var3 = bruin.intersection(groen)

print('{} {} {}'.format(var1,var2,var3))
