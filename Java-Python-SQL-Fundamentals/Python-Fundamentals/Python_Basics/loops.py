# A loop helps you repeat the same action without writing the same code many times
# There are 2 types of loops, for loop and While loop

"""
for loop:
-used when you know exactly how many times the loop should repeat


while loop:
-repeats something as long as a condition is true
"""

car_name = ['kia', 'bmw', 'merc']

# 'name' is the variable name for each value/item in the list
for name in car_name:
    print(f'My car is {name}')

# While loop:

count = 1

while count < 5:
    print(count)

    count += 1

print('-----------------------------------------------------------\n Break:')
# break: stops the loop completely

counter = 1

while counter < 5:
    print(counter)
    if counter == 3:
        print('Break')
        break  # when counter reaches 3 it will skip the below line to increment counter, it will get out of the loop

    counter += 1
