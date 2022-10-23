package arrays;

public class Array_exercise {

    public static void main(String[] args) {

        int [] arr = {10,20,30,35,40,50,60,70,80};
        int j = arr.length-1;
        int temp;

        for ( int i = 0 ; i < (arr.length)/2 ; i ++ ) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }

        for ( int m = 0 ; m < arr.length ; m ++ ) {
            System.out.println(arr[m]);
        }

    }

}
