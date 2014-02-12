//by Troy carson
public class Character{
  int health;
  int dexterity;
  int strength;
  int ranged;
  int armorClass;
  String name = new String; 
  public Character(String n){
    name = n;
    health = (int)math.random(20)+1;
    dexterity = (int)math.random(20)+1;
    strength = (int)math.random(20)+1;
    ranged = (int)math.random(20)+1;
    armorClass = dexterity;
  }
  public Character(int h,int d, int s, int r, int ac, String n){
    health = h;
    dextarity = d;
    strength = s;
    ranged = r;
    armorClass = ac;
    name = n;
  }
  public void getHealth(){return health;}
  public void getDexterity(){return dexterity;}
  public void getStrength(){return strength;}
  public void getRanged(){return ranged;}
  public void getArmorClass(){return armorClass;}
  
  public void addHealth(int additionalHealth){health += additionalHealth;}
  public void minusHealth(int subtractedHealth){health -= subtractedHealth;}
  public void addDexterity(int additionalDexterity){dexterity += additionalDexterity;}
  public void minusDexterity(intsubtractedDexterity){dexterity -= subtractedDexterity;}
}