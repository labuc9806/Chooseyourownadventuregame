/*
 * Launa Buche-Austin
 * This program will act like a 'choose your own adventure' game
 * March 09 2019
 */

package adventure.game;

import java.util.Scanner;

/**
 *
 * @author labuc9806
 */
public class AdventureGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in) ;
        
        String response1;
        String response2;
        String response3;
        String response4;
        String response5;
        
        System.out.println("Congratulations!");
        System.out.println ("You have been selected to join Space Mission X! ");
        System.out.println("You will be piloting our very first catstronaut to space,");
        System.out.println("all in a great effort to save Earth from a perilous threat of Space Dinosaurs!");
        System.out.println("So let's begin our adventure!");
        
        System.out.println("Choose your method of transportation. Taco/Racecar ?");
        response1 = keyedInput.nextLine();
        
        if (response1.equals("Taco"))
        {
            System.out.println("Everyone knows a cat's favourite method of transportation is by taco!");
            System.out.println("You 3, 2, 2 BLAST OFF into space!");
            System.out.println("You enter the depths of space, and pick up a transmission...");
            System.out.println("You listen to the transmission and find that it's a cry for help!");
            System.out.println("Answer it? yes/no? ");
            response2 = keyedInput.nextLine();
            if (response2.equals ("no"))
            { 
                System.out.println("You continue on your journey.");
                System.out.println("After days of space travel, the catstronaute encounters a strange object.");
                System.out.println("You decided to investigate, and stumble upon a flaoting bottle of...");
                System.out.println("Dr. Pepper?!");
                System.out.println("Do you wish to take the mystical powers of Dr. Pepper? yes/no?" );
                response3 = keyedInput.nextLine();
                if (response3.equals ("no"))
                {
                    System.out.println("You decide not to take the Dr. Pepper, heading straight towards your destination.");
                    System.out.println("Upon arriving, you encounter the army of space dinosaurs!");
                    System.out.println("Unsure of what orders to give the catstronaut,");
                    System.out.println("You tell him to utter the following words : ");
                    System.out.println("longcat/tacgnol?");
                    response4 = keyedInput.nextLine();
                    if (response4.equals ("tacgnol"))
                    {
                        System.out.println("Unfortunately you uttered the wrong words.");
                        System.out.println("The space dinosaurs approach, and the catstronaut dies.");
                        System.out.println("Mission Failed.");
                    }
                    else if (response4.equals ("longcat"))
                    {
                        System.out.println("Surprisingly, a giant long cat emerges from the void of space!");
                        System.out.println("Smothering all dinosaurs in its path, longcat takes everyone home safely");
                        System.out.println("With the world saved and catstronaut back home, the world is once again at peace. ");
                    }
                }
                else if (response3.equals("yes"))
                { System.out.println("You take the Dr. Pepper.");
                    System.out.println("Upon receiving it, the catstronaut takes a long while just to admire its beauty...");
                    System.out.println("UNTIL an ambush appears!");
                    System.out.println("Should the catstronaut sacrifice their beloved space drink? yes/no?");
                    response5 = keyedInput.nextLine();
                    if (response5.equals("yes"))
                    {
                        System.out.println("You throw the bottle of Dr.Pepper at the sneaky dinosaurs!");
                        System.out.println("They instantly explode");
                        System.out.println("Sad that he had to sacrifice his Dr. Pepper, catstronaut has an existential crisis.");
                        System.out.println("He decides to go home so he can spend every single second of the day with a Dr. Pepper by his side.");
                        System.out.println("All to mourn his friend.");
                        System.out.println("Unfortunately, this doesn't save the world, and the mission is a failure.");
                    }
                    else if (response5.equals("no"))
                    {
                        System.out.println("Instead of sacrificing the drink, the catstronaute decides to drink it in his last moments.");
                        System.out.println("He feels refreshed, but this doesn't do anything to help.");
                        System.out.println("The space dinosaurs win, and the catstronaut is never seen again");
                    }
                        
                    }
                    
                    
            }
             else if (response2.equals ("yes"))
            {
             System.out.println("Upon answering the transmission, you meet a lonely planet.");
             System.out.println("The lonely planet wants to befriend the catstronaut.");
             System.out.println("The catstronaut abandons mission, and enjoys the rest of his days with his stellar new friend.");
             }
            }
        
        else 
        {
            System.out.println("You attempt to launch the racecar into space!");
            System.out.println("Unfortunately, the racecar crashes back down the earth.");
            System.out.println("Mission Failed.");
            
        }
    }
    
}
