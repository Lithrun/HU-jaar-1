import threading


def my_function():
    print('TEST')


threading.Timer(1, my_function).start()
