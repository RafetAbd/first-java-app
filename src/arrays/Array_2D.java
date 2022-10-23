package arrays;

public class Array_2D {

    public static void main(String[] args) {

        int [][] array = new int [5][10];
        for ( int i = 2 ; i <= 6 ; i ++ ) {
            for ( int j = 1; j <= 10 ; j ++ ) {
                array[i-2][j-1] = i*j;
            }
        }

        for ( int [] x : array ) {
            for ( int y: x) {
                System.out.print(y + " ");
            }
            System.out.println("\n");
        }

    }

}
