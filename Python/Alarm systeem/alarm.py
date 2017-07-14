import time
from tkinter import *
import sqlite3
import RPi.GPIO as GPIO

# SQL
databasename = 'alarm.db'
def isDatabaseConnection(databasename):
    try:
        connect = sqlite3.connect(databasename)
        return True
    except:
        return False

def startDatabase(databasename): # Maak tabellen aan als deze nog niet bestaan
    if isDatabaseConnection(databasename) == True:
        connect = sqlite3.connect(databasename)
        c = connect.cursor()
        # Create table
        c.execute('''CREATE TABLE IF NOT EXISTS accounts
                         (gebruikersnaam text UNIQUE, email text, wachtwoord text, laatste_login_datum text)''')

        gegevens = ['NickW','nickwindt@hotmail.nl','kaas12321','09-11-2016']
        try:
            c.execute('''INSERT INTO accounts VALUES(?,?,?,?)''',gegevens)
        except:
            print('Account bestaat al')
        finally:
            connect.commit()

def isLoginCorrect(gebruikersnaam,wachtwoord):
    import sqlite3
    database = databasename
    if isDatabaseConnection(database) == True:
        connect = sqlite3.connect(database)
        c = connect.cursor()
        gegevens = [gebruikersnaam, wachtwoord]
        c.execute('''SELECT * FROM accounts WHERE gebruikersnaam = ? AND wachtwoord = ?''',gegevens)
        resultaten = c.fetchall()
        # controleer of gebruikersnaam EN wachtwoord overeenkomen met de opgegeven data
        for resultaat in resultaten:
            if resultaat[0] == gebruikersnaam and resultaat[2] == wachtwoord:
                connect.close()
                return True
        return False

def getCurrentDate():
    import datetime
    nu = datetime.datetime.now()
    datum = nu.strftime('%d-%m-%Y')
    return datum

global GPIOLamp
GPIOLamp = 7

global GPIOKnopStart
GPIOKnopStart = 9

global GPIOKnopStop
GPIOKnopStop = 8

global tijd_interval #standaard tijd interval
tijd_interval = 0.1

# Timer
def isInt(integer):
    try:
        integer = int(integer)
        return True
    except:
        return False

def timer(tijd_interval):
    import time
    if isInt(tijd_interval) == True:
        start = time.time()
        time.sleep(tijd_interval)

        done = time.time()
        elapsed = done - start
        print('Knipper')
    else:
        print('De opgegeven waarde is geen getal/integer')

def lampAan(tijd):
    import time
    global GPIOLamp
    if isInt(tijd) == True:
        time.sleep(tijd)
        GPIO.output(GPIOLamp,GPIO.HIGH)
        return True
    else:
        return False

def lampUit(tijd):
    import time
    global GPIOLamp
    if isInt(tijd) == True:
        time.sleep(tijd)
        GPIO.output(GPIOLamp,GPIO.LOW)
        return True
    else:
        return False

def lampKnipper(tijd_interval_lampAan, tijd_interval_lampUit):

    lampAan(tijd_interval_lampAan)
    lampUit(tijd_interval_lampUit)

# GUI
root = Tk()

def showBeginMenu():
    global linkerBeginFrame
    linkerBeginFrame = Frame(master=root)
    linkerBeginFrame.pack(side=LEFT)

    global rechterBeginFrame
    rechterBeginFrame = Frame(master=root)
    rechterBeginFrame.pack(side=RIGHT)

    global beginLabel
    beginLabel = Label(master=rechterBeginFrame,text='Bent U een gebruiker of bent U een aanbieder?',background='darkgrey',foreground='blue',font=('Helvetica',10,'bold italic'),width=100,height=10)
    beginLabel.pack()

    global startAlarmButton
    startAlarmButton = Button(master=linkerBeginFrame,command=aanbieder_menu,text='Aanbieder',height=3,width=20)
    startAlarmButton.pack(side=LEFT,pady=4,padx=25)

    global loginButton
    loginButton = Button(master=linkerBeginFrame,command=gebruiker_menu,text='Gebruiker',height=3,width=20)
    loginButton.pack(side=RIGHT,pady=4,padx=25)

