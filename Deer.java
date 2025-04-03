/*
 * Activity 4.9.2
 */
public class Deer extends Hooved
{
  
  public void grunt()
  {
    System.out.println("The deer grunts.");
  }
  public Deer(String food, boolean nocturnal, 
    double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A deer arrives.");
  }
  public Deer() {

    System.out.println("A deer arrives.");
  }

  @Override
  public void speak() {
    grunt();
  }
}