package io.zipcoder.io.zipcoder.pets;

import io.zipcoder.Bird_Francisco;
import io.zipcoder.Cat_Francisco;
import io.zipcoder.Dog_Francisco;
import io.zipcoder.Pet_Francisco;
import org.junit.Assert;
import org.junit.Test;

public class PetTest_Swathi {

    @Test
    public void dogNullConstructorTest(){
        //Given
        Dog_Francisco dog =new Dog_Francisco();

        //when
        String actual =dog.getName();

        //Then
        Assert.assertEquals("",actual);
    }

    @Test
    public void dogConstructorWithNameTest(){
        //Given
        String expected="Pepper";
        Dog_Francisco dog =new Dog_Francisco(expected);

        //When

        String actual =dog.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void dogSpeakTest(){
        //Given
        String expected ="Woof woof";
        Dog_Francisco dog =new Dog_Francisco(expected);

        //when
        String actual =dog.speak();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test

    public void dogPolymorphismTest(){

        // Given
        Dog_Francisco dog = new Dog_Francisco();

        // When
        Boolean actual = dog instanceof Pet_Francisco;

        // Then
        Assert.assertTrue(actual);

    }


        @Test
        public void catNullConstructorTest(){
            // Given
            Cat_Francisco cat = new Cat_Francisco();

            // When
            String actual = cat.getName();

            // Then
            Assert.assertEquals("", actual);
        }


        @Test
        public void catConstructorWithNameTest(){
            // Given
            String expected = "Oil";
            Cat_Francisco cat = new Cat_Francisco(expected);

            // When
            String actual = cat.getName();

            // Then
            Assert.assertEquals(expected, actual);
        }


        @Test
        public void catSpeakTest(){
            // Given
            Cat_Francisco cat = new Cat_Francisco();
            String expected = "Meow!";

            // When
            String actual = cat.speak();

            // Then
            Assert.assertEquals(expected, actual);
        }


        @Test
        public void catPolymorphismTest(){
            // Given
            Cat_Francisco cat = new Cat_Francisco();

            // When
            Boolean actual = cat instanceof Pet_Francisco;

            // Then
            Assert.assertTrue(actual);
        }

        @Test
        public void birdNullConstructorTest(){
        //Given
            Bird_Francisco bird =new Bird_Francisco();

            //When

            String actual = bird.getName();

            //Then
            Assert.assertEquals("",actual);

        }
        @Test
    public void birdConstructorWithNameTest(){
        //Given
            String expected ="Salt";
            Bird_Francisco bird =new Bird_Francisco(expected);
            //When
            String actual = bird.getName();

            //Then
            Assert.assertEquals(expected,actual);
        }
      @Test
    public void birdSpeakTest(){
        //Given
          String expected ="Tweet";
          Bird_Francisco bird = new Bird_Francisco();
          //When
          String actual = bird.speak();

          //Then
          Assert.assertEquals(expected,actual);
      }

      @Test
    public void birdPolymorphismTest(){
        //Given

          Bird_Francisco bird =new Bird_Francisco();

          //When
          boolean actual = bird instanceof Bird_Francisco;

          //Then
          Assert.assertTrue(actual);
      }
    }
