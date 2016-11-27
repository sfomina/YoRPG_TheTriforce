/*
 Gabi Newman,Sasha Fomina,  Christopher Yu
The Triforce 
APCS1 pd3
HW32 -- Ye Old Role Playing Game, Expanded 
2016-11-21
*/
 public class Rogue extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private String _name = "J. Doe";
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Rogue() {
	super();
	_strength = 80;
	//add _accuracy for reference Warrior  accuracy is 0.5
	//add _moves see Warrior onsturctor
	_type = "Rogue";
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Rogue( String name ) {
	this();
	_name = name;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     //overwriting abstract method 
     public void normalize(){
	 _attack = 0.4;
	 _defense = 40;
     } 

     //overwriting abstract method 
     public void specialize(){
	 _attack = 0.6;
	 _defense = 50;
     }

     //~~~~~~~~~~~MOVES~~~~~~~~~~~~~~~~~~

     //see warrior for refernce 
     
     //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


     
     public String about(){
	 return "Description of Rogue";
     } 
}//end class Rogue

