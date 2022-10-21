package pkg2;

public class Bank_Account {

    private int AccountNumber;
    private String AccountName;
    private double AccountBalance;

    public Bank_Account( int AccountNumber, String AccountName, double AccountBalance) {
        this.AccountBalance = AccountBalance;
        this.AccountNumber = AccountNumber;
        this.AccountName = AccountName;

    }

    public void deposite(double addedMoney) {
        if ( addedMoney <= 0 ) {
            System.out.println("can not deposite " + addedMoney);
        } else {
            AccountBalance = AccountBalance + addedMoney;
            System.out.println("the new balance is $" + AccountBalance);
        }
    }

    public void withdraw(double withdrawMoney) {
        if ( withdrawMoney <= 0 || AccountBalance < withdrawMoney) {
            System.out.println("can not deposite " + withdrawMoney);
        } else {
            AccountBalance = AccountBalance + withdrawMoney;
            System.out.println("the new balance is $" + AccountBalance);
        }
    }

    public void display() {
        System.out.println("the current balance is $" + AccountBalance);
    }

}
