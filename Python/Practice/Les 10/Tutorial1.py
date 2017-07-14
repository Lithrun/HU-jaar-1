from tkinter import *
import math

def clicked():
    grondgetal = entry.get()
    if isInt(grondgetal,label):
        grondgetal = int(entry.get())
        kwadraat = grondgetal ** 2
        tekst = 'kwadraat: van {} = {}'
        label['text'] = tekst.format(grondgetal, kwadraat)
        label['background'] = 'green'

def wortel():
    grondgetal = entry.get()
    if isInt(grondgetal,label):
        grondgetal = int(entry.get())
        wortel = math.floor(grondgetal ** 0.5)
        label['text'] = 'De wortel van {} = {}'.format(grondgetal,wortel)
        label['background'] = 'orange'
        isInt(grondgetal,label)

def isInt(integer,text):
    try:
        integer = int(integer)
        return True
    except:
        message = 'Value entered is not an integer!'
        text['text'] = message
        return False

root = Tk() # Create a GUI

screenwidth = root.winfo_screenmmwidth()
screenheight = root.winfo_screenheight()

print(screenheight)
print(screenwidth)

label = Label(master=root,
              text='Calculator V2.0',
              background='yellow',
              foreground='blue',
              font=('Helvetica',10,'bold italic'),
              width=30,
              height=3,
              relief=GROOVE) # Create a label
label.pack() # Draw it

button_kwadraat = Button(master=root,text='Kwadrateer mij!',command=clicked,background='green',foreground='grey') # Create a button
button_kwadraat.pack(pady=10,fill=X,padx=20) # Draw it

button_wortel = Button(master=root,text='Wortel mij!',command=wortel,background='orange',foreground='blue')
button_wortel.pack(pady=10)

entry = Entry(master=root) # Create an entry
entry.pack(padx=10,pady=10)

root.mainloop() # Show the GUI
