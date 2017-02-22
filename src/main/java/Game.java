public class Game {
    public static void main(String[] args) {        
       
      Prompter prompter = new Prompter();
      prompter.promptForAdmin();
      boolean isHit = prompter.promptForGuess();  

      while (isHit != true ) {
        isHit = prompter.promptForGuess();
      }
      if (isHit){
        prompter.displayWinMessage();
      }

    }
}

