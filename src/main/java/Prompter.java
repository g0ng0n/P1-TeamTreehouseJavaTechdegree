import java.util.Scanner;

class Prompter {
  private Jar jar;
  
  public Prompter() {
         
  }
  
   public void promptForAdmin() {
    
    try {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("What type of item ?");
      String type = scanner.nextLine();
      int max = 0;
      System.out.println("What is the maximum amount of " + type);
      max = Integer.parseInt(scanner.nextLine());
      if (max <=0){
        System.exit(0);
      }

      this.jar = new Jar(type, max); 
      this.jar.fillTheJar();


    } catch(IllegalArgumentException iae) {
      System.out.println(iae.getMessage());
    }  
  }
  
  public boolean promptForGuess() {
    boolean isHit = false;
    Scanner scanner = new Scanner(System.in);

    if (this.jar.getMax() ==1){
      System.out.println("How many " + jar.getType() + " that you think are in the Jar? Pick a number between 1 and " + this.jar.getMax() + " attempt");
    }else{
      System.out.println("How many " + jar.getType() + " that you think are in the Jar? Pick a number between 1 and " + this.jar.getMax() + " attempts");
    }
    String guessInput = scanner.nextLine();
       
    try {
      int guessNumber = Integer.parseInt(guessInput);
      isHit = this.jar.guessLogic(guessNumber);
    } catch(IllegalArgumentException iae) {
      System.out.println(iae.getMessage());
    }
    
    return isHit;
  }
  
  public void displayLoseMessage() {
    System.out.println("You Lose");
    
  }
                      
  public void displayWinMessage() {

    if (this.jar.getMisses() ==1){
      System.out.println("You got it in " + this.jar.getMisses() +  " attempt");
    }else{
      System.out.println("You got it in " + this.jar.getMisses() +  " attempts");
    }

  }
  
}