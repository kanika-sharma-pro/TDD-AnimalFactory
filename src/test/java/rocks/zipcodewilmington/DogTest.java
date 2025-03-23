package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;
import java.util.Optional;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    private long Integer;

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, 77);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testSetBirthDate () {
        Dog dog = new Dog(null, null, 77);
        Date newbirthDate = new Date();
        dog.setBirthDate(newbirthDate);
        Assert.assertEquals(newbirthDate, dog.getBirthDate());
    }

@Test
    public void testSpeak () {
    Dog dog = new Dog(null, null, 77);
    Assert.assertEquals("bark!", dog.speak());
    }

    @Test
    public void testEat() {
        Dog dog = new Dog(null, null, 77);
        dog.eat(new Food ());
        Assert.assertEquals(Optional.of(1), dog.getNumberOfMealsEaten());
    }
    @Test
    public void testGetId() {
        Dog dog = new Dog(null, null, 77);
        Assert.assertEquals((Integer)77, dog.getId());

    }





}
