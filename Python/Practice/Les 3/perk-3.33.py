def reverse_string(text):
    if len(text) == 3:
        return text[2] + text[1] + text[0]
    else:
        return text

str = input('Enter text: ')

print (reverse_string(str))

