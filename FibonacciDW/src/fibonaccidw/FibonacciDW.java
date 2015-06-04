package fibonaccidw;

import java.util.Scanner; // imports Scanner class

public class FibonacciDW // beginning of FibonacciDW class
{

    public static void main(String[] args) // beginning of method main
    {

        int n = 0; // declaring n

        FibonacciDW.fibonacci(n); // static method call
    }


    public static void fibonacci(int n) // static method fibonacci

    {

        double past = 0; // declaring past
        double present = 1; // declaring present
        double future = 0; // declaring future
        int counter;

        Scanner input = new Scanner (System.in); // creates new Scanner object


        System.out.print("Enter amount of fibonacci numbers, up to the highest accurate number, 83: "); // prompt

        n = input.nextInt(); // stores input in "n"

        System.out.printf ("%.0f, %.0f, ", past, present); // displays first 2 digits of sequence

        for (counter = 2; counter < n + 1; counter++) // for loop to get chosen number of digits
        {
            future = past + present; // arithmetic to change variables to the sequence

            past = present;

            present = future;

            System.out.printf("%.0f, ", present); // displays sequence

        } // end of for loop

        System.out.println();

        System.out.printf ("The %d digit is %.0f\n", counter, future); // displays last digit

    } // end of method fibonacci
} // end of class FibonacciDW