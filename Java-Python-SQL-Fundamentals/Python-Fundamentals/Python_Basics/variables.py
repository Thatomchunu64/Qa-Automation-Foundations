# 4 basic variables

# In python the variable name comes first, followed by the data type and lastly the value[e.g. name: str ='Mary']

# 1.String data type/variable:
moniker: str = 'Viktor'  # here the variable name(Moniker) comes first followed by the data type(str), and lastly the value is within''

# 2.Integer data type/variable:
age: int = 12  # number

# 3. Float data type:
height: float = 12.5  # used for decimal numbers(prices percentages,etc...)

# 4. Boolean data type:
engine_on: bool = False  # In python the boolean value needs to be in capital letters(True/False), used for validation & conditions

#in python even if u don't declare the data type,python automatically detects what data type is being used based on the value
surname= "Cele"
email= 'cele@gmail.com' # Another thing is in python, for strings you can use '' or "", python won't complain

#this is how you print in python, it's similar to System.out.println() from Java
print(moniker)
print(age)
print(height)
print(engine_on)
print(surname)
print(email)

#f-string (formatted string literal)
print(f'My name is {moniker} {surname}.')# if u don't include the f, then the variables won't be substituted with their values