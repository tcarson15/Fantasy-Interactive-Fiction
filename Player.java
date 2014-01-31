//Troy Carson

public class Player
{
  public int roll(){
    int die1 = (int)((Math.random()*20)+1); //rolls the two 20 sided dice 
    int die2 = (int)((Math.random()*20)+1);
    int dieTotal = (die1 + die2); //combines their value
    return dieTotal; 
  }
}