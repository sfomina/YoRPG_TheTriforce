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
	_accuracy = 0.65;
	_moves = new String[] {"bite", "pounce", "maul"};
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
 public int bite(Character opponent) {
	normalize();
	double biteAccuracy = _accuracy - 0.1;
	int biteStrength = _strength + 3;
	return super.attack(opponent, biteAccuracy, biteStrength);
    }

    public int pounce(Character opponent){
	normalize();
	double pounceAccuracy = _accuracy + 0.1;
	int pounceStrength = _strength - 3;
	return super.attack(opponent, pounceAccuracy, pounceStrength);
    }
    
    public int maul (Character opponent){
	specialize();
	return pounce(opponent); 
    }
      
     
     //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     public String about(){
	 return "Description of Trainer";
     }

     public static void main(String[] args){ }
     
}//end class trainer

