package learn.java;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailId;

    public VipCustomer() {
        this("Unknown", 0, "default@mail.com");
    }

    public VipCustomer(String name, int creditLimit) {
        this(name,creditLimit,"default@mail.com");
    }

    public VipCustomer(String name, int creditLimit, String emailId) {
        this.name = name;
        this.emailId = emailId;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailId() {
        return emailId;
    }
}
