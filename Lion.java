public class Lion extends Feline{
    public void huntInPack() {
        System.out.println("The lion hunts in pack.");
    }
    public Lion(String food, boolean nocturnal, 
    double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A lion arrives");
    }
}
