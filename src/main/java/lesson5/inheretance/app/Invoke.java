package main.java.lesson5.inheretance.app;

public class Invoke {
    public static void main (String[] args) {
        Server server = new Server();
        System.out.println(server.getUsers());

        String actual = server.getUsers();
        String expected = "Vova, Andrey, Alexandr----";
        if(!actual.equals(expected)) {
            System.out.println("Test failed");
            throw new Error();
        }

        System.out.println("After error");
    }
}
