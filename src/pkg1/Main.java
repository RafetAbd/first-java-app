package pkg1;

public class Main {
    public static void main(String[] args) {


        // fabonacci simple approach;
       int num1 = 0;
       int num2 = 1;
       int num3 = 0;
        for ( int i = 1 ; i <= 18 ; i ++ ) {
            num3 = num1+num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }
}