package in.stackroute.oops.inheritance;

public class SavingsAccount extends BankAccount{
    private double interestRate;

//    public SavingsAccount() {
//
//    }

    public SavingsAccount(String name, int account_no, String email, int contact_no, double balance) {
        super(name, account_no, email, contact_no, balance);//constructor chaining  --> child class constructor calling parent class constructor

    }
//
    //specialised method
    public void addInterest(double interestRate){
        double interest = getBalance() * interestRate/100;
        super.deposit(interest);
    }

    //Overidden method
    public void welcome(){
        System.out.println("Welcome to Savings account");
    }
}
