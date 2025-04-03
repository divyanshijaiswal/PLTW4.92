public class Tiger extends Feline {
    public void huntAlone() {
        System.out.println("The tiger hunts alone.");
    }
    public void swim(){
        System.out.println("The tiger swims.");
    }
    public Tiger(String food, boolean nocturnal, 
    double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A tiger arrives.");

    }

    public Tiger() {
       System.out.println("A tiger arrives.");
    }


    @Override
    public void speak() {
    System.out.println("");
  }

}
