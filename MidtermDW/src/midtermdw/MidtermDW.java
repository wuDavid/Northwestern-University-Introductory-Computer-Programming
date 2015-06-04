// MidtermDW - Exercise 2.30
// Displays 5 separate digits from a 5 digit number
// David Wu
// July 5, 2012

package midtermdw;

import java.util.Scanner; // imports scanner class

public class MidtermDW // beginning of class MidtermDW
{
    
    public static void main(String[] args) // beginning of method Main
    {
        Scanner input = new Scanner (System.in); // creates Scanner object
        
        int number1; // declaring number1
        int counter = 0; // declaring counter
        int dividing = 10000; // declaring dividing
        int remainder = 10; // declaring remainder
                
        while (counter <= 1) // start of while loop
        {
        System.out.print ("Enter a 5 digit number: ");
        number1 = input.nextInt();
        
        // NESTED IF...ELSE FOR NUMBER LIMITS
        
        if (number1 < 10000)
            System.out.print ("Not a 5 digit number.\n");
        else
           if (number1 > 99999)
               System.out.print ("Not a 5 digit number.\n");
           else
              if (number1 > 10000)
            
        for (counter = 1; counter <= 5; counter++) // spaces out 5 digits
        {
            int result; // declaring result
            
            result = number1 / dividing; // arithmetic to separate digits
            dividing /= 10;
            result = result % remainder;
            
            System.out.printf ("%d   ", result); // prints separate digits
            
        } // ends for loop
        
        System.out.println(); // prints blank line
          
        } // ends while loop
        
    } // end method main
        
} // end class MidtermDW