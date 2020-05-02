package main.java.home_task.homeTask_2;
/* Минимум трех чисел
Написать функцию, которая вычисляет минимум из трёх чисел.
*/
public class Task_1 {
    public static void main(String[] args) {
        System.out.println("minimum: " + min(5,3,3));
    }
    public static int min(int a, int b, int c) {
        int minimum;
        if (a < b && a < c) {
            minimum = a;
        } else if (b < a & b < c) {
            minimum = b;
        } else minimum = c;
        return minimum;
    }
}

