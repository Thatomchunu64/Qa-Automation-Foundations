#Need to import functions

#generally not preferred to import everything since we are only using one function(add)
import calculations

#preferred way if accessing/using only one method from the file, but you can also use it to access more than one or specific functions:
from calculations import add,multiply,subtract

#Now instead of doing it like this for when we are importing everything from the calculation file :
#print(f'Multiverse Calculation: {calculations.add(1,6)}')

#We do it like this:
print(f'Dimensional Calculation: {add(94,6)}')
print(f'Dimensional Calculation: {multiply(32,2)}')
print(f'Dimensional Calculation: {subtract(30,10)}')
