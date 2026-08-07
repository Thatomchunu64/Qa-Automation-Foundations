# Function is a reusable code
# in python we use def, which is basically(define)

def greet(name: str):
    # print('hello world')
    print(f'hello {name}')


greet('EXS')
greet(name='Ivar')  # same thing as above, u can do it either way


# getting data from user before calling function:
# my_name = input('Enter your name: ')#input a values instead of already declaring it
# greet(my_name)#call the greet function but using the value from the above input


def add(num1: int, num2: int) -> int:
    return num1 + num2


print(add(4, 2))

answer = add(1, 99)  # here we just created a variable for this calculation/code: add(num1: 1, num2: 99)
print(f'Answer: {answer}')
print(f'Calculation:{add(6, 2)}')


