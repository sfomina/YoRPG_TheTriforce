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
	_accuracy = 0.5;
	_type = "Warrior";
	 _moves = new String[]  {"slash", "charge" ,"kingArthurSlam"}; 
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
    //~~~~~~~~~~~~~~~~~~~MOVES ~~~~~~~~~~~~~~~~~~~~~
    public int charge(Character opponent) {
	normalize();
	double chargeAccuracy = _accuracy - 0.2;
	int chargeStrength = _strength + 5;
	return super.attack(opponent, chargeAccuracy, chargeStrength);
    }

    public int slash(Character opponent){
	normalize();
	double slashAccuracy = _accuracy + 0.2;
	int slashStrength = _strength - 5;
	return super.attack(opponent, slashAccuracy, slashStrength);
    }
    
    public int kingArthurSlam (Character opponent){
	specialize();
	return charge(opponent); 
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void specialize() {
	_attack = 0.75;
	_specialPts = 0;
    }
    public void normalize(){
	_defense = 40;
	_attack = 0.4;
    }
    public static void main (String[] args) {
	Character john = new Warrior();
	System.out.println(john.getMoves());
    }
}//end class Warrior

