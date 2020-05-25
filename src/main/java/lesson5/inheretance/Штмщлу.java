package main.java.lesson5.inheretance;

public class Штмщлу {
    public static void main(String[] args) {
        Cat vasia = new Cat("vasia");
        Dog bobik = new Dog("Bobik");
        Cat viktor = new Cat("vasia");
//        Animal animal = new Animal("Vova");
//        System.out.println(bobik.getName());

        System.out.println(vasia);
        System.out.println(vasia.equals(viktor));
        vasia.toString();
        Animal cat = new Cat("AA");
//        Cat cat2 = (Cat) cat;
        Animal[] cats = {new Cat("A"), new Cat("B"), new Dog("C")};
        IAtakable[] atackable = {new Dog("B"), new Mouse("C")};
        IAtakable animal = new Dog("DD");
        Mouse mouse = new Mouse ("sd");
        bobik.attack(mouse);
    }
}
