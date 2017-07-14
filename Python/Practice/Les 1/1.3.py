text = 'Supercalifragilisticeexpialidocious'

print(len(text))

if 'ice' in text:
	print('ice staat in de text')
	
woord1 = 'Antidisestablishmentarianism'
woord2 = 'Honorificabilitudinitatibus'

if len(woord1) > len(woord2):
	print('{} is langer dan {}!'.format(woord1,woord2))
	
lst = ['Berlioz','Borodin','Brian','Bartok','Bellini','Buxtehude','Bernstein']

lst2 = lst.sort()

print(lst2[0])
print(lst2[-1])