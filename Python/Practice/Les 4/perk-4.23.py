def average():
    text = input("Enter a text: ")
    text2 = text.split(' ')
    totaal = 0
    words = 0

    for i in text2:
        totaal = totaal + len(i)
        words = words+ text2.index(i)
    #print(totaal)

    avg = totaal / words
    print(avg)

average()
