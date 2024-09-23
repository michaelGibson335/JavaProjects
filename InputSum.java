// Class: CS 5000
// Term: Fall 2024
// Name: Michael Gibson
// Instructor: Dr. Haddad
// Assignment: 4
// IDE: jGRASP

//import java userInputChoice class for user input
import java.util.Scanner;

public class InputSum {

    public static void main(String[] Args) {
        
        //create object of scanner class for user input
        Scanner userInputChoice = new Scanner(System.in);
        
        //boolean to set value whether loop should run again to true until it is changed to false
        boolean continueLoop = true;
        
        //while loop that runs the whole program while continueLoop is true
        while (continueLoop) {
            
            //set empty variable to store future user number input
            int userInputNumber;

            // Variable to keep track of the sum of user input numbers, it is intitally set to 0 and numbers will be added to it
            int sumOfUserInputNumbers = 0;

            //variable to store user input numbers a string
            String userInputtedNumbers = "";

            //Create prompt for user to enter numbers until sentinel value is entered which is -1
            System.out.print("Enter positive integers (-1 to quit): ");

            //While loop that will continue to read user input numbers until condition is false
            while (true) {
                
                //updates userInputNumber variable with a single number for each pass of the while loop
                userInputNumber = userInputChoice.nextInt();
                
                //tests if the userInput number is -1
                //if -1, then it will break out of the loop
                if (userInputNumber == -1) {
                    break;  
                }
                
                //if condition to test if the number is positive, if greater than 0, then it is positive
                if (userInputNumber > 0) {
                    
                    //if the number is positive, then the sumOfUserInputNumbers variable is incremented with the addition of the number
                    sumOfUserInputNumbers += userInputNumber;  

                    //This tests if the user input the first number so it does not have to enter a comma
                    if (userInputtedNumbers.length() == 0) {
                        userInputtedNumbers = "" + userInputNumber;
                    } else {
                        
                        //if it is not the first number, then it will enter a comma and then the subsequent number
                        //this is for the formatting purpose of how the assignment shows the numbers
                        userInputtedNumbers += ", " + userInputNumber;
                    }
                }
            }

            //Output the entered numbers and then the sum of the user input numbers
            System.out.println("\nEntered Numbers: \t " + userInputtedNumbers);
            System.out.println("The Sum: \t\t\t " + sumOfUserInputNumbers);

            //Output a question if the user would like to continue the program again
            System.out.print("\nWould you like to run this again? Enter 'y' or 'n': ");
            char choice = userInputChoice.next().charAt(0);  // Read the user's choice
            
            //if the choice is n, then the continueLoop variable is assigned false and the whole program terminates
            if (choice != 'y' && choice != 'Y') {
                continueLoop = false; 
            }
            
            //new line for visual purposes
            System.out.println();
        }

        //utilize close method of scanner class to exit the program
        userInputChoice.close();
        
        //output the program is closed
        System.out.println("Thank you for using this program, goodbye!");
    }
}
