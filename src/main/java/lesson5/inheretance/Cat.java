package main.java.lesson5.inheretance;

public class Cat extends Animal {
public Cat(String name){
    super(name);
}

    @Override
    public String greet() {
        return "Hi! Cat";
    }


}
