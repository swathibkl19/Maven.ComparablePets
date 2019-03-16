package io.zipcoder;


public abstract class Pet_Francisco {

    protected String name;

    public Pet_Francisco(){
        this.name ="";

    }

    public Pet_Francisco(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String speak();

}
