package main.java.lesson9;

public class A_First {
    public static void main(String[] args) {
        String tel = "+38(050) 1-135-45 45";
        String res = tel.replaceAll("[^0-9]", ""); // замінити все, що не цифри, ^ - тільки використовується в []
        String res1 = tel.replaceAll("[^0-9]", "");
        System.out.println(res);
        System.out.println(res1);
    }
}
