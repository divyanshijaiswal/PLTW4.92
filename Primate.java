/*
 * Activity 4.9.2
 */
public class Primate extends Animal
{
  public void forage()
  {
    System.out.println("The primate forages for food.");
  }
  public Primate(String food, boolean nocturnal, 
    double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A primate arrives.");
  }

   public Primate() {
    System.out.println("A primate arrives.");
  }



  @Override
  public void speak() {
    System.out.println("");
  }
}