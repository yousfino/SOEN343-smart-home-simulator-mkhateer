package main.java.model.rooms;

public class Kitchen extends Room{

    public Kitchen(String name){
        super(name);
    }

    @Override
    public String toString() {
        return name + super.toString();
    }
}
