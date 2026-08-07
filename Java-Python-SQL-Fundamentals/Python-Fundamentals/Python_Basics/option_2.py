# Option 3 to import function from another file
#Alias:
from calculations import add as A #we only do this if the function we trying to import has a long name and we wanna give it a short one
#e.g. from .... import expected_condidtions as Exc


#We do it like this:
print(f'Dimensional Calculation: {A(94, 6)}')
