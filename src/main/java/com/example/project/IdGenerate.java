package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    
    // //requires 1 private attribute String currentId. You must initialize it to 99
    private static String currentId= "99"; //static instance variable
    //requires one empty constructor
    public IdGenerate(){
    }

    // public  getCurrentId(){} 
    public static String getCurrentId(){ //returns current ID
        return currentId;
    }

    // public  reset(){} //must reset the currentId back to 99
    public static void reset(){   //resets current ID to 99
        currentId="99";
    }

    // public generateID(){} //generates a new id, when called it will increment the currentId by 1.. Hint pay attention to data type of currentId
    public static void generateID(){
        int newId=Integer.valueOf(currentId); // creates an int named new id and stores a casted version of current id into it
        newId++;  //value increments
        currentId=String.valueOf(newId); //new ID is casted as a string and stored as the current ID
    }

}