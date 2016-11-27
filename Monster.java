/*
 Gabi Newman,Sasha Fomina,  Christopher Yu
The Triforce 
APCS1 pd3
HW32 -- Ye Old Role Playing Game, Expanded 
2016-11-21
*/
 public class Monster extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private String _name = "J. Doe";
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Monster() {
	super();
	_hitPts = 150; 
	_strength = 20 + ((int) (Math.random() *45));
	_defense = 30;
	_attack = 1;
    }

     // Monster's only move functions according to the attack() defined in Character
    public int attack(Character opponent){
	 return super.attack(opponent, _accuracy, _strength);
     }

    //overwriting abstract method 
     public void normalize(){
	 _attack = 1;
	 _defense = 20;
     } 

     //overwriting abstract method 
     public void specialize(){
	 _attack =1 ;
	 _defense =20;
     }

     public String about(){
	 return "Description of Monster";
     } 
}//end class Monster
