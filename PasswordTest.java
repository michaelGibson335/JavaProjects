// Class: CS 5000
// Term: Fall 2024
// Name: Michael Gibson
// Instructor: Dr. Haddad
// Assignment: 4
// IDE: jGRASP

//import Java Scanner class for user input
import java.util.Scanner;

public class PasswordTest {

    public static void main(String[] args) {
        
        //create an object of userInput class for user input
        Scanner userInput = new Scanner(System.in);
        
        //set boolean loopOverAgain to true to run the while loop continuously until user wants to cancel the program
        boolean loopOverAgain = true;
        
        //this is the outer while loop that loops over the whole program prompting for a user password to be tested until the condition is false
        while (loopOverAgain) {
        
            //prompt user for password input
            System.out.println("Please enter your password to be tested: ");
            
            //store user password input in a String because there are a mixture of characters and numbers, so Int type is not possible
            String userPasswordInput = userInput.next();

            //Create boolean variables to hold true/false depending on if individual characters of password have uppercase, lowercase, number, and special character
            //as required in Assignment Program #2
            boolean passwordHasLowerCase = false;
            boolean passwordHasUpperCase = false;
            boolean passwordHasDigit = false;
            boolean passwordHasSpecialCharacter = false;

            //I could not find another way to check the length of the password except using a method
            //test password Length first if the userPasswordInput is greater than or equal to the integer 7, which is 7 characters
            boolean passesTest = userPasswordInput.length() >= 7;

            //use if decision structure
            //if passesTest is true, then move to the for loop below
            if (passesTest) {
                
                //utilize for loop, this will run for as long as variable count is less than the length of the userPasswordInput, count is incremented by one for every
                //loop run
                for (int count = 0; count < userPasswordInput.length(); count++) {
                    
                    //set variable of char type to hold the individual character of the password as we loop through the different characters depending on the count
                    //where the area of the length of the userPasswordInput is at for each pass
                    char passwordIndividualCharacter = userPasswordInput.charAt(count);

                    //I could not find a way to test for lower case except to use a method
                    //test if any of characters is lowercase
                    //if true, set boolean for variable above to true
                    if (Character.isLowerCase(passwordIndividualCharacter)) {
                        passwordHasLowerCase = true;
                    }
                    
                    //I could not find a way to test for uppercase except to use a method
                    //test if any of characters is uppercase
                    //if true, set boolean for variable above to true
                    if (Character.isUpperCase(passwordIndividualCharacter)) {
                        passwordHasUpperCase = true;
                    }
                    
                    
                    //I could not find a way to test for digits except to use a method
                    //test if any of characters is Digit
                    //if true, set boolean for variable above to true
                    if (Character.isDigit(passwordIndividualCharacter)) {
                        passwordHasDigit = true;
                    }
                    
                    //I could not find a way to test for special Characters except to use a method
                    //test if any of characters is special type
                    //if true, set boolean for variable above to true
                    if (!Character.isLetterOrDigit(passwordIndividualCharacter)) {
                        passwordHasSpecialCharacter = true;
                    }
                }

               //if all above tests pass and all boolean variables of characters are set to True, then passesTest remains true
                passesTest = passwordHasLowerCase && passwordHasUpperCase && passwordHasDigit && passwordHasSpecialCharacter;
            }

            //Show the password that the user entered
            System.out.println("\nEntered Password:  " + userPasswordInput);
            
            //set if decision structure that if passesTest is true, then output the password is valid, else ouput that it is invalid
            if (passesTest) {
                System.out.println("Verdict: \t\t\t Valid Password");
            } else {
                System.out.println("Verdict: \t\t\t Invalid Password");
            }

            //Output question if the user would like to run the program again to enter a different password
            System.out.println("\nDo you want to test another Password? Please enter 'y' or 'n': ");
            
            //create variable of char type to get the first character index 0 which would be y or n depending on the user input 
            char userInputChoice = userInput.next().charAt(0);
            
            //use if decision structure to test if user input is n and assign false to loopOverAgain at the top to terminate the outer while loop
            //else the input will be assumed to be Y or y and the loopOverAgain variable will remain true and the loop will continue for user to input password
            if (userInputChoice != 'y' && userInputChoice != 'Y') {
                loopOverAgain = false;
            }
            
            //this outputs a new line for visual purposes
            System.out.println();
        }

        //Use close method of scanner class to close out the program after the user inputs 'n'
        userInput.close();
        
        //Output the program is completed 
        System.out.println("Thank you for using this Password tester, Goodbye!");
    }
}
