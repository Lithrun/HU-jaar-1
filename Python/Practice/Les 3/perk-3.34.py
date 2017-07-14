def pay(wage,hours_worked):
    hours_over_worked = hours_worked - 40
    if hours_over_worked > 0:
        price = 40 * wage + (hours_over_worked * wage * 1.5)
    else:
        price = hours_worked * wage
    return price

wage = eval(input('What is your wage: '))
hours = eval(input('How many hours have you worked: '))

print (pay(wage,hours))
