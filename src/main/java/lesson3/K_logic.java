package main.java.lesson3;

public class K_logic {
    public static void main(String[] args) {
//        String name = "Vova ";
        int age = 50;
//
//        if (age > 18 && name == "Vova"){ // && - and; || - or
//            System.out.println("Hello user");
//        }else if (age >10) {
//            System.out.println("NO");
//        }else {
//            System.out.println(">10");
//        }
//        System.out.println();
//    String status;
//    if (age>18){
//        status = "Worker";
//    } else {
//        status="Student";
//    }
    String status = (true) ? "Worker" : "Student";

    int dayOff= 0 ;
//    if (dayOff == 0){
//        System.out.println("Monday");
//    }else if {
//        System.out.println("Thursday");
//    }
    switch (dayOff) {
        case 0:
            System.out.println("Monday");
            break;
        case 1:
            System.out.println("Thursday");
            break;
        case 2:
            System.out.println("Thursday...");
            break;
        default:
            System.out.println("No such day");
        }
    }
}

