/*
 Gabi Newman,Sasha Fomina,  Christopher Yu
The Triforce 
APCS1 pd3
HW32 -- Ye Old Role Playing Game, Expanded 
2016-11-21
*/


/*=============================================
  class YoRPG -- Driver file for Ye Olde Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Warrior, Monster
  =============================================*/

import java.io.*;
import java.util.*;

public class YoRPG 
{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Warrior and a Monster will be instantiated...
    private Character pat;   //Is it man or woman?
    private Monster smaug; //Friendly generic monster name?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG() {
	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- facilitates info gathering to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Warrior
      =============================================*/
    public void newGame() {

	String s;
	String name = "";
	s = "Welcome to Ye Olde RPG!\n";

	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	s = "Intrepid traveler, what doth thy call thyself? (State your name): ";
	System.out.print( s);

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }

	//instantiate the player's character
	s = "Choose a type of character: \n";
	s+= "\t1 Warrior\n";
	s+= "\t2 Mage\n";
	s+= "\t3 Rogue\n";
	s+= "\t4 Ranger\n";
	s+= "\t5 Trainer\n";
	System.out.print(s);
	try{
	    int type = Integer.parseInt(in.readLine());
	    if (type == 1){
		pat = new Warrior( name );
		System.out.print("You are now a Warrior: " + pat.about());
	    }
	    if (type == 2){
		pat = new Mage( name );
		System.out.print("You are now a Warrior: " + pat.about());
	    }
	    if (type == 3){
		pat = new Rogue( name );
		System.out.print("You are now a Warrior: " + pat.about());
	    }
	    if (type == 4){
		pat = new Ranger( name );
		System.out.print("You are now a Warrior: " + pat.about());
	    }
	    if (type == 5){
		pat = new Trainer ( name );
		System.out.print("You are now a Warrior: " + pat.about());
	    }
	}
	catch ( IOException e ) { }
	

    }//end newGame()


    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Warrior pat has been initialized
      post: Returns true if player wins (monster dies).
      Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn() {

	int i = 1;
	int d2;
	int d1 = 0;

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
	else {
	    System.out.println( "\nLo, yonder monster approacheth!" );

	    smaug = new Monster();

	    while( smaug.isAlive() && pat.isAlive() ) {
		while (smaug.getPoisoned()){
		    smaug.lowerHP(d1);
		    d2 = smaug.attack( pat );
		    System.out.println( "\n Poison still in effect - the poison of " + pat.getName() + " dealt" + d1 + " points of damage.");
		    System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
				    " for " + d2 + " points of damage.");
		    smaug.setPoisoned(false);
		    
		}
		try {
		    System.out.println( "\nYour Move:" );
		    System.out.println(pat.getMoves());
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }

		//Warrior moves
		if (pat.getType() == "Warrior" && i == 1){
		    d1 = ((Warrior) pat).slash(smaug);}
		
		else if (pat.getType() == "Warrior" && i == 2) {
		    d1 = ((Warrior) pat).charge(smaug);}

		else if (pat.getType() == "Warrior" && i == 3){
		    d1 = ((Warrior) pat).kingArthurSlam(smaug);}

		//Mage Moves 
		else if (pat.getType() == "Mage" && i == 1) {
		    d1 = ((Warrior) pat).heal();}
		
		else if (pat.getType() == "Mage" && i == 2) {
		    d1 = ((Warrior) pat).posion(smaug);}

		else if (pat.getType() == "Mage" && i == 3) {
		    d1 = ((Warrior) pat).shieldOfFire(smaug);}
		

		//INSERT MOVES of OTHER CLASSES
		    

		d2 = smaug.attack( pat );

		System.out.println( "\n" + pat.getName() + " dealt " + d1 +
				    " points of damage.");

		System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
				    " for " + d2 + " points of damage.");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde monster down, but " +
				    "with its dying breath ye olde monster. " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead." );
		return false;
	    }
	}//end else

	return true;
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void main( String[] args ) {

	//As usual, move the begin-comment bar down as you progressively 
	//test each new bit of functionality...

	//loading...
	YoRPG game = new YoRPG();

	int encounters = 0;

	while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	}

	System.out.println( "Thy game doth be over." );
	/*================================================
	  ================================================*/
    }//end main

}//end class YoRPG




/*=============================================
  =============================================*/
