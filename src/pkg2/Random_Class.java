package pkg2;

import java.sql.SQLOutput;
import java.util.Random;

public class Random_Class {

    public static void main(String[] args) {

        Random r1 = new Random();

        // will create random number between 0 and 1000
        System.out.println(r1.nextInt(1000));

        // will create random number between 1000 and 10000
        System.out.println(r1.nextInt(9000) + 1000);
        // or
        System.out.println((int)(Math.random() * 9000 ) + 1000 );

    }

}
