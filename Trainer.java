/*
 Gabi Newman,Sasha Fomina,  Christopher Yu
The Triforce 
APCS1 pd3
HW32 -- Ye Old Role Playing Game, Expanded 
2016-11-21
*/
 public class Trainer extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private String _name = "J. Doe";
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Trainer() {
	super();
	_strength = 110;
	_defense = 10;
	_attack = 1.3;
	_type = "Trainer";
	//add acuracy for reference Warrior accuracy is 0.5
	//add _moves see warrior constructor 
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Trainer( String name ) {
	this();
	_name = name;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     //overwriting abstract method 
     public void normalize(){
	 _attack = 1.3;
	 _defense = 10;
     } 

     //overwriting abstract method 
     public void specialize(){
	 _attack = 1.9;
	 _defense = 5;
     }

     //~~~~~~~~~~~~~~~~~~~~~MOVES~~~~~~~~~~~~~~~~~~

     //see warrior for reference 
     
     //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     public String about(){
	 return "Description of Trainer";
     } 
}//end class trainer

