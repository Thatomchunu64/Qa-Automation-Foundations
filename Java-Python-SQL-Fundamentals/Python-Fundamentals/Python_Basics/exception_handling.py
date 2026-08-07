#Exception handling prevents crashes from bad input/errors

"""
try...catch(in other languages)

In Python, we use:
try...except
"""

try:
    numbers= [12,13,15]
    print(numbers[10])
except Exception as ex: #this is saying catch everything in Exception ,nd we're giving this exception the variable "ex"

    print(ex)
