import oop.Cat;
import oop.Dog;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest
{
  @Test
  public void testDogSpeak() {
    Dog dog = new Dog("Buddy");
    assertEquals("Buddy says: Woof", dog.speak());
  }

  @Test
  public void testCatSpeak() {
    Cat cat = new Cat("Whiskers");
    assertEquals("Whiskers says: Meow", cat.speak());
  }

}