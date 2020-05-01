package main.java.lesson3;

public class L_arrays {
    public static void main(String[] args) {
        int[] a = {10,11,12,13};
        int[] b = {10,11,12,13};
        int[] c = new int[5];
        char[] cg = {'c','b'};
        String[]  str = {"",""};
        int[] arr={2, 4, 6, 8};

//        System.out.println(arr[0]);
        arr[0]=10;
        System.out.println(arr); //друк області памяті
        System.out.println(arr.length-1);
    }
}
