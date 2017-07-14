import time

def newRunner ():
    location = '4_4.txt'
    file = open(location, 'a')
    timer = time.strftime('%a %d %b %Y, %H:%M:%S ',time.localtime())
    name = input('Enter the name of the runner: ')
    finished = input('Press enter when the runner is finished!')

    if finished == '':
        text = (timer + ', ' + name + '\n')
        file.write(text)

    decision = input('Are there more runners?: ')

    if decision == "Yes":
        newRunner()


    file.close()

newRunner()
