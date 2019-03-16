package io.zipcoder;

public class Bird_Francisco extends Pet_Francisco {

    public Bird_Francisco() {
        this.name ="";
    }

    public Bird_Francisco(String name) {
        super(name);
    }

    public String speak() {
        return "Tweet";
    }
}
