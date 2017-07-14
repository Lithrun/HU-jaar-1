import time
while True: # Geeft een reactie per 1 seconde
    start = time.time()

    time.sleep(1)  # or do something more productive

    done = time.time()
    elapsed = done - start
    #print(elapsed)
    print('BRAND LAMPJE')
