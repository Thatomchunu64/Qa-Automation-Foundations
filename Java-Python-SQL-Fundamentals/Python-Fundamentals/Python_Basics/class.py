# A class is a template/blueprint for creating an object

class Cara:

#Constructor
    def __init__(self,car_brand, year_released):
        self.year= year_released #you declare the variables within the constructor instead of outside
        self.brand= car_brand
        self.model= '325i'

    """
    You can also hardcode it like this if you dont want temporary varibles:
        def __init__(self):
        self.year= '2003'
        self.brand= 'toyota
    """

#method
    def get_car_info(self):
        print(f'My car is a {self.brand} {self.model} from {self.year}')


#instance of object
car_detail= Cara("BMW",2009)
car_detail.get_car_info()


"""
    #Function:
    def my_car_class_name(self):# self is the same as this from java, but you have to put self in every function that is within a class
        print("My car class has a sexy beamer")

car_uno:Car = Car()

car_uno.my_car_class_name()
"""