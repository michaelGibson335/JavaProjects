//Class: CS 5000
//Term:  Fall 2024
//Name: Michael Gibson
//Instructor: Dr. Haddad
//Assignment: 2
//IDE Name: jGrasp




//import java Scanner class for user input
import java.util.Scanner;

//Creation of IncomeTax class
public class IncomeTax {
    public static void main(String[] args) {
        
        //Create object of scanner class for user input
        Scanner userInput = new Scanner(System.in);
        
        //create and initialize tax bracket variables to hold tax percentage values
        int taxBracket1 = 3;
        int taxBracket2 = 10;
        int taxBracket3 = 15;
        int taxBracket4 = 20;
        int taxBracket5 = 35;
        int taxBracket6 = 40;
        
        //Prompt user for annual income and store input in variable
        System.out.println("Please enter annual income."); 
        int annualIncome = userInput.nextInt();
        System.out.println(annualIncome);
        
        //Create and initalize calculated tax amounts based on tax brackets, also had to convert double to int using typecast
        //as I could not figure out another conversion method
        //the formula for calculating taxes is increasingly complex for each bracket
        // ****There appears to be a mistake in the assignment requirements, it says to tax 50k at 15%, which 50% is still in the 10% range, so this had to be replaced by
        //80K which is above the 70k threshold range for 10%.
        //basically the first 30k is at 3%, then 40k would be at 10%, then 80000 which is above 70k, would be at 15%, then 150k at 20, then numbers ranging between
        //300k to 900k is 35%, then 900k and up is 40k, the annual income subtracts the top end of the bracket and is added on all the previously calculated 
        //tax bracket dollar amount, then finally multiplied by the top end bracket percentage of whatever the number falls into 
        
        int taxAmount1 = (int) (annualIncome * 0.03);
        //the annual income subtracts the top end of the lower bracket and then multiplies it by the bracket percentage it is supposed to fall in
        //the same formula is used but with increasing number and brackets
        int taxAmount2 = (int) (30000 * 0.03 + (annualIncome - 30000) * 0.10);
        int taxAmount3 = (int) (30000 * 0.03 + 40000 * 0.10 + (annualIncome - 70000) * 0.15);
        int taxAmount4 = (int) (30000 * 0.03 + 40000 * 0.10 + 80000 * 0.15 + (annualIncome - 150000) * 0.20);
        int taxAmount5 = (int) (30000 * 0.03 + 40000 * 0.10 + 80000 * 0.15 + 150000 * 0.20 + (annualIncome - 300000) * 0.35);
        int taxAmount6 = (int) (30000 * 0.03 + 40000 * 0.10 + 80000 * 0.15 + 150000 * 0.20 + 600000 * 0.35 + (annualIncome - 900000) * 0.40);
        
        
        
      
        //Use if-else selection statement scheme for user input
       //output results of calculations based on annual income conditions
        if(annualIncome <= 30000) {
             System.out.println("Your income: \t\t\t$" + annualIncome);
             System.out.println("Your tax bracket: \t" + taxBracket1 + "%");
             System.out.println("Your tax amount: \t\t$" + taxAmount1);
        }
        else if(annualIncome <= 70000) {
             System.out.println("Your income: \t\t\t$" + annualIncome);
             System.out.println("Your tax bracket: \t" + taxBracket2 + "%");
             System.out.println("Your tax amount: \t\t$" + taxAmount2);
        }
         else if(annualIncome <= 150000) {
             System.out.println("Your income: \t\t\t$" + annualIncome);
             System.out.println("Your tax bracket: \t" + taxBracket3 + "%");
             System.out.println("Your tax amount: \t\t$" + taxAmount3);
        }
         else if(annualIncome <= 300000) {
             System.out.println("Your income: \t\t\t$" + annualIncome);
             System.out.println("Your tax bracket: \t" + taxBracket4 + "%");
             System.out.println("Your tax amount: \t\t$" + taxAmount5);
        }
         else if(annualIncome <= 900000) {
             System.out.println("Your income: \t\t\t$" + annualIncome);
             System.out.println("Your tax bracket: \t" + taxBracket5 + "%");
             System.out.println("Your tax amount: \t\t$" + taxAmount5);
        }
         else {
             System.out.println("Your income: \t\t\t$" + annualIncome);
             System.out.println("Your tax bracket: \t" + taxBracket6 + "%");
             System.out.println("Your tax amount: \t\t$" + taxAmount6);
        }
    }
}
        
       