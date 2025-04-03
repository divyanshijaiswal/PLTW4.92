public class Penguin extends Animal {
     public void fish() {
        System.out.println("The penguin fishes.");
    }

    public Penguin(String food, boolean nocturnal, double aveLifeSpan)
{
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A new penguin has arrived");
    
}
    public Penguin() {
        System.out.println("A new penguin has arrived");
    }




    @Override
    public void speak() {
    System.out.println("");
  }
}
