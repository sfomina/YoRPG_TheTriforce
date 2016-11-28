
# YoRPG_TheTriforce
##Feature Additions
_In Character:_


-accuracy is a new instance variable. It is used within the attack method to determine whether the hit lands or misses and does 0 damage
-specialPTS is a new instance variable. Once special points reach 150, a special move unique to each subclass or type of character is revealed; this move is more powerful than the others. specialPts starts as 0 and the increased by the method incSPecPTS(double effective) - effectiveness is determined by Math.Random with each attack. the SPecialize method in each class requires spcialPts to be at least 150 and once it is used specialPts is set back to 0.
- The smaller the effectiveness the greater the damage; this is a bit counterintuiative
-_moves is an array of Strings and is a new instance variable, consisting of 3 strings that r the names of each move unique to the type of character. getMoves() lists all these moves in a formatted, numbered list
- poisoned is a new instance variable; only Monsters and MAges uses it. There is setPoison(boolean) and getPoison()
 - type is a nw instance vars that contains the Stirng form of the name of the current class
 
 _Subclasses:_
 
- **Warrior**
 1. slash - more accurate, weaker 
 2. charge - less accurate, stronger
 3. special move is kingArthurSlam - like charge but even stronger

-**Mage**

1.heal - increases health
2. poison - does damage on Monster and decreases damage Monster does on Character; not veryy accurate but lasts two turns
3. special move is shieldofFire - the attack is not that great, but boosts defense considerabely

-**Rogue**

1. quickpunch - accurate, not too strong
2. confuse - strong, not very accurate
3. special move is sneak attack - like quickpunch except with higher attack

-**Ranger**

1. shootArrow
2. catapult
3. special - throwBomb

- **Trainer**

_In YoRPG:_                                                                                                                                                   
-Instead of choose yay or nay you choose your move; special move pops up when special points reach 150
-Extra while loop because the poison move lasts two turns

##Instructions
Just do what you are prompted to do by the terminal/command prompt
WHen the special moves pop up they will be the 3rd option in hte list. Note that you will probably only get to use it once per game bc you must accumulate 150 special points