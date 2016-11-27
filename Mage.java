/*
 Gabi Newman,Sasha Fomina,  Christopher Yu
The Triforce 
APCS1 pd3
HW32 -- Ye Old Role Playing Game, Expanded 
2016-11-21
*/
 public class Mage extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private String _name = "J. Doe";
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Mage() {
	super();
	_strength = 60;
	_attack = 0.7;
	_defense = 50;
	//add _accuracy, for reference Warrior accuracy is 0.5
	_type = "Mage";
	// add _moves; see Warrior constructor 
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Mage( String name ) {
	this();
	_name = name;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
     
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     //overwriting abstract method 
     public void normalize(){
	 _attack = 0.7;
	 _defense = 50;
     } 

     //overwriting abstract method 
     public void specialize(){
	 _defense = 70;
     }

    //~~~~~~~~~~~~~~~~~~~~~~~MOVES~~~~~~~~~~~~~~~~~~~~~~~~~~

     //should be 3 of them see warrior for reference 

     //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     public String about(){
	 return "Description of Mage";
     } 
}//end class Mage

