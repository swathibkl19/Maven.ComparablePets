package io.zipcoder;

import java.util.ArrayList;

public class PetOwner_Francisco {

    private ArrayList<Pet_Francisco> pets = new ArrayList<Pet_Francisco>();

    public void addPet(Pet_Francisco pet){
        pets.add(pet);
    }

    public void removePet(Pet_Francisco pet){
        pets.remove(pet);
    }

    public Integer getNumberOfPets(){
        return pets.size();
    }

    public ArrayList<Pet_Francisco> getNameOfPet(){
        return pets;
    }

}
