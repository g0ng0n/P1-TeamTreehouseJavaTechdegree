import java.util.Random;

public class Jar {

    private int max;
    private int itemNumber;
    private String type;
    private int misses;

    public Jar(String name, int max) {
      this.max=max;
      this.type = name;
      this.misses = 1;
    }
  
    public int getMax() {
        return this.max;
    }

    public String getType() {
        return this.type;
    }
  
    public int getMisses() {
        return this.misses;
    }
  
    public int getRemainingTries() {
      return max - this.misses;
    }
  
    public void fillTheJar(){
      Random random = new Random();
      this.itemNumber = random.nextInt(max) + 1;
    }
    
    public boolean guessLogic(int number) {
     
      boolean isHit = this.itemNumber == number;
      if (!isHit) {
        addMiss();
      }
      return isHit;
    }

    public String checkHighLow(int number) {
        if (number > this.itemNumber){
            return "Your guess is too high";
        }else{
            if (number < this.itemNumber){
                return "Your guess is too low";
            }
        }
        return "error";
    }

    private void addMiss(){
      this.misses ++;
    }

    public boolean checkIfGuessOverTheMax(int guessInput) {

        if (guessInput > this.max){
            return true;
        }else{
            return false;
        }
    }
}
