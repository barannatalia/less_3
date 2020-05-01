package main.java.lesson3;

public class G_System_formating {
    public static void main(String[] args) {
        System.out.println("Hello"); // перенесення стрічки
        System.out.println();
        System.out.print("Hello");
        System.out.print("by");
        System.out.println("Hello Vasia, my mame Galia");
        String greet = "Hello Vasia, my age 33";
        String greet1 = "Hello %s, my age %d";
        System.out.printf(greet1, "Vova", 33); // не переносить на нову стрічку

        System.out.printf(greet1, "Vol", 44);

        System.out.printf(greet1, "Vol", 44);
        System.out.println();
        System.out.println("Hello \\\"Vasia\", my mame Galia"); // \ - визначає наступний символ як стрічку
        System.out.println("Hello \\\"Vasia\", \n Hello Galia"); // \n  - \r - перенесення стрічки
        System.out.println("Hello \\\"Vasia\", \t Hello Galia"); // \t  - табуляція


    }
}
