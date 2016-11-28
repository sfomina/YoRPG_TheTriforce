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
	_accuracy = 0.75;
	_moves = new String[] {"quickPunch","confuse", "sneakAttack"};
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
	 _specialPts = 0;
     }

     //~~~~~~~~~~~MOVES~~~~~~~~~~~~~~~~~~

     public int quickPunch(Character opponent) {
	 normalize();
	 double quickPunchAccuracy = _accuracy + 0.2;
	 int quickPunchStrength = _strength - 5;
	 return super.attack(opponent, quickPunchAccuracy, quickPunchStrength);
     }

     public int confuse(Character opponent){
	 normalize();
	 double confuseAccuracy = _accuracy - 0.3;
	 int confuseStrength = _strength + 5;
	 return super.attack(opponent, confuseAccuracy, confuseStrength);
     }

     public int sneakAttack(Character opponent){
	 specialize();
	 return quickPunch(opponent);
     }
     
     //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


     
     public String about(){
	 return "Agile and sneaky, but lacking in power";
     } 
}//end class Rogue

