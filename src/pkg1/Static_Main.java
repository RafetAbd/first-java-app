package pkg1;

public class Static_Main {

    public static void main(String[] args) {

        Static_Keyword sk1 = new Static_Keyword();
        Static_Keyword sk2 = new Static_Keyword();

        sk1.age = 7;
        sk1.grade = "2nd";
        sk1.name = "Rob";
 

        sk2.age = 10;
        sk2.grade = "4th";
        sk2.name = "Nick";

        sk1.displayDetails();
        sk2.displayDetails();


    }

}
