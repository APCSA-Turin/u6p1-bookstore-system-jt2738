package com.example.project;

public class Book{
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity
    private String title; //instance variables
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;
    //requires 1 constructor with 5 arguments that intitialize the attribtues of the class.
    public Book(String title, String author, int yearPublished, String isbn, int quantity){
        this.title=title;
        this.author=author;
        this.yearPublished=yearPublished;
        this.isbn=isbn;
        this.quantity=quantity;
    }
    // public  getTitle() {}
    public String getTitle(){ //gets the title of the book
        return title;
    }

    // public setTitle() {}
    public void setTitle(String newTitle){ //sets the title of the book
        title=newTitle;
    }

    // public getAuthor() {}
    public String getAuthor(){ //gets the name of the author
        return author;
    }

    // public setAuthor() {}
    public void setAuthor(String newAuthor){ //sets the name of the author
        author=newAuthor;
    }

    // public getYearPublished() {}
    public int getYearPublished(){ //gets the year a book was published 
        return yearPublished;
    }

    // public setYearPublished() {}
    public void setYearPublished(int newYear){ //sets the year a book was published 
        yearPublished=newYear;
    }

    // public getIsbn() {}
    public String getIsbn(){ //gets the current Isbn for a book
        return isbn;
    }

    // public void setIsbn() {}
    public void setIsbn(String newIsbn){ //sets the Isbn for a book
        isbn=newIsbn;
    }

    // public int getQuantity() {}
    public int getQuantity(){ //gets the quantity for the current quantity of books
        return quantity;
    }

    // public void setQuantity() {}
    public void setQuantity(int newQuan){ //sets a new quantity of books
        quantity=newQuan;
    }

    // public  bookInfo(){} //returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []", aka book info
    public String bookInfo(){ 
        return "Title: " + getTitle() +", Author: "+ getAuthor() + ", Year: " + getYearPublished() + ", ISBN: " + getIsbn() + ", Quantity: " + getQuantity(); 
    }
       
}