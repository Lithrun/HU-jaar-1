def new_password(oldpassword,newpassword):
    if newpassword == oldpassword:
        return print('Your new password is the same as your old password')
    else:
        if len(newpassword) >= 6:

            for i in newpassword:
                if i in '0123456789':
                    return True
            else:
                return print('Your new password requires atleast 1 number')

        else:
            return print('Your new password must be atleast 6 characters')


oud = 'Kaas'
nieuw = input('Enter your new password: ')

result = new_password(oud,nieuw)

if result == True:
    print('Your password has been succesfully changed!')
else:
    print(result)
