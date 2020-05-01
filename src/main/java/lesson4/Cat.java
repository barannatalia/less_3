package main.java.lesson4;

public class Cat {
    private static int counter = 0;
    private int age;
    public String name = "vasia";
    public final String color = "red"; //таку змінну не можна змінити, константи великими БУКВАМИ_З_ПІДКРЕСЛЕННЯМ

    public int getAge() {
        return this.age; //гетер, назва має починатися "get..."
    }

    public void setAge(int age) {  //дає можливість встановити значення, назва має починатися "set..."
        if (age > 0) {
            this.age = age;
        }
    }

    public Cat() {                //constructor
        this("not defined");
    }

    public Cat(String name) {    //конструктор, щоб була можливість змінювати статичну змінну, до нього можна тільки звертатися
        System.out.println("Cat was created");
        counter++;
        this.name = name;
        this.age = 10;
    }

    void greet(String userName) {  // в межах одного пакету буде працювати (packege default)
        System.out.println("Hello user " + userName + ". My name is " + this.name);
    }

    public void initialize(String catName) {  //стара версія конструктора
        name = catName;
    }

    public void meov() {
        System.out.println("MEOV");
    }

    public static void printCount() {
        System.out.println("was created " + Cat.counter);
    }

    //модифікатори доступу - public, private,

}
