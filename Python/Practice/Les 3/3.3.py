def lang_genoeg(lengte):
    if lengte >= 120:
        text = 'Je bent lang genoeg voor de attractie!'
    else:
        text = 'Sorry, je bent te klein!'
    return print(text)


x = eval(input('Vul je lengte in centimeters in: '))

if x > 250:
    print('Deze lengte is te onrealistisch!')
else:
    print(lang_genoeg(x))
