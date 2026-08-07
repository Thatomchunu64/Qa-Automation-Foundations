#Dictionary:
#This is similar to Map from Java
#It stores key value pairs

# python automatically knows this is a dictionary because of the {}
my_user: dict ={
    # 'key' : 'value'
    'name':'Thato',
    'age':20,
    'height':1.5

}
print(my_user)

"""
Dictionary Characteristics:
-Simple structured data
-flexible data
-JSON -like data
-quick prototype
-you can add,remove or access something within the dictionary

"""

#Access something specific
print('Accessing values in the dict using the key: \n')
print(my_user['age'])
print(my_user['name'])
print(my_user['height'])

#You can only access something in the dictionary using the Key, u cant use the value

#Accessing something that doesn't exist
#print(my_user['Bodycount'])
#You will get this error: KeyError: 'Bodycount'

print('--------------------------------------------------------------------')

print('Adding something in the dictionary')
my_user['surname'] = 'Mchunu'
print(my_user)

print()
print('updating something in the dictionary: ')
my_user['age'] = 25
my_user['name'] = 'Exs'
print(my_user)

#key is case-sensitive so if there's a typo it will take it as adding a new key
my_user['Name'] = 'Mitch'
print(my_user)
#print output: {'name': 'Exs', 'age': 25, 'height': 1.5, 'surname': 'Mchunu', 'Name': 'Mitch'}

print('--------------------------------------------------------------------')

print('Removing something in the dictionary')

my_user.pop('Name')
print(my_user)

# you can also use:  del my_user['Name']

print('--------------------------------------------------------------------')

"""
Removing something in the dictionary that doesnt exist: 

my_user.pop('Bodycount')
you will get this error: KeyError: 'Bodycount'
"""