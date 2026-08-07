name = 'Thato'
age = 20
height = 5.6
is_employed = False

print('Variables:\n')
print(f'Hi my name is {name} and I am {age} years old ')
print(f'Height: {height}')
print(f'Employment Status: {is_employed}')

print('------------------------------------------------------------------------\n')

print('Dictionaries:\n')

user = {
    'name': 'Naruto',
    'surname': 'Uzumaki',
    'age': 20,
    'email': '7thhokage@gmail.com',
    'city': 'Leaf Village'
}

print(user)
print()

print(user['email'])
user['city'] = 'Hidden Leaf'
user['country'] = 'South Africa'
user.pop('email')
print(user)

print('------------------------------------------------------------------------\n')

print('Lists:\n')

shopping = ['Milk', 'Bread', 'Eggs']
print(shopping)

# adding
shopping.append('cheese')
shopping.append('juice')
print(shopping)

shopping.remove('Bread')
print(shopping)

shopping[1] = 'Bacon'
print(shopping)
print(f'Number of items in cart: {len(shopping)}')

print('------------------------------------------------------------------------\n')
print('Challenge 4 - Movie Collection:\n ')

anime = [
    'Dragon ball',
    'One Piece',
    'Naruto',
    '7 Deadly sins',
    'Pokemon'
]

print(f'Favourite anime: {anime[0]}')
print(f'Least Favourite anime: {anime[-1]}')
print(f'Total anime: {len(anime)}')

print('------------------------------------------------------------------------\n')

print('Conditional Statements: \n')

temp = 15

if temp < 20:
    print('Its too cold')
else:
    print('Its too hot')

print('------------------------------------------------------------------------\n')

print('Challenge 6 - Age Checker:\n')

age = 15

if age < 13:
    print('Child')

elif 13 <= age <= 17:
    print('Teen')

if 18 <= age <= 64:
    print('Adult')

elif age > 64:
    print('Senior')

    """
    Corrections:
    
    if age < 13:
       print("Child")
    elif age <= 17:
       print("Teen")
    elif age <= 64:
       print("Adult")
    else:
       print("Senior")
    """

print('------------------------------------------------------------------------\n')

print('Challenge 7 - Password Check:\n')

password = 'Python123'

if 'Python9uy' == password:
    print('Access granted')
else:
    print('Access denied')

print('------------------------------------------------------------------------\n')
print('Challenge 8 - Car Dictionary:\n')

car = {
    'Brand': 'Kia',
    'Model': 'Picanto',
    'Year': '2018',
    'engine_on': False

}
print(car['Brand'])
car['engine_on'] = True
car['Color'] = 'Red'
car.pop('Year')
print(car)

print('------------------------------------------------------------------------\n')
print('Challenge 9 - Mixing Everything:\n')

user = {
    "name": "Thato",
    "age": 20,
    "hobbies": [
        "Boxing",
        "Coding",
        "Anime"
    ]
}

print(f'Name: {user["name"]}')
print(f'Age: {user["age"]}')
print(f'Hobbies: {user["hobbies"]}')

user['hobbies'].append('Running')
print(user)
user['hobbies'][0] = 'Kung Fu'
print(user)

print('------------------------------------------------------------------------\n')
print('Challenge 10 - Mini Quiz Program:\n')

score = 0

answer = "Paris"

if '' == answer:
    print('Correct')
    score += 1
else:
    print('Incorrect')

print(f'Final Score: {score}')

print('------------------------------------------------------------------------\n')
print('Bonus challenge: \n')

username = "Thato"
password = "Python123"

if 'Thato' == username and 'Python123' == password:
    print(f'Welcome {username}')
else:
    print('Username or Password incorrect')
