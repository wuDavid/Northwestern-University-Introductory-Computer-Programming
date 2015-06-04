// RectangleClassDW.java -- Exercise 8.4
// Displays area and perimeter based on input of length and width
// David Wu
// July 10, 2012

package rectangleclassdw;

import java.util.Scanner; // imports Scanner class

public class RectangleClassDW // start of class RectangleClassDW
{

    public static void main(String[] args) // start of method main
    {
        Scanner input = new Scanner (System.in); // create scanner object

        // INITIALIZING VARIABLES

        int counter = 0;
        float length = 0;
        float width = 0;

        // WHILE TO GET RIGHT NUMBERS

        while (counter < 1)
        {
        System.out.println("Enter length of rectangle (0 to 20): "); // PROMPT
        length = input.nextFloat(); // STORE IN LENGTH


        // GET RIGHT NUMBER RANGE...
        if ((length > 20) || (length < 0))
        {
            System.out.println("Not in the number range.");
        }

        else if ((length <= 20) || (length >= 0))
        {
            counter++;
        }
        }

        counter = 0;

        // WHILE TO GET RIGHT NUMBERS...
        while (counter < 1)
        {
        System.out.println("Enter width of rectangle (0 to 20): "); // prompt
        width = input.nextFloat(); // stores input in width

        // LENGTH AND WIDTH BOUNDARIES

        if ((width > 20) || (width < 0))
        {
            System.out.println("Not in the number range.");
        }

        else if ((width <= 20) || (width >= 0))
        {
            counter++;
        }
        }

        Rectangle display = new Rectangle(length, width);

        // CALCULATE AREA AND PERIMETER OF RECTANGLE...

        float area;

        area = display.getLength()*display.getWidth();

        System.out.printf("The area is: %4.1f units squared.\n", area);

        float perimeter;

        perimeter = (2*display.getLength())+(2*display.getWidth());

        System.out.printf("The perimeter is: %2.1f units.\n", perimeter);

        } // end of method main

} // end of class RectangleClassDW