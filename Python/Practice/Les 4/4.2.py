location = '4_2.txt'
infile = open(location, 'r')
content = infile.read()
infile.close()

list = content.split('\n')

for data in list:
    i = data.split(',')
    print( i[1] + ' heeft kaartnummer: ' + i[0])
