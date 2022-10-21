package pkg2;

public class Bank_Account_Main {

    public static void main(String[] args) {

        Bank_Account ba1 = new Bank_Account(13244, "Kevin Alani", 100);
        System.out.println(ba1.deposite(25));
        System.out.println(ba1.withdraw(50));
        ba1.display();
    }

}
