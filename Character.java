//by Troy carson
public class Character{
  int health;
  int dexterity;
  int strength;
  int ranged;
  int armorClass;
  public Character(){
    health = (int)math.random(20)+1;
    dexterity = (int)math.random(20)+1;
    strength = (int)math.random(20)+1;
    ranged = (int)math.random(20)+1;
    armorClass = dexterity;
  }
  public Character(int h,int d, int s, int r, int ac){
    health = r;
    dextarity = d;
    strength = s;
    ranged = r;
    armorClass = ac;
  }
  public getHealth(){return health;}
  public getDextarity(){return dexterity;}
  public getStrength(){return strength;}
  public getRanged(){return ranged;}
  public getArmorClass(){return armorClass;}
  
}