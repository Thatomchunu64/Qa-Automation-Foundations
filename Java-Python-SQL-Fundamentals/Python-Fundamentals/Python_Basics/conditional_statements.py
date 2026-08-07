# It's a way for your program to make decisions


if True:
    print('always true')
print('this shii for real')

print()

if False:
    print('always false')
print('man always true')
# the line print('always true') will print but print('always false') wont print coz
# you can see print('always false') is greyed out its taking the logic as false its running the statement as intended
# but print('always true') will print coz its technically not part of the statement, coz it's not indented(not in alignment with  print('always false')
print()

temp = 25
if temp > 20:
    print('ITS VERY HOT!!')

age = 60
print(
    age < 18)  # you will get an output of FALSE, its sorta like boolean, it compares whether age is less than 18 nd returns boolean value

if age < 18:
    print('too young')
else:
    print('too old')
