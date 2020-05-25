package main.java.lesson5.inheretance.app;

public class Server {

    private String[] arr1 = {"vova", "andr", "Olia"};

    public String getUsers() {
        String result = "";
        for (int i = 0; i < this.arr1.length; i++) result += this.arr1[i] + (i < this.arr1.length - 1 ? ", " : "");
        return result;
    }

    public String getStatus (int age){
        if ( age <= 0 ){
            return "!!!";
        }else if  (age <=18){
            return "Student";
        }else if (age < 60){
            return "Worker";
        }else if (age <= 90){
            return "Pensioner";
        } else return "!!!";
    }
}
