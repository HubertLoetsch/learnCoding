

import java.util.Random;

public class ArrysAufgabe2 {
    public static void main(String[] args) {

        Random number = new Random();

        int[] arry = new int[50];
        int num = 0;
        for (int i = 0; i < arry.length; i++) {
            arry[i] = number.nextInt(100);
            System.out.println(arry[i]);



        }

    }
}

