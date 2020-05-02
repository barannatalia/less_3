package main.java.home_task.homeTask_2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */

public class Task_5 {
    public static void main(String[] args) {
        //System.out.println(reverse("Hello world!!!"));
        String str = "Hello world!!!";
        int l = str.length();
        String strReverse = "";
        for (int i = l - 1; i >= 0; i--) {
            strReverse += str.charAt(i);
        }
        System.out.println(strReverse);
//можна також зробити через масиви, але то більше тексту :)
    }
}
