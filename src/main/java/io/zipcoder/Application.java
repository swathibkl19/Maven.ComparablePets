package io.zipcoder;


import io.zipcoder.utilities.IOConsole;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    /**
     * Step 1. Asks the user how many pets they have.
     * Step 2. Ask them what kind of pet each one is.
     * Step 3. Along with each pet's name.
     * Step 4. Print out the list at the end.
     */
    Integer numberOfPets = 0;
    Map<Class,String> map;
    Pet_Francisco[] arrayPet = new Pet_Francisco[100];

    public void run() {
        this.numberOfPets = IOConsole.getIOConsole().getIntegerInput("Hi! Please type in how many pet do you have: ");
        througEachPet();
        IOConsole.getIOConsole().println(printArray());
    }

    public void througEachPet(){
        for (int i = 0; i < numberOfPets; i++) {
            String typeOfPet = IOConsole.getIOConsole().getStringInput("Please enter the Pet's type: ");
            PetSwitch petSwitch = new PetSwitch();
            Pet_Francisco thePet = petSwitch
                    .fromInput(typeOfPet
                            .toUpperCase());
            if (thePet instanceof Pet_Francisco){
                String setTheName = IOConsole
                        .getIOConsole()
                        .getStringInput("Please enter the Pet's name: ");
                thePet.setName(setTheName);
                arrayPet[i] = thePet;
            }
            else {
                i--;
            }
        }
    }

    public String printArray(){
        String str = "";
        for (int i = 0; i < numberOfPets; i++) {
            str +=  "You have a Pet which " + arrayPet[i].getClass()
                    + " has a name " + arrayPet[i].getName() + "\n";
        }
        return str;
    }

}
