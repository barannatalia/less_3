package main.java.home_task.homeTask_4;

public class HomeTask_2 {
    public static String printName(String name) {
//        String name = "Natalia";
        String printStr = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                printStr += name + " ";
            }
            printStr += "\n";
        }
        return printStr;
    }

}
