package arrays;

import java.sql.SQLOutput;

public class Arrays {

    public static void main(String[] args) {

        String [] DaysOfWeek = {"Mon","tue","Wed","Thu","Fri","Sat","Sun"};
        System.out.println(DaysOfWeek.length);
        System.out.println(DaysOfWeek[4]);
        DaysOfWeek[2] = "reg";
        System.out.println(DaysOfWeek[2]);
        for ( int i = 0 ; i < DaysOfWeek.length ; i ++ ) {
            System.out.println(DaysOfWeek[i]);
        }

        // another way to declare an array
        int [] array1 = new int[5];
        array1[1] = 2;
        array1[2] = 4;
        array1[3] = 6;
        array1[4] = 8;
        array1[0] = 10;

        System.out.println(array1[2]);



    }




}
