package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
private String expected;
private Integer Id;


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }


    @Test
    public void setName() {
        //given
        String givenCatName = "nancy";

// constructor
        Cat cat = new Cat ("nancy",null,null);
        //when
        String GetCatName = cat.getName();

        //then
        Assert.assertEquals(givenCatName, GetCatName);



    }
    @Test
    public void CatId() {
        //given
        Integer givenID = 25;
        //constructor
       Cat cat = new Cat(null, null , 25);
       //when
        Integer expected = 25;
        Integer Id = cat.getId();
        //then
        Assert.assertEquals(givenID,Id);



    }

    @Test
    public void CatSpeak() {
        //given
        String givenSpeak = "meow!";
        //constructor
        Cat cat = new Cat (null,null,null);
        //when
String expected = "meow!";
String Speak = cat.speak();
//then
        Assert.assertEquals(givenSpeak, Speak);

    }

    @Test
    public void setBirthDate() {
        //given
        Date givenBirthDate = new Date();

// constructor
        Cat cat = new Cat (null,29/07/1989,null);
        //when
        String GetCatName = cat.getName();

        //then
        Assert.assertEquals();






}