def showLoginMenu(): # in dit menu moet de bezoeker inloggen met zijn naam en code. De aanbieder kan hier inloggen met zijn wachtwoord en gebruikersnaam. (Via SQLite3)
    global bovenLoginFrame
    bovenLoginFrame = Frame(master=root)
    bovenLoginFrame.pack(side=TOP)

    middenLoginFrame = Frame(master=bovenLoginFrame)
    middenLoginFrame.pack(side=BOTTOM)

    gebruikersnaamLoginFrame = Frame(master=middenLoginFrame)
    gebruikersnaamLoginFrame.pack(side=TOP)

    wachtwoordLoginFrame = Frame(master=middenLoginFrame)
    wachtwoordLoginFrame.pack(side=BOTTOM)

    global onderLoginFrame
    onderLoginFrame = Frame(master=root)
    onderLoginFrame.pack(side=BOTTOM)

    informatieLoginLabel = Label(master=bovenLoginFrame,text='Vul uw gebruikersnaam en code in. Zodat U de inbraak settings kunt wijzigen',background='darkgrey',foreground='black',font=('Helvetica',10,'bold italic'),width=60,height=5)
    informatieLoginLabel.pack(side=TOP)

    global gebruikersnaamLoginEntry
    gebruikersnaamLoginEntry = Entry(master=gebruikersnaamLoginFrame, bd=5)
    gebruikersnaamLoginEntry.pack(side = RIGHT)

    gebruikersnaamLabel = Label(master=gebruikersnaamLoginFrame, text="Gebruikersnaam")
    gebruikersnaamLabel.pack(side=LEFT)

    wachtwoordLabel = Label(master=wachtwoordLoginFrame, text="Code")
    wachtwoordLabel.pack(side=LEFT)

    global wachtwoordLoginEntry
    wachtwoordLoginEntry = Entry(master=wachtwoordLoginFrame,bd=5)
    wachtwoordLoginEntry.pack(side = RIGHT)

    inlogButton = Button(master=onderLoginFrame,command=loginGebruiker,text='Login',height=3,width=20)
    inlogButton.pack(side=BOTTOM,pady=4,padx=25)

def hideLoginMenu(): # verberg het login menu
    bovenLoginFrame.destroy()
    onderLoginFrame.destroy()

def showKeuzeMenu():
    global huidigMenu
    huidigMenu = 'Keuze Menu'

    global bovenKeuzeFrame
    bovenKeuzeFrame = Frame(master=root)
    bovenKeuzeFrame.pack(side=TOP)

    global middenKeuzeFrame
    middenKeuzeFrame = Frame(master=bovenKeuzeFrame)
    middenKeuzeFrame.pack(side=BOTTOM)

    global onderKeuzeFrame
    onderKeuzeFrame = Frame(master=root)
    onderKeuzeFrame.pack(side=BOTTOM)

    global keuzeLabel
    keuzeLabel = Label(master=bovenKeuzeFrame,text='Welkom, kies wat U wilt doen..',background='darkgrey',foreground='blue',font=('Helvetica',10,'bold italic'),width=100,height=10)
    keuzeLabel.pack(side=TOP)

    global keuzeAlarmButton
    keuzeAlarmButton = Button(master=middenKeuzeFrame,command=alarm_uit,text='Alarm Uit',height=3,width=20)
    keuzeAlarmButton.pack(side=LEFT,pady=4,padx=25)

    global keuzeInstellingenButton
    keuzeInstellingenButton = Button(master=middenKeuzeFrame,command=instellingen,text='Instellingen',height=3,width=20)
    keuzeInstellingenButton.pack(side=RIGHT,pady=4,padx=25)

    global keuzeVorigeButton
    keuzeVorigeButton = Button(master=middenKeuzeFrame,command=vorigMenu,text='Log uit',height=3,width=20)
    keuzeVorigeButton.pack(pady=4,padx=25)

def hideKeuzeMenu():
    bovenKeuzeFrame.destroy()
    middenKeuzeFrame.destroy()

