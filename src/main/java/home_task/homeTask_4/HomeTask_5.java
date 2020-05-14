package main.java.home_task.homeTask_4;

public class HomeTask_5 {
    public static String reverseString(String str) {
        int l = str.length();
        String strReverse = "";
        for (int i = l - 1; i >= 0; i--) strReverse += str.charAt(i);
        return strReverse;
    }
}

