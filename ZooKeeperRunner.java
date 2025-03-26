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

  ArrayList<Animal> zoo = new ArrayList<Animal>();

  /*
   * Modify your ZooKeeper program so that it stores animals in an ArrayList and then references them polymorphically to achieve different results depending on the type of the object at runtime.
Add a speak method to each class (other than ZooKeeperRunner) that calls its appropriate method. For example, the Giraffe’s speak method would call hum.
Add an ArrayList<Animal> to your ZooKeeperRunner class called zoo.
Add each type of Animal that has a sound to your zoo.
Iterate over each Animal. 
Call each Animal’s speak method.
Access the speak method using an Animal parameter.
In your runner class, after the closing curly brace of the main method, create a new method that you can use in main.
public static void hearTheAnimal(Animal currentAnimal)
{
}
For the method implementation, call the animal’s speak method.
In your main method, call hearTheAnimal a few times, passing an instance of Animal as a parameter.
   */
  }
}