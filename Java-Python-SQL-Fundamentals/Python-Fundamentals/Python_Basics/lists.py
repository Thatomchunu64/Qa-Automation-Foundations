# Lists: Store multiple values in order, It's the same as an Array or ArrayList

# you do a multi line comment like so """ """, it's similar to /* /* from java
"""
List Characteristics:
-Keeps the order of values
-Can grow or Shrink
-Can store any object/ variable, can be string, integers, boolean,float,etc...
-Very flexible
"""

# in python even if u don't declare the data type,python automatically detects what data type is being used based on the value

pplNames: list = ['Mia', "Jake", 'Paul', "Jill"]  # you can identify it's a list by the []
print(pplNames)

# so even if u say pplNames =['Mia',"Jake",'Paul',"Jill"], it automatically identifies it's a list by the []

print('-----------------------------------------------------------------------')

# In order to access the value inside the list we use indexes, index is a number and starts counting from 0
print(pplNames[0])
print(pplNames[1])
print(pplNames[2])

print('-----------------------------------------------------------------------')

# You cant access a value from an index that doesnt exist, python will throw an error
# e.g. print(pplNames[10])

print('\nGetting length of list:')
print(len(pplNames))

print('-----------------------------------------------------------------------')

print('\nAdding something to list:')
pplNames.append("Kelly")
print(pplNames)
print(f'New length of list is: {len(pplNames)}')

print('-----------------------------------------------------------------------')

print('Removing something from list by using the value:')
pplNames.remove("Mia")  # removing by value
print(pplNames)
print(f'New length of list is: {len(pplNames)}')

print('-----------------------------------------------------------------------')

print('Removing something from list by using the index:')
pplNames.pop(2)  # removing by index number, we use pop instead of remove
print(pplNames)
print(f'New length of list is: {len(pplNames)}')

"""
#you can also delete/remove like so:

del pplNames[0]
print(pplNames)
"""
print('-----------------------------------------------------------------------')

print('Removing something that doesnt exist in the list: ')
# pplNames.remove("Mia") , we already removed mia above
# You will get this error: ValueError: list.remove(x): x not in list

print('Removing something from the list that does NOT exist using the index: ')
# pplNames.pop(6)
# you will get this error: IndexError: pop index out of range

print('-----------------------------------------------------------------------')

print('Updating/replacing something in the list using index:\n')
print('names before update:')
print(pplNames)
print()
pplNames[0] = 'Luffy'
print('names after update:')
print(pplNames)

print('-----------------------------------------------------------------------')
pplNames.append('Luffy')
pplNames.append('Paul')

print('Get a count of something/ a value in the list: \n')
print(pplNames)
print(pplNames.count('Luffy'))
print(pplNames.count('Paul'))
print(pplNames.count('Kelly'))
print(pplNames.count('Rufus'))  # you will get a count of 0 since the name/value doesn't exist in the code, U won't get an error
