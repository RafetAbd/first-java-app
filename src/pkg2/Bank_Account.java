package pkg2;

public class Bank_Account {

    private int AccountNumber;
    private String AccountName;
    private int AccountBalance;

    public Bank_Account( int AccountNumber, String AccountName, int AccountBalance) {
        this.AccountBalance = AccountBalance;
        this.AccountNumber = AccountNumber;
        this.AccountName = AccountName;

    }

    public int getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        AccountBalance = accountBalance;
    }

    public int deposite(int addedMoney) {
        int newAccountBalance = AccountBalance + addedMoney;
        setAccountBalance(newAccountBalance);
        return getAccountBalance();
    }

    public int withdraw(int addedMoney) {
        int newAccountBalance = AccountBalance - addedMoney;
        setAccountBalance(newAccountBalance);
        return getAccountBalance();
    }

    public void display() {
        System.out.println("the current balance is $" + getAccountBalance());
    }

}
