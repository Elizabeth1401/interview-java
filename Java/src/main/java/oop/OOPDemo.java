package oop;

public class OOPDemo
{
  public static void main(String[] args)
  {
    Animal dog = new Dog("Buddy");
    Animal cat = new Cat("Whiskers");

    System.out.println(dog.speak());
    System.out.println(cat.speak());
  }
}
