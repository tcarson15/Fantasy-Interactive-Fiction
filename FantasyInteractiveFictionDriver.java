//by Troy Carson
import java.util.Scanner; 
public class FantasyInteractiveFictionDriver{
  public static void main(String [] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("You there, Knight! What is your name?");
    String userName = keyboard.nextLine();
    System.out.println("Aye, I've heard of you, you've been trying to gain influence throughout the kingdom. I'm Captain Myzard of the Guard, and if you want to to make a real name for yourself, you can start by going over to Shatter Sands Tower to the East of here, trouble with bandits I hear, and we havn't the men to spare with the Civil War on our doorsteps, so we need our men in the cities to keep order and remind the people the King rules these lands.");
    System.out.println("");
    System.out.println("Enter '1' to agree to go to Shatter Sands Tower. Enter '2' to ask more about the rebellion. Enter '3' to attack Captain Myzard and declare yourself with the rebellion.");
    if (keyboard.nextLine() == 1){
    }
    if (keyboard.nextLine() == 2){
      System.out.println("Well I doubt I could tell you anything you havnt already heard. In short, Darion the Dissolute decided he wanted to rise up against the King in rebbellion, and several thousand smallfolk decided to join him in defiance. No one knows who exactly this 'Darion' is, some say he was a trusted advisor to the King or a General turned renegade. Either way, he's just a man, and a man who needs to die. And it's the Legion that's gonna see to it!");
      System.out.println("");
      System.out.println("Enter '1' to agree to go to Shatter Sands Tower.Enter '2' to attack Captain Myzard and declare yourself with the rebellion.");
    }
    if (keyboard.nextLine() == 3){
    }
  }
  public static boolean combat(Character p1, Character p2){
    boolean hasWon = false;
    boolean turn = (p1.getDextarity+(int)math.random(20)+1)>(p2.getDextarity+(int)math.random(20)+1); //determine which player attacks first
    while(!hasWon){
      if(turn){
        int move = p1.selectMove;
        if(move==1){ //melee
          if((int)math.random(20)+1>=p2.getArmorClass) p2.minusHealth(p1.getStrength);
        }
        else if(move==2){ //ranged
          if((int)math.random(20)+1>=p2.getArmorClass) p2.minusHealth(p1.getRanged);
        }
        else if(Move==3){ //skip
        turn = false;
        }
        
        if(!turn){
        int move = p1.selectMove;
        if(move==1){ //melee
          if((int)math.random(20)+1>=p1.getArmorClass) p1.minusHealth(p2.getStrength);
        }
        else if(move==2){ //ranged
          if((int)math.random(20)+1>=p1.getArmorClass) p1.minusHealth(p2.getRanged);
        }
      }
    }
  }
}
}