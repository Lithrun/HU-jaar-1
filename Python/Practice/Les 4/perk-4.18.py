s =  '''   It was the best of times, it was the worst of times; it was the age of wisdom, it was the age of foolishness; it was the epoch of belief, it was the epoch of incredulity; it was ...'''

# a
translated_s = s.maketrans(".,;\n", 4*' ')
newS = s.translate(translated_s)

print(newS)

# b
newS = newS.strip()
print(newS)

# c

newS = newS.lower()
print(newS)

# d

result = newS.count('it was')
print(result)

# e

result2 = newS.replace('was', 'is')
print(result2)

# f

list = newS.split(sep=' ')
print(list)
