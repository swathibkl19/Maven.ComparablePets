package io.zipcoder.io.zipcoder.pets;

public class Pet_Swathi {
    String name;

    public Pet_Swathi(String name) {
        this.name = name;
    }

    public Pet_Swathi() {

    }

    public String speak(){
        return "Bark";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
