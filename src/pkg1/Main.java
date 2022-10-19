package pkg1;

public class Main {
    public static void main(String[] args) {


        // fabonacci simple approach;
//       int num1 = 0;
//       int num2 = 1;
//       int num3 = 0;
//        for ( int i = 1 ; i <= 18 ; i ++ ) {
//            num3 = num1+num2;
//            System.out.println(num3);
//            num1 = num2;
//            num2 = num3;
//        }

//        int a = 100;
//        while ( a > 50 ) {
//            if ( a == 70 ) {
//                continue;
//            }
//            System.out.println(a);
//            a -= 5;
//
//        }

        Cars car1 = new Cars();
        car1.make = "Ford";
        car1.type = "Edge";
        car1.color = "Black";
//        car1.displayDetails();

        Cars car2 = new Cars();
        car2.color = "red";
        car2.make = "Honda";
        car2.type = "CRV";
//        car2.displayDetails();

        Employee p1 = new Employee();
        Employee p2 = new Employee();

        p1.name = "Kevin";
        p1.ID = "43tgfw4";
        p1.salary = 85000.0;

        p2.name = "Zack";
        p2.ID = "iu435";
        p2.salary = 96000.3;

//        p1.employeeBonus();
//        p2.employeeBonus();

        Spare r = new Spare();
        System.out.println(r.multiply( 2, 5 ));;
        System.out.println(r.multiply( 2.3, 5.1 ));;
        System.out.println(r.multiply( 2.3, 5.1,4 ));;

    }
}