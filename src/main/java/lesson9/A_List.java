package main.java.lesson9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A_List {
    public static void main(String[] args) {
        int[] arr={45,45,78,89};
//        Integer a = 45;
//        Integer b= new Integer(45);
        List<Integer> list = new ArrayList();
//        List<Dog> list2 = new ArrayList();

        list.add(45);
        list.add(45);
        list.add(45);
        list.add(8);
        list.add(800);
        list.remove(3);
        System.out.println(list.size());
      /*  for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
      /*  for (Integer el: list){
            System.out.println(el);
        }*/
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("-----");
            System.out.println(iterator.next());
        }
    }
}
