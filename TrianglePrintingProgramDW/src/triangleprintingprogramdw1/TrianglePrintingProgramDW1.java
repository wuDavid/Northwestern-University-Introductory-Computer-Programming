package triangleprintingprogramdw1;

public class TrianglePrintingProgramDW1//Beginning of class TrinaglePrintingDW1
{

    public static void main(String[] args)//Beginning of main TrianglePrintingDW1
    {
        for( int counter = 1; counter <= 10; counter++) // loop to create first star picture

        {

            for( int printer = 1; printer <=counter; printer++) // loop to print stars

            {
                System.out.print("*");//Prints an asterisk
            }

            System.out.println();//Prints a blank line

        }

        System.out.println();//Prints a blank line

        for( int counter2 = 1; counter2 <=10; counter2++) // loop to create second star picture

        {

            for( int printer2 = 10; printer2 >= counter2; printer2--) // loop to print stars

            {
                System.out.print("*");//Prints an asterisk
            }
            System.out.println();//Prints a blank line

        }

        System.out.println();//Prints a blank line

        for( int counter3 = 1; counter3 <=10; counter3++) // loop to create third star picture

        {

           for( int spaceControl1 = 2; spaceControl1 <= counter3; spaceControl1++) // loop to print stars
           {
                System.out.print(" ");//Prints a space
           }

            for(int printer3 = 10; printer3 >= counter3; printer3--)
            {
                    System.out.print("*");//Prints an asterisk
            }

            System.out.println();//Prints a blank line
        }
        System.out.println();//Prints a blank line

        for( int counter4 = 10; counter4 >=1; counter4--) // loop to create last star picture
        {

           for( int spaceControl2 = 2; spaceControl2 <= counter4; spaceControl2++) // loop to print stars
           {
                System.out.print(" ");//Prints a space
           }
            for(int printer4 = 10; printer4 >= counter4; printer4--)

            {
                    System.out.print("*");//Prints an asterisk
            }
            System.out.println();//Prints a blank line
        }

    }//End of main TrianglePrintingDW1

}//End of class TrianglePrintingDW1
