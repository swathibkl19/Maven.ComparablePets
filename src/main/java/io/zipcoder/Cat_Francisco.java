package io.zipcoder;

public class Cat_Francisco extends Pet_Francisco {
    public Cat_Francisco() {
        this.name="";
    }

    public Cat_Francisco(String name) {
        super(name);
    }

    public String speak() {
        return "Meow!";
    }
}
