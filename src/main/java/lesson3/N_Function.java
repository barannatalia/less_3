package main.java.lesson3;
//функції мають бути поза main
public class N_Function {
    public static void main(String[] args) {
       greet("Vova",50);
       greet("Vova",50);
       greet("Ola");
       greet(12);
       int age = getAge();
        System.out.println(age);
        System.out.println(getAge());
    }

    public static void greet(String name, int number) {   //перевірка параметрів функції (кількість, тип, порядок) - сигнатура
        System.out.println("Hello, " + name + "your number is " + number);
        System.out.println("Good by");
    }
    public static void greet(String name) {   //перегрузка функіцї
        System.out.println("Hello, " + name + "your number is 10");
        System.out.println("Good by");
    }
    public static void greet(int number) {   //перегрузка функіцї
        System.out.println("Hello, user! your number is " + number);
        System.out.println("Good by");
    }

    public static int getAge() {        //функція для повернення значення
        return 50;
    }
    public static boolean isValid() {
        return 1 == 1;
    }
}
