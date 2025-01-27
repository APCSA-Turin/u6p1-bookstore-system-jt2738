package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
    private static String name;
    private static String Id;
    private Book[] books= new Book[5]; //instance variables
    //requires 1 contructor with two parameters that will initialize the name and id
    public User(String name, String Id){
        User.name=name;
        User.Id=Id;
    }
    // public  getName() {}
    public static String getName(){ //gets name of user 
        return name;
    }

    // public  setName() {}
    public static void setName(String newName){ //sets name of user 
        name=newName;
    }
    // public  getId() {}
    public static String getId(){ //gets ID of user 
        return Id;
    }

    // public void setId() {}
    public void setId(String newId){ //sets ID of user 
        Id=newId;
    }

    // public getBooks() {}
    public Book[] getBooks(){ // gets amount of books taken out by user
        return books;
    }

    // public setBooks() {}
    public void setBooks(Book[] newBook){ // sets amount of books taken out by user
        books=newBook;
    }

    // public String bookListInfo(){} //returns a booklist for the user, if empty, output "empty"
    public String bookListInfo(){
        String booklist=""; 
        for(int i=0; i<books.length;i++){
            if(books[i]!=null){ //checks if index i of books is null
                booklist+= books[i].bookInfo() + "\n"; // if not null, prints out book info of the book object
            }else{
                booklist+= "empty\n"; // if null just prints out empty
            }
        }
        return booklist; //returns info about a booklist for the user
    }

    // public String userInfo(){} //returns  "Name: []\nID: []\nBooks:\n[]"
    public String userInfo(){
        return "Name: " +getName() +"\nId: " + getId() + "\nBooks: \n" + bookListInfo(); //prints out user info
    }
       
}