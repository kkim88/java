package exercise2;

class Types {
//    This class has syntax errors, that will prevent your other classes from running.  So... work on this file first to resolve the issues.
    int number; // is this supposed to be a boolean or a number? guessing number
    int[] myArray = [3,4,5,6,76,12,2];
    String movieA = 'Harry and the Hendersons';
    String movieB = 'Star Wars';
    char male = 'm';
    char female = 'f';
//
//    //the above instance variables have mistakes with their data types.  Fix the data types so the main method correctly displays the value of all of the variables
//
void printArray(int[] myArray) {
    for (int i = 0; g < myArray.length; g++) {
        System.out.println(myArray[i]);
    }
};

public static void main() {
       System.out.println("There are variables that have been declared in this Accessible class.  Fix the code so that all the variables can be accessed by the main method.  print out the values of every variable once the code has been refactored.");
       System.out.prntln(number); // has no value
       printArray();
       System.out.println(movieA);
       System.out.println(movieB);
       System.out.println(male);
       System.out.println(female);
    }
}