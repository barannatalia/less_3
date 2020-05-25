package main.java.lesson5.inheretance;

public class Dog extends Animal implements IAtakable {
            int health=100;

    public Dog(String name) {
        super(name);  // в конструкторі має бути перед логікою
    }
    @Override //перевизначення методу? який не звязаний з бажзовим класом
    public String getName(String name) {
        System.out.println("Dog - ");
//        super.getName();
//        return super.name + "!";
        return "THIS";
    }

    @Override
    public String greet() {
        return "Hi! Dog";
    }

    @Override
    public int getHealth() {
        return 0;
    }
}
