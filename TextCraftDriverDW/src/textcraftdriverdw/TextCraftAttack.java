// TextCraftAttack.java -- Final Project
// Decides who wins battle/game
// David Wu
// July 7, 2012

package textcraftdriverdw;

public class TextCraftAttack  // start of class TextCraftAttack
{
    public void attack(int army, int army1) // start of method attack
    {
        System.out.println("Attack!"); // print opponent attacks
    
        
        // IF STATEMENTS TO DECIDE WHO WINS THE GAME/BATTLE...
        if (army1 > army)
        {
            System.out.println("Your opponent has defeated your army!");
            System.out.println("Defeat!");
        }
        
        if (army > army1)
        {
            System.out.println("You defeated your opponent's army!");
            System.out.println("Victory!");
        }
        
        if (army1 == army)
        {
            System.out.println("Your armies were of equal strength.");
            System.out.println("Tie!");
        }
        
    } // end of method attack
    
} // end of class TextCraftAttack