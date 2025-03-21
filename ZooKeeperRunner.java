/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
  Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
  elephant.trumpet();
  elephant.eat();
  elephant.isNocturnal();

  Tiger tiger = new Tiger();
  tiger.swim();
  tiger.huntAlone();
  tiger.eat();
  tiger.getLifeSpan();
  tiger.isNocturnal();
  tiger.growl();
  tiger.roar();


  }
}