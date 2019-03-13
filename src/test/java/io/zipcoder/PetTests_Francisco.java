package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Collectors;

public class PetTests_Francisco {

    @Test
    public void testInheritanceDogTest() {
        // Given
        Pet_Francisco p = new Dog_Francisco(null);

        // Then
        Assert.assertTrue(p instanceof Pet_Francisco);
    }

    @Test
    public void testInheritanceCatTest() {
        // Given
        Pet_Francisco p = new Cat_Francisco(null);

        // Then
        Assert.assertTrue(p instanceof Pet_Francisco);
    }

    @Test
    public void testInheritanceBirdTest() {
        // Given
        Pet_Francisco p = new Bird_Francisco(null);

        // Then
        Assert.assertTrue(p instanceof Pet_Francisco);
    }

    @Test
    public void speakTest() {
        // Given
        Pet_Francisco p = new Dog_Francisco(null);
        String expected = "Bark";

        // When
        String actual = p.speak();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNameDogTest(){
        // Given
        Pet_Francisco p = new Dog_Francisco("Doggy");
        String expected = "Doggy";

        // When
        String actual = p.getName();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNameCatTest(){
        // Given
        Pet_Francisco p = new Cat_Francisco("Kitty");
        String expected = "Kitty";

        // When
        String actual = p.getName();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameDogTest(){
        // Given
        Pet_Francisco p = new Dog_Francisco(null);
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
        Pet_Francisco p = new Cat_Francisco(null);
        String expected = "Kitty2";

        // When
        p.setName("Kitty2");
        String actual = p.getName();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addPet(){
        // Given
        String expected = "Doggy Bark\nKitty Meow";
        Pet_Francisco p1 = new Dog_Francisco("Doggy");
        Pet_Francisco p2 = new Cat_Francisco("Kitty");

        PetOwner_Francisco petOwner = new PetOwner_Francisco();

        // When
        petOwner.addPet(p1);
        petOwner.addPet(p2);

        String actual = petOwner.getNameOfPet()
                .stream()
                .map( s -> s.getName() + " " + s.speak() )
                .collect(Collectors.joining("\n"));
        // Then
        Assert.assertEquals(expected,actual);
    }

}
