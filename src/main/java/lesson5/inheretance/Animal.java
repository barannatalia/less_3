package main.java.lesson5.inheretance;

import javax.print.DocFlavor;

public abstract class Animal {
    private String name;
//    private int health;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name + "!";
    }

    public String getName(String user) {
        return this.name + "!" + user;
    }

    public void setName(String name) {
        this.name = name;


    }

    public String toString() {
        return "J am - " + this.name;
    }

    public abstract String greet();


    public boolean equals(Animal obj) {
        return this.name == obj.name;
    }

    //    public abstract String greet();
    public void attack(IAtakable animal) {
//        animal.health -= 10;
    }

}
