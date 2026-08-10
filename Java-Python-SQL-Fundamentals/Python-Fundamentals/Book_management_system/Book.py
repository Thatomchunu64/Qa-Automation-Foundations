class Book:

    def __init__(self, title, author,genre, year_released):
        self.title = title
        self.author = author
        self.genre = genre
        self.year_released = year_released
        self.times_borrowed= 0
        self.is_borrowed= False
        self.available=True

    def borrow_book(self):

        if self.is_borrowed:
            print('Book already borrowed')
            return

        print('Book borrowed')
        self.is_borrowed = True
        self.times_borrowed+=1
        self.available=False

    def return_book(self):

        if not self.is_borrowed:
            print('Book is already in the library')
            return

        print('Book returned')
        self.is_borrowed = False
        self.available =True

    def get_book_info(self) -> str:

        return ( "Book details: \n"
               f'Title: {self.title} \n'
               f'Author: {self.author} \n'
               f'Genre: {self.genre}\n'
               f'Year Published: {self.year_released}\n'
               f'Book Available: {self.available} \n'
               f'Times Borrowed: {self.times_borrowed}\n')

book_1 = Book("ACE", "Ace Ventura", "Documentary", 2009)
book_2 = Book("Spies", "Larry Vena", "Action", 2023)
book_3 = Book("Jigga Maroo", "lex lura", "Sci-FI", 2014)

print(book_1.get_book_info())
print(book_2.get_book_info())
print(book_3.get_book_info())


book_1.borrow_book()
print()

book_1.return_book()
book_1.return_book()
print()

print(book_1.get_book_info())












