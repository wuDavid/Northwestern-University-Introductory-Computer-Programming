// PollingDWu.java -- MAD 7.38
// Polls about world affairs
// David Wu
// July 11, 2012
package pollingdwu;

import java.util.Scanner;//Import Scanner

public class PollingDWu //Beginning of class PollingDW
{

    public static void main(String[] args) //start of main
    {

        Scanner input = new Scanner(System.in);// creates instance of scanner

        String[]topics = new String[5];//Creates array topics with 5 rows

        int[][]ratings = new int[5][11];//Creates array ratings with 5 rows and 11 columns
        int average = 0;//Creates int average and sets it to 0
        String maximumProblem = null;//Creates String maximumProblem and sets it to defualt
        String minimumProblem = null;//Creates String minimumProblem and sets it to defualt
        int maximumAverage = 0;//Creates int maximumAverage and sets it to 0
        int minimumAverage = 0;//Creates int minimumAverage and sets it to 0

        topics[0] = "Terrorism";                      //Sets the rows of array topics to the chosen topics
        topics[1] = "Endangered Animals";
        topics[2] = "Enviromental Pollution";
        topics[3] = "World Hunger";
        topics[4] = "Poverty";

        for(int column = 0; column <= 9; column++)//Creates for statement with the given variable, condition, and increment
        {
            System.out.println("\nNew Person taking Survey:");

            for(int row = 0; row < topics.length; row++)//Creates for statement with the given variable, condition, and increment
            {

                do//do while the input is greater than 10
                {
                    System.out.printf("How do you feel about . . . %s On a rank from 1 to 10\n" , topics[row]);//Prompt
                    ratings[row][column] = input.nextInt();//Sets teh particular element to the input
                }while(ratings[row][column]>10);

            }

            System.out.println();//Prints blank line

        }

        for(int averagePlacer = 0; averagePlacer<= 4; averagePlacer++)//Creates for statement with the given variable, condition, and increment
        {

            for(int row = 0; row <= 4; row++)//Creates for statement with the given variable, condition, and increment
            {

                for(int column = 0;  column <= 10; column++)//Creates for statement with the given variable, condition, and increment
                {

                    if(column==10)//Checks if column equals zero
                    {

                        average = average/10;//Set average to average divided by 10

                        ratings[row][10] = average;//Sets teh average column in ratings to that

                        average = 0;//Resets average

                    }

                    else//If the if statement is not true . . .
                    {

                        average += ratings[row][column];//Set average to the sum of the elements in a particular row

                    }

                }

            }

        }

        for(int row = 0; row <= 4; row++)//Creates for statement with the given variable, condition, and increment
        {
            System.out.printf("%-23s", topics[row]);//Print the topic name with format of 23 spaces

            for(int column = 0; column<=9; column++)//Creates for statement with the given variable, condition, and increment
            {
                System.out.printf("%-3d", ratings[row][column]);//Prints elements of ratings array with format of 3 spaces
            }

            System.out.println();//Prints blank line

        }
        for(int row = 0, theRow1 = row, theRow2 = row; row <=4; row++)//Creates for statement with the given variable, condition, and increment
        {

            if(ratings[theRow1][10]>maximumAverage)//Checks if the ratings element is greater than maximumAverage
            {
                maximumProblem = topics[theRow1];//Sets maximumProblem to the particular element in topics
            }

            maximumAverage = Math.max( maximumAverage, ratings[theRow1][10] );//Sets maximumAverage

            if(ratings[theRow2][10]<minimumAverage)//Checks if the ratings element is less than minimumAverage
            {
                minimumProblem = topics[theRow2];//Sets minimumProblem to the particular element in topics
            }

            minimumAverage = Math.min( minimumAverage, ratings[theRow2][10] );//Sets minimumAverage
        }

        System.out.printf("The most important problem is: %s\n With an average of: %d\n\n", maximumProblem, maximumAverage);//Prints the greatest average with the name of the issue

        System.out.printf("The least important problem is: %s\n With an average of: %d\n\n", minimumProblem, minimumAverage);//Prints the lowest average with the name of the issue. (PROBLEM WITH PRINTING LINE)

    }//End of main

} // end of class