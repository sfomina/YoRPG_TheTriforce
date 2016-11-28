/*
 Gabi Newman,Sasha Fomina,  Christopher Yu
The Triforce 
APCS1 pd3
HW32 -- Ye Old Role Playing Game, Expanded 
2016-11-21
*/


/*=============================================
  class Ranger -- protagonist of Ye Olde RPG 
  =============================================*/
 
public class Ranger extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private String _name = "J. Doe";
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Ranger() {
	super();
	_strength = 75; 
	_defense = 30;
	_attack = 1;
        _accuracy = 0.7;
	_moves = new String[] {"shootArrow" , "throwBomb"};
	_type = "Ranger";
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Ranger ( String name ) {
	this();
	_name = name;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    //overwriting abstract method 
    public void specialize(){
	_attack = 1.35;
	_defense = 10; 
    }
     //overwriting abstract method 
    public void normalize(){
	_attack = 1;
	_defense = 30;
    }

    //~~~~~~~~~~~~~MOVES~~~~~~~~~~~~~~~~~~~
    public int shootArrow(Character opponent) {
	normalize();
	double shootAccuracy =_accuracy - 0.1;
	int shootStrength = _strength + 3;
	return super.attack(opponent, shootAccuracy, shootStrength);
    }
    
    public int throwBomb(Character opponent) {
	specialize();
	return shootArrow(opponent);
    }

 
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //overwriting abstract method in super 
    public String about(){
	return "Description of Ranger";
    }

}//end class Ranger

