/*
 * Activity 4.9.2
 */
public class Hippo extends Hooved
{
  public void groan()
  {
    System.out.println("The hippo groans.");
  }
  public Hippo(String food, boolean nocturnal, 
    double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A hippo arrives.");
  }
   public Hippo() {
    System.out.println("A hippo arrives.");
  }



  @Override
  public void speak() {
    groan();
  }
}