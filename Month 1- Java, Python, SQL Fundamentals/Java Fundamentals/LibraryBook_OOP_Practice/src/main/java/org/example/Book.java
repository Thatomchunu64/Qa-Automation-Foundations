package org.example;

public class Book {

    private String title, author, genre;
    private int publishYear, timesBorrowed;
    private boolean isBorrowed;

    //CONSTRUCTOR
    public Book(String title, String author, String genre, int publishYear) {

        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
        this.genre = genre;

        timesBorrowed = 0;
        isBorrowed = false;
    }// End of constructor

    //end of method 1
    public void borrowBook() {

        if (isBorrowed) {
            System.out.println("Book is already borrowed.");
            return;
        } else {
            System.out.println("Book borrowed successfully.");
            isBorrowed = true;
            timesBorrowed++;//timesBorrowed = timesBorrowed + 1, THIS IS THE ALTERNATE VERSION
        }// end of else
    }//end of method

    //end of method 2
    public void returnBook() {

        if (!isBorrowed) {
            System.out.println("This book is already in the library.");
        } else {
            System.out.println("Book returned successfully.");
            isBorrowed = false;
        }//end of else

    }//end of method 2

    //method 3
    public void readBook() {

        if (isBorrowed) {
            System.out.println("Cannot read.\n" +
                    "Book has been borrowed.");

        } else {
            System.out.println("Reading Clean Code...");
        }// end of else
    }// end of method 3

    //return method
    public String getBookInfo() {

        return "Book Details: \n" +
                "Title: " + title +
                "\nAuthor: " + author +
                "\nYear Published: " + publishYear +
                "\nStatus: " + isBorrowed +
                "\nTimes Borrowed: " + timesBorrowed +
                "\n";
    }// END OF RETURN


}//END OF CLASS


