package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
@Test
    public void testCreateDog() {
    Date birthDate = new Date();
    Dog dog = AnimalFactory.createDog("Milo", birthDate);
    Assert.assertEquals("Milo", dog.getName());

}

    @Test
    public void testCreateCat() {
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat("Zula", birthDate);
        Assert.assertEquals("Zula", Cat.getCatName());

    }





}
