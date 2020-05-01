package main.java.lesson4;

public class Main {
    public static void main(String[] args) {
//        Cat vasia = new Cat();
//        Cat victor = new Cat();


//        Dog bobik = new Dog();
//        System.out.println(vasia == victor);
//        System.out.println("vasia age " + vasia.);

//        System.out.println(vasia.equals(victor)); //false - різні частини памяті
//        Cat petr = victor;
//        petr.age = 100;
//        vasia.meov();
//        Cat.printCount();

        Cat cat1 = new Cat("ivan");
        Cat cat2 = new Cat("anton");
        Cat cat3 = new Cat();

        cat1.name = "kolia";
        System.out.println(cat1.name);
        System.out.println(cat2.name);
        cat2.greet("Vova");
        cat3.greet("Vova");

//        System.out.println(Cat.counter);

//        System.out.println(vasia.equals("victor" + victor.age);
//        System.out.println(petr.equals("petr" + petr.age);

        System.out.println(cat1.getAge());
    }
}