def showInstellingenMenu():
    global huidigMenu
    huidigMenu = 'Instellingen Menu'

    global bovenInstellingenFrame
    bovenInstellingenFrame = Frame(master=root)
    bovenInstellingenFrame.pack(side=TOP)

    middenInstellingenFrame = Frame(master=bovenInstellingenFrame)
    middenInstellingenFrame.pack(side=BOTTOM)

    global onderInstellingenFrame
    onderInstellingenFrame = Frame(master=root)
    onderInstellingenFrame.pack(side=BOTTOM)

    global instellingenText
    instellingenText = 'De huidige snelheid van het alarm is {}'.format(tijd_interval)

    global instellingenLabel
    instellingenLabel = Label(master=bovenInstellingenFrame,text=instellingenText,background='darkgrey',foreground='blue',font=('Helvetica',10,'bold italic'),width=100,height=10)
    instellingenLabel.pack(side=TOP)

    instellingenSnellerButton = Button(master=middenInstellingenFrame,command=alarm_sneller,text='Sneller (-0,1s/knipper)',height=3,width=20)
    instellingenSnellerButton.pack(side=RIGHT,pady=4,padx=25)

    instellingenLangzamerButton = Button(master=middenInstellingenFrame,command=alarm_langzamer,text='Langzamer (+0,1s/knipper)',height=3,width=20)
    instellingenLangzamerButton.pack(side=LEFT,pady=4,padx=25)

    instellingenVorigeButton = Button(master=onderInstellingenFrame,command=vorigMenu,text='Vorig Menu',height=3,width=20)
    instellingenVorigeButton.pack(pady=4,padx=25)

def hideInstellingenMenu():
    bovenInstellingenFrame.destroy()
    onderInstellingenFrame.destroy()

def alarm_sneller():
    global tijd_interval
    if tijd_interval > 0.1:
        tijd_interval -= 0.1
    global instellingenLabel
    instellingenLabel['text'] = 'De huidige snelheid van het alarm is {}'.format(round(tijd_interval,2))

def alarm_langzamer():
    global tijd_interval
    if tijd_interval < 2.0:
        tijd_interval += 0.1
    global instellingenLabel
    instellingenLabel['text'] = 'De huidige snelheid van het alarm is {}'.format(round(tijd_interval,2))

def alarm_uit():
    global alarm_start
    alarm_start = 0
    GPIO.output(GPIOLamp,GPIO.LOW)
    keuzeLabel['text'] = 'Het alarm is nu uitgeschakeld'

def instellingen():
    showInstellingenMenu()
    hideKeuzeMenu()

def vorigMenu():
    if huidigMenu == 'Keuze Menu':
        hideKeuzeMenu()
        showLoginMenu()
    elif huidigMenu == 'Instellingen Menu':
        hideInstellingenMenu()
        showKeuzeMenu()

def loginGebruiker():
    if isLoginCorrect(gebruikersnaamLoginEntry.get(),wachtwoordLoginEntry.get()) == True:
        print('U heeft succesvol ingelogd!')
        hideLoginMenu()
        showKeuzeMenu()
    else:
        print('Uw gegevens zijn onjuist')

# Start the program
GPIO.setmode(GPIO.BOARD)
GPIO.setwarnings(False)
GPIO.setup(GPIOLamp,GPIO.OUT)
GPIO.setup(GPIOKnopStart,GPIO.IN,pull_down=GPIO.PUD_DOWN)
GPIO.setup(GPIOKnopStop,GPIO.IN,pull_down=GPIO.PUD_DOWN)

startDatabase(databasename)

login = 0
alarm_start = 0
alarm_stop = 0

while True: # Geeft een reactie per 1 seconde
        if login == 1:
            root.update_idletasks()
            root.update()

        if (GPIO.input(GPIOKnopStop) == 1): # Knop Stop ingedrukt?
        #if True:
            #lampKnipper(tijd_interval,tijd_interval)
            if alarm_start == 1:
                lampKnipper(tijd_interval,tijd_interval)

            if login == 0:
                root.update_idletasks()
                root.update()
                showLoginMenu()
                login = 1

        elif (GPIO.input(GPIOKnopStart) == 1) or alarm_start == 1: # Knop Start ingedrukt?
            lampKnipper(tijd_interval,tijd_interval)
            alarm_start = 1
            alarm_stop = 0
            threading.Timer(2, my_function).start()

        else:
            time.sleep(0.5) # check om de halve seconde of er wat gebreurt
