location = '4_3.txt'
infile = open(location, 'r')
content = infile.read()
infile.close()

list = content.split('\n')
lenght = len(list)

num = 0
for data in list:
    i = data.split(',')
    i[0].strip()
    if int(i[0]) > int(num):
        num = i[0]
        index = (list.index(data) + 1)

print('Deze file telt {} regels'.format(lenght))
print('Het grootste kaartnummer is: {} en dat staat op regel {}'.format(num,index))
