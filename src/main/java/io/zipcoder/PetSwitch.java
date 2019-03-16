package io.zipcoder;

public class PetSwitch {

    public Pet_Francisco fromInput(String input){
        if(input.equals("CAT")){
            Cat_Francisco cat_francisco = new Cat_Francisco();
            return cat_francisco;
        }
        else if( input.equals("DOG")){
            Dog_Francisco dog_francisco = new Dog_Francisco();
            return dog_francisco;
        }
        else if( input.equals("BIRD")){
            Bird_Francisco bird_francisco = new Bird_Francisco();
            return bird_francisco;
        }else {
            System.out.println("PET NO IDENTIFIED! TRY AGAIN.");
        }
        return null;
    }

}
