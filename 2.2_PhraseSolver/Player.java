import java.util.Scanner;

public class Player{
  private String name;
  private int score;

  /* your code here - constructor(s) */ 
  public Player (){
    System.out.println("Player name?");
    Scanner scanner = new Scanner(System.in);
    name = scanner.nextLine();
    scanner.close();
    System.out.println(name + ", welcome to the game");
    score = 0;
  }
  public Player (String newName){
    name = newName;
    System.out.println(name + ", welcome to the game");
    score = 0;
  }

  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}