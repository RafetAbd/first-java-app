package pkg1;

public class Main {
    public static void main(String[] args) {

        int mark = 64;

        if ( mark >= 90 ) {
            System.out.println("Grade A");
        } else if ( mark >= 80 ) {
            System.out.println("Grade B");
        } else if ( mark >= 70 ) {
            System.out.println("Grade c");
        } else if ( mark >= 60 ) {
            System.out.println("Grade d");
        } else if ( mark >= 50 ) {
            System.out.println("Grade E");
        } else {
            System.out.println("failed");
        }
    }
}