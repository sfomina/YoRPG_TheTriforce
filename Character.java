/*
 Gabi Newman,Sasha Fomina,  Christopher Yu
The Triforce 
APCS1 pd3
HW32 -- Ye Old Role Playing Game, Expanded 
2016-11-21
*/

/*=============================================
  class Character -- superclass for combatants in Ye Olde RPG
  =============================================*/

public abstract class Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected int _hitPts;
    protected int _strength;
    protected int _defense;
    protected double _attack;
    protected double _accuracy;
    protected int _specialPts;
    protected String _type;
    protected String[] _moves;
    protected boolean _poisoned; 
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Character() {
	_hitPts = 125;
	_strength = 100;
	_defense = 40;
	_attack = 0.4;
	_accuracy = 0.85;
	_specialPts = 0;
	_type =  "Character";
	_moves = new String[3];
	_poisoned = false;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public int getDefense() { return _defense; }

    public String getName() {
	return "";
    }
    public int getSpecPts() { return _specialPts;} //when special points reach 150 a 3rd specialized move is revealed for each type pf character

    public String getMoves() {
	String retStr = "";
	retStr += "\t1: " + _moves[0] + "\n";
	retStr += "\t2: " + _moves[1] + "\n";
	if (_specialPts >= 150) {
	    retStr += "\t3: " +  _moves[2] + "\n";
	}
	return retStr;
    }

    public String getType(){ return _type;}

    public boolean getPoisoned() { return _poisoned;} 
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    /*=============================================
      boolean isAlive() -- tell whether I am alive
      post: returns boolean indicated alive or dead
      =============================================*/
    public boolean isAlive() {
	return _hitPts > 0;
    }


    /*=============================================
      int attack(Character, double, int) -- simulates attack on a Monster
      pre:  Input not null; takes adjusted valued for accuracy and strength; some moves are stronger some more
      accurate
      post: Prints "you missed" statement when applicable 
            Random effectiveness of the move impacts the damage dealt
            Calls incSpecPts() which depends on effectiveness to increase the _specialPts
            Calculates damage to be inflicted, flooring at 1, so long as the hit lands. 
            Calls opponent's lowerHP() method to inflict damage.
	    Returns damage dealt.
      =============================================*/
    public int attack( Character opponent, double moveAccuracy, int moveStrength ) {
	int damage;
	if (Math.random() < moveAccuracy) {
	    double effectiveness = Math.random();
	    incSpecPts(effectiveness);
	    damage = (int)( (moveStrength * _attack) - (opponent.getDefense() *effectiveness ));
	    //System.out.println( "\t\t**DIAG** damage: " + damage );
	    if ( damage < 0 )
		damage = 1;
	}
	else {
	    damage = 0;
	    if (getName().equals("")){
		System.out.print(" Ye Olde Monster missed.");
	    }
	    else {
		System.out.print(getName() + " missed."); 
	    }
	}
	
	opponent.lowerHP( damage );
	return damage;
    }//end attack


    /*=============================================
      void lowerHP(int) -- lowers life by input value
      pre:  Input >= 0
      post: Life instance var is lowered by input ammount.
      =============================================*/
    public void lowerHP( int damageInflicted ) {
	_hitPts = _hitPts - damageInflicted;
    }

    /*=============================================
     void incSpecPts(double) -- increases _specialpoints by a number from [0, 100)
     pre: 0<= Input < 1 
     post: special points  var is increased by by input ammount *100 and subtracted from 100.
     =============================================*/
    public void incSpecPts (double effective) {
	_specialPts += (int)(100 - effective * 100);
    }

    public void setPoisoned(boolean value){
	_poisoned = value;
    }
    
    // abstract void specialize()-abstract method ensures subclasses define it 
    public abstract void specialize();
    
    //public void normalize()-abstract method ensures subclasses define it
    public abstract void normalize();

    public abstract String about();
    
}//end class Character
