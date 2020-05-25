package main.java.lesson5.inheretance;

public class Exception extends Throwable {
    public static void main(String[] args) {
        a();
    }

    public static void a(){
        try {
            b();
        } catch (Exception e) {
            System.out.println("Exception was cauth");;
        }
        System.out.println("A method");

    }
//    public static void b(){
//
//        try{
//            int a= 7/0;
//            System.out.println("B method  - file was read");
//            System.out.println("B method  - file was read");
//        }catch (java.lang.Exception e) {
//            System.out.println("Filo not Found");
//        }
//    }

    public static void b() throws  Exception{
        System.out.println("B method  - file was read");
        System.out.println("B method  - file was read");
//        int a = 7 / 0;
        System.out.println("After exception");
    }
}
