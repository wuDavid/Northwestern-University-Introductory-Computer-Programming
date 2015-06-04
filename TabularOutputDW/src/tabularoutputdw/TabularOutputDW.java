// TabularOutputDW -- Exercise 4.22
// Displays multiples of numbers in increments of 10, with a choosable repitition.
// David Wu
// June 29, 2012

package tabularoutputdw;

import java.util.Scanner; // uses class Scanner

public class TabularOutputDW // Beginning of class TabularOutputDW
{

    public static void main(String[] args) // Beginning of method main
    {
        Scanner input = new Scanner(System.in); // creates scanner object

        int number = 1; // storing integer number
        int lines; // storing integer lines
        int counter = 1; // storing integer counter

        System.out.print ("Enter amount of lines: "); // prompt
        lines = input.nextInt(); // reading value to integer lines

        System.out.println ("N   10*N   100*N   1000*N"); // header

        while (counter <= lines) // while loop
        {
            System.out.printf ("%d   %d     %d     %d\n", number, 10*number, 100*number, 1000*number);

            number += 1; // increasing value of number by 1

            counter++; // incrementic counter by 1
        }

    } // end of method main
} // end of class TabularOutputDW