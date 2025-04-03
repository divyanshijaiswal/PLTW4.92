/*
 * Activity 4.9.2
 */

import java.util.ArrayList;

public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    

  Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
  elephant.trumpet();
  elephant.eat();
  elephant.isNocturnal();

  Tiger tiger = new Tiger("meat", true, 17.0);
  tiger.swim();
  tiger.huntAlone();
  tiger.eat();
  tiger.getLifeSpan();
  tiger.isNocturnal();
  tiger.growl();
  tiger.roar();

  Giraffe giraffe = new Giraffe("leaves", false, 25.0);
  giraffe.eat();

  Hippo hippo = new Hippo("leaves", false,.0);
  hippo.eat();

  Penguin penguin = new Penguin();
  penguin.fish();
  Owl owl = new Owl();
  owl.hunt();
  Owl owl2 = new Owl("mice,insects", true, 4.0);
  owl2.eat();
  
  System.out.println();
  Animal deer = new Deer();
  Animal elephanT = new Elephant();
  Animal giraffE = new Giraffe();
  Animal gorilla = new Gorilla();
  Animal monkey = new Monkey();
  Animal hippO = new Hippo();

  ArrayList<Animal> zoo = new ArrayList<Animal>();

  zoo.add(deer);
  zoo.add(elephanT);
  zoo.add(giraffE);
  zoo.add(gorilla);
  zoo.add(monkey);
  zoo.add(hippO);

  for(Animal animal : zoo) {
    animal.speak();
  }
  System.out.println("\nhearTheAnimal method:");
  hearTheAnimal(deer);
  hearTheAnimal(monkey);

  }

  public static void hearTheAnimal(Animal currentAnimal){ 
      currentAnimal.speak();
  }
}