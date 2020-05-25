package main.java.lesson5.inheretance;

public class Mouse extends Animal implements IAtakable {
    int health = 100;

    public Mouse(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return null;
    }

    @Override
    public int getHealth() {
        return 0;
    }
}
