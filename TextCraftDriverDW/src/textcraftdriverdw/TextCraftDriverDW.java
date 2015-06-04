// TextCraftDriver.java - Final Project
// Final project - Text based game
// David Wu
// July 7, 2012

package textcraftdriverdw;

import java.util.Scanner; // imports scanner class

public class TextCraftDriverDW // start of class TextCraftDriverDW
{
    
    public static void main(String[] args) // start of main method
    {
        
        // INITIALIZING VARIABLES...
        int minerals = 50;
        int gas = 0;
        int supply = 5;
        int worker = 5;
        int army = 0;
        int army1 = 0;
        int counter = 0;
        int amountref = 0;
        int scvref = 1;
        int rax = 0;
        int refinery = 0;
        String build;
        
        // CREATING CLASS OBJECTS...
        Scanner input = new Scanner(System.in);
        
        TerranStart terranStart = new TerranStart();
        
        TextCraftAttack attack = new TextCraftAttack();
        
        // PRINTING STARTING BLOCK
        System.out.println("--TextCraft--");
        
        System.out.println("Please enter everything in lowercase.");
        
        System.out.println("Your race is terran, your opponent is zerg.");
        
        while (counter <= 100000) // 20 turns before opponent attacks
        {
            
        terranStart.begin(minerals, gas, supply, worker, army); // method call
        
        System.out.print("What would you like to do?\n"); // prompt 
        build = input.nextLine(); // store input in build
        
        //BUILDING SCVS
        if (build.equals("build scv"))
        {
            minerals -= 50;
            supply += 1;
            worker += 1;
        }
        
        if (build.equals("build 2 scvs"))
        {
            minerals -= 100;
            supply += 2;
            worker += 2;
        }
        
        if (build.equals("build 3 scvs"))
        {
            minerals -= 150;
            supply += 3;
            worker += 3;
        }
        
        if (build.equals("build 4 scvs"))
        {
            minerals -= 200;
            supply += 4;
            worker += 4;
        }
        
        if (build.equals("build 5 scvs"))
        {
            minerals -= 250;
            supply += 5;
            worker += 5;
        }
        
        // BUILDING REFINERY
        if (build.equals("build refinery"))
        {
            minerals -= 75;
            refinery++;
            
            System.out.println("How many SCVs mining?");
            amountref = input.nextInt();
            while (scvref <= amountref)
            {
                worker--;
                scvref++;
            }
        }
        
        // BUILDNG BARRACKS
        if (build.equals("build barracks"))
        {
            minerals -= 150;
            rax++;
        }
        
        // BUILDING MARINES
        if (build.equals("build marine"))
            if(rax == 0)
        {
            System.out.println("Requires barracks.");
        }
        
        if (build.equals ("build marine"))
               if (rax >= 1)
        {
            minerals -= 50;
            army += 50;
            supply += 1;
        }
        
        if (build.equals ("build 2 marines"))
               if (rax >= 1)
        {
            minerals -= 100;
            army += 100;
            supply += 2;
        }
        
        if (build.equals ("build 3 marines"))
               if (rax >= 1)
        {
            minerals -= 150;
            army += 150;
            supply += 3;
        }
        
        if (build.equals ("build 4 marines"))
               if (rax >= 1)
        {
            minerals -= 200;
            army += 200;
            supply += 4;
        }
        
        if (build.equals ("build 5 marines"))
               if (rax >= 1)
        {
            minerals -= 250;
            army += 250;
            supply += 5;
        }
        
        // CHOICE TO ATTACK OPPONENT
        if (build.equals ("attack"))
        {
            break;
        }
        
        // HAVE TO ATTACK IF SUPPLY IS OVER 200
        if (supply >= 200)
        {
            break;
        }
        
        // CALCULATING RESOURCE GAIN PER TURN
        minerals += worker*10;
        gas += amountref*10;
        
        // adds to counter, and opponent army size
        counter++;
        army1 += 50;
                
        } // end of while loop
        
        attack.attack(army, army1); // method call for end block
        
    } // end of method main
} // end of class TextCraftDriverDW