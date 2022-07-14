package learn.java;

public class BankAccount {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String emailId;
    private long phoneNumber;

    public BankAccount() {
        //call another constructor
        this(122458632482L, 22.0,
                "Sabah Yunus Shaikh", "sabayshaikh44@gmail.com", 9284516202L);
    }

    //Constructor
    public BankAccount(long accountNumber, double balance, String customerName, String emailId, long phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }
    //setter
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //getters
    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmailId() {
        return emailId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setdeposit(double depositFund) {
        if(depositFund >= 0) {
            balance += depositFund;
            System.out.println("Deposited amount: " + depositFund);
        } else {
            balance += 0;
        }
    }

    public void setwithdraw(double withdrawFund) {
        if(withdrawFund >= 0 && withdrawFund <= balance) {
            balance -= withdrawFund;
            System.out.println("Current balance is " + balance);
            System.out.println("Withdrawal amount: " + withdrawFund);
        } else if (withdrawFund > balance) {
            System.out.println("Current balance is " + balance);
            System.out.println("Withdrawal amount " + withdrawFund);
            System.out.println("Insufficient balance");
        }
    }

}
