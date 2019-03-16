package io.zipcoder;

public class Dog_Francisco extends Pet_Francisco {
    public Dog_Francisco() {
        this.name="";
    }

    public String speak() {
        return "Woof woof";
    }

    public Dog_Francisco(String name) {
        super(name);
    }

}
