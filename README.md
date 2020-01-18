# java-fundamentals

## Files

[Basics](/basics/Main.java)

/basics/Main.class
/basics/Main.java

README.md

## Methods
pluralize(); - accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.
flipNHeads(); - flips a coin intil heads reach the number of times required in the argument.
clock(); - continuosly updates time in println statement until stopped.
 
# Linter Application 

## Code 
[Linter](linter/src/main/java/linter/App.java)

## Method

public static String lintJavaScriptFile(Path filePath) <- Takes a file path and scans it for predetermined factors to report if found

## README
[README for Linter](linter/linterREADME.md)

# java-Basics Library
[Java Basics](/basiclibrary/src/main/java/basiclibrary/Library.java)
## Files


└── basiclibrary

    └─ src
    
        └── main
        
             └─ java / basiclibrary
             
                 └──Library.java
                 
        └── test
        
            └─java / basiclibrary
            
                └─LibraryTest.java
                
README.md


## Methods
roll(); <- Rolls a six sided dice N number of times reurning an array with the results of each roll.

containsDuplicates(); <- Checks an array for duplicate values and returns true if found, false if not.

average(); <- Adds all values of an array and returns the average of their total sum.

arrayOfArrays(); <- Iterates through and multi-dimensional array and its arrays and returns the array with the lowest average.

weatherAnalysis(); <- Takes a multi dimensional array representing a month, containing weeks containing daily temperatures, returns the highest, lowest and temperatures not found.

tally(); <- Takes an array list as an argument with the name of contenders representing votes, returns a string with the contender with the most votes. 


# Inheritance
Implementation of inheritance through a main SuperStore super class and child subclasses of Theater, Shop, and Restaurant. Each subclass implementing only their unique behavior but otherwise fully implementing Super. Next work will be implementing an interface and with it removing the requirement of a separate Review class.

[Inheritance](inheritance/src/main/java/inheritance)

## File Structure
``.


      └── java

          ├── main

          │   └── inheritance

          │       ├── Restaurant.class

          │       ├── Review.class

          │       ├── Shop.class

          │       ├── SuperStore.class

          │       └── Theater.class

          └── test

              └── inheritance

                  ├── RestaurantTest.class

                  ├── ReviewTest.class

                  ├── ShopTest.class

                  └── TheaterTest.class

``

## Methods

Currently each Sublass implements only its constructor to properly initialize unique behavior and super, as well as unique toString() method. Review currently makes use of overloaded constructors but will be reimplemented as an interface that will be adopted only by the Super class and implemented by subclasses.
