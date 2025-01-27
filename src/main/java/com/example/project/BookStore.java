package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book[] books= new Book[5]; //instance varis "books" and "users"
    private User[] users= new User[10];
    //requires 1 empty constructor
    public BookStore(){ //empty constructor
    }
    // public getUsers(){}
    public User[] getUsers(){ //getter method for users
        return users;
    }

    // public setUsers(){} 
    public void setUsers(User[] newUsers){ //setter method for users
        users= newUsers;
    }

    // public  getBooks(){}
    public Book[] getBooks(){ //getter method for books
        return books;
    }

    // public void addUser(User user){} 
    public void addUser(User user){ // adds a user
        int i=0;
        while(users[i]!=null){ // checks if index i of user is null
            i++;               
        }
        users[i]=user; // once it finds the null index, it adds the user at that index 
    } 
    // public void removeUser(User user){}
    public void removeUser(User user){ //removes a user
        User[] newUsers=new User[users.length];
        for(int i= 0, k=0; i<users.length;i++){
            if(users[i]!=null){ //checks if the index i of user is null
            if(!users[i].equals(user)){ //checks if index is equal to user
                newUsers[k]=users[i]; // if it is not equal to user, new users's index k will increment and have the same value as the object of users[i]
                 k++;
            }
        }
        }
    users=newUsers; //updates users with new users

}
    // public void consolidateUsers(){}
    public void consolidateUsers(){ //places all null objects at the end of the list
       User[] newConList= new User[users.length];
       int k=0;
       for(int i=0; i< users.length;i++){
        if(users[i]!=null){ 
            newConList[k]=users[i]; // first half of new list ONLY has non null objects
            k++;
        }
       }
       int nullStart=k+1; //tracks where list last left off at a null object
       for(int i=0; i<users.length;i++){
        if((users[i]==null)&&newConList.length!=users.length){
            newConList[nullStart]=users[i]; // second hald of new list ONLY has null objects 
        }
       }
       users=newConList; // updates users list to newConList
       
    }

    // public void addBook(Book book){}
    public void addBook(Book book){ //adds book to Book class
        int i=0;
        while(books[i]!=null){ // checks if index is null
            i++;
        }
        books[i]=book; // if index is null, that index will have the book added to it
    
        
    }

    // public void insertBook(Book book, int index){}
    public void insertBook(Book book, int index){ //inserts a book at a certain index, length is kept the same
        Book[] newbooks=new Book[books.length];
        for(int i=0; i<index;i++){
            newbooks[i]=books[i]; // stops once i reaches the index number given
        }
        newbooks[index]=book; // inserts book at index
        for(int i=index+1; i<newbooks.length;i++){ 
            newbooks[i]=books[i-1]; // puts in the rest of the books from the original books list, but books goes from i-1 in order to "shift"
        }
        books=newbooks; // books is changed to new books
    }

    // public void removeBook(Book book){}
    public void removeBook(Book book){ //removes a book from the Book class
        for(int i=0; i<books.length;i++){
            if(books[i].equals(book)){
                books[i].setQuantity(books[i].getQuantity()-1);//decrements quantity of books each time the remove method is called on it
            }
            if (books[i].getQuantity()==0) { //checks if quantity of said book reaches 0
                Book[] newBookList= new Book[books.length-1];
                for (int j = 0, k = 0; j < books.length; j++) {// decalres j and k: j is to keep track of the books' length, k for the newBookList length
                    if (j != i) {// k increments and book[j] is put into that index unless j = i
                        newBookList[k++] = books[j];
                    }
                }
                books = newBookList;
            }
        }
    }
       
    // public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes
    public String bookStoreBookInfo(){
        return "Books: " + books + " Users: " + users;
    }

    // public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes

}