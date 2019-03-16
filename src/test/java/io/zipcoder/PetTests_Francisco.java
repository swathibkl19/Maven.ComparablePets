package io.zipcoder;

import io.zipcoder.io.zipcoder.pets.Cat_Swathi;
import io.zipcoder.io.zipcoder.pets.Dog_Swathi;
import io.zipcoder.io.zipcoder.pets.Pegon_Swathi;
import io.zipcoder.io.zipcoder.pets.Pet_Swathi;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Collectors;

public class PetTests_Francisco {

    @Test
    public void testInheritanceDogTest() {
        // Given
        Pet_Swathi p = new Dog_Swathi(null);

        // Then
        Assert.assertTrue(p instanceof Pet_Swathi);
    }

    @Test
    public void testInheritanceCatTest() {
        // Given
        Pet_Swathi p = new Cat_Swathi(null);

        // Then
        Assert.assertTrue(p instanceof Pet_Swathi);
    }

    @Test
    public void testInheritanceBirdTest() {
        // Given
        Pet_Swathi p = new Pegon_Swathi(null);

        // Then
        Assert.assertTrue(p instanceof Pet_Swathi);
    }

    @Test
    public void speakTest() {
        // Given
        Pet_Swathi p = new Dog_Swathi(null);
        String expected = "Bark";

        // When
        String actual = p.speak();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNameDogTest(){
        // Given
        Pet_Swathi p = new Dog_Swathi("Doggy");
        String expected = "Doggy";

        // When
        String actual = p.getName();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNameCatTest(){
        // Given
        Pet_Swathi p = new Cat_Swathi("Kitty");
        String expected = "Kitty";

        // When
        String actual = p.getName();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameDogTest(){
        // Given
        Pet_Swathi p = new Dog_Swathi(null);
        String expected = "Doggy2";

        // When
        p.setName("Doggy2");
        String actual = p.getName();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameCatTest(){
        // Given
        Pet_Swathi p = new Cat_Swathi(null);
        String expected = "Kitty2";

        // When
        p.setName("Kitty2");
        String actual = p.getName();

        // Then
        Assert.assertEquals(expected,actual);
    }

//    @Test
//    public void addPet(){
//        // Given
//        String expected = "Doggy Bark\nKitty Meow";
//        Pet_Swathi p1 = new Dog_Swathi("Doggy");
//        Pet_Swathi p2 = new Cat_Swathi("Kitty");
//
//        PetOwner_Francisco petOwner = new PetOwner_Francisco();
//
//        // When
//       // petOwner.addPet(p1);
//        //petOwner.addPet(p2);
//
//        String actual = petOwner.getNameOfPet()
//                .stream()
//                .map( s -> s.getName() + " " + s.speak() )
//                .collect(Collectors.joining("\n"));
//        // Then
//        Assert.assertEquals(expected,actual);
//    }

}
