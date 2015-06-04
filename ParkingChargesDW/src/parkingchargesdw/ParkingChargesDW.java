// ParkingChargesDW.java -- Exercise 6.8
// Calculates parking charges
// David Wu
// July 4, 2012

package parkingchargesdw;

import java.util.Scanner;// imports scanner class

public class ParkingChargesDW // start of class ParkingChargesDW
{

    public static void main(String[] args) //Beginning of main ParkingChargesAS
    {

        double total = 0;//Creates a double called total and sets it to 0
        
        total = calculateCharges(total);//Sets total to the value calculateCharges returns
        
    } // End of main ParkingChargesAS
    
    public static double calculateCharges(double total)//Beginning of method calculateCharges
    {
        
        double time = 0; // Creates double called hour and sets it to 0
        double charge = 0; // Creates double called totalday and sets it to 0
                
        time = calculateHour(time); // Sets hour to the value calculateHour returns
        
        if (time >= 1) // Creates an if statement with a condition of hour being greater than or equal to 1
            
        total = total(total, charge, time); // Sets total to the value that calculateTotal returns
        
        else // If the if statement is not true . . . 
        {     
            System.out.println("...that's impossible.");//Prints a statement for hour = 0
            calculateCharges( total );//Runs calculateCharges again
        }
        
        return total;//Returns the value total to main
        
    } //End of method calculateCharges
    
    public static double calculateHour( double time )// start of method calculateHour
    {
        
        Scanner input = new Scanner(System.in);// creates object of scanner
        
        do // do statement 
        {     
            System.out.println("How many hours?"); //Prompt
            time = input.nextInt();//Sets hour to the number the user input
        }
        
        while (time > 24); // loop when hour is > 24
        
        return time; // returns hour's value
        
    }//End of method calculateHour
    
    public static double total (double total, double charge, double time)//Beginning of method calculateTotal
    {
        
        String choice = "nothing"; // Creates String called choice and sets it to nothing
        
        if (time <= 3) //If statement with condition of hour being less than or equal to 3
            charge += 2.00;//Adds two to totalDay
        
        if (time > 3)//If statement with codition of hour being greater than 3
        {
            
            charge += 2.00; // +2 to charge
            
            charge = charge + ((time - 3)*.50);//Sets total day to (hour - 3)*.50
  
            if (charge > 10.00)//If the total charge is greater than 10.00 . . .
                charge = 10.00;//Set it to 10.00
                
        }
                
        total += charge;//Set total to total plus totalDay
        
        System.out.printf("Your total is: $%.2f.\n\nIncome is: $%.2f.\n\n", charge, total);//Displays total and totalDay
        
        choice = choice( choice );//Sets choice to the value returned by calculateChoice
        
        if (choice.equals("Yes")) // if statement is yes
            calculateCharges( total ); // loop again
        
        else
            System.out.println("Application Stopped");//Print statement
        
        return total; // returns value total
        
    } // end of method total
    
    public static String choice (String choice)// start of method choice
    {
        Scanner input = new Scanner(System.in); // creates scanner object
        
        do
        {
            System.out.println("Another choice? Yes or No."); // Propmts
            choice = input.next(); // answer is stored to choice 
        }
        
        while(choice.equals("Yes") == false && choice.equals("No") == false);
        
        return choice; // returns value choice
        
    }//End of method calculateChoice
    
} 


 // end of class ParkingChargesDW