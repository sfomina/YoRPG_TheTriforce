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
	_accuracy = 0.6;
	_type = "Mage";
	_moves = new String[] {"heal" , "poison", "shieldOfFire"};
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
     public int heal() {
	 int damage = 0;
	 _hitPts += (int)(Math.random() *100);
	 return damage;
     }

     public int poison(Character opponent) {
	 double poisonAccuracy = _accuracy - 0.2;
	 int poisonStrength = _strength + 10;
	 opponent.setPoisoned(true);
	 return super.attack(opponent, poisonAccuracy, poisonStrength);	 
     }

     public int shieldOfFire(Character opponent){
	 specialize();
	 return super.attack(opponent,_accuracy, _strength);
     }

     //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     public String about(){
	 return "Description of Mage";
     }

     public static void main(String[] args){ }
	 
}//end class Mage

