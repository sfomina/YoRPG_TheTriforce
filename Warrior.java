/*
 Gabi Newman,Sasha Fomina,  Christopher Yu
The Triforce 
APCS1 pd3
HW32 -- Ye Old Role Playing Game, Expanded 
2016-11-21
*/


/*=============================================
  class Warrior -- protagonist of Ye Olde RPG
                          (_)           
  __      ____ _ _ __ _ __ _  ___  _ __ 
  \ \ /\ / / _` | '__| '__| |/ _ \| '__|
   \ V  V / (_| | |  | |  | | (_) | |   
    \_/\_/ \__,_|_|  |_|  |_|\___/|_|   
  =============================================*/
 
public class Warrior extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private String _name = "J. Doe";
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Warrior() {
	super();
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Warrior( String name ) {
	this();
	_name = name;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public String about(){
	return "Strong, not very agile, low defenses";
    }
    public void specialize() {
	_defense = 20;
	_attack = 0.75; 
    }
    public void normalize(){
	_defense = 40;
	_attack = 0.4;
    }
}//end class Warrior

