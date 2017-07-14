import time
import RPi.GPIO as GPIO

global GPIOLamp
GPIOLamp = 7

global GPIOKnopStart
GPIOKnopStart = 11

global GPIOKnopStop
GPIOKnopStop = 13

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

# Start the program
GPIO.setmode(GPIO.BOARD)
GPIO.setwarnings(False)
GPIO.setup(GPIOLamp,GPIO.OUT)
#GPIO.setup(GPIOKnopStart, GPIO.OUT)
#GPIO.setup(GPIOKnopStop, GPIO.OUT)
GPIO.setup(GPIOKnopStart,GPIO.IN,pull_down=GPIO.PUD_DOWN)
GPIO.setup(GPIOKnopStop,GPIO.IN,pull_down=GPIO.PUD_DOWN)
GPIO.setup()

login = 0
alarm_start = 0
alarm_stop = 0

while True: # Geeft een reactie per 1 seconde
        if (GPIO.input(GPIOKnopStop) == 1): # Knop Stop ingedrukt?
            if alarm_start == 1:
                lampKnipper(tijd_interval,tijd_interval)


        elif (GPIO.input(GPIOKnopStart) == 1) or alarm_start == 1: # Knop Start ingedrukt?
            lampKnipper(tijd_interval,tijd_interval)
            alarm_start = 1
            alarm_stop = 0

        else:
            time.sleep(0.5) # check om de halve seconde of er wat gebreurt
            print('Check')
