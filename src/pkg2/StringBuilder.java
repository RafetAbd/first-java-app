package pkg2;
import java.util.Scanner;

public class StringBuilder {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        Scanner n1 = new Scanner(System.in);
        System.out.println("Please enter your name : ");

        String str1 = s1.nextLine();

        System.out.println("Please enter your number : ");

        int int1 = n1.nextInt();

        String temp = "";

        for ( int i = 0 ; i <= str1.length()-1 ; i++ ) {
            temp = str1.charAt(i) + temp;
        }

        System.out.println("the reversed name is :" + temp);
        System.out.println("the number is :" + int1);
    }

}
