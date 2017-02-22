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
     
      boolean isHit = itemNumber == number;
      if (!isHit) {
        addMiss();
      } 
      return isHit;
    }
  
    private void addMiss(){
      this.misses ++;
    }
  
}
