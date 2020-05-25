package main.java.home_task.homeTask_2;

public class Task_2 {
    /* Мое имя
    Вывести на экран свое имя 5 строк по 10 раз (через пробел).
    System.out.println, System.out.print можно использовать только по одному разу
    для этого нужно воспользоваться циклом for
    */
    public static void main(String[] args) {
        String name = "Natalia";
    }

    public static void printName(String name) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }
}