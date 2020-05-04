package main.java.home_task.homeTask_3;

import com.sun.prism.shader.AlphaOne_LinearGradient_AlphaTest_Loader;

public class Main {
    public static void main(String[] args) {
        Task_1 person1 = new Task_1();
        Task_1 person2 = new Task_1(35);
        Task_1 person3 = new Task_1(80);

        person1.setAge(12);
        person2.setAge(45);
        person1.setName("      ");
        person2.setName("ivan");
        person3.setName("ia");

        System.out.println(person1.getName() + " " + person1.getAge() + " " + person1.getAgeGroup());
        System.out.println(person2.getName() + " " + person2.getAge() + " " + person2.getAgeGroup());
        System.out.println(person3.getName() + " " + person3.getAge() + " " + person3.getAgeGroup());
    }
}
