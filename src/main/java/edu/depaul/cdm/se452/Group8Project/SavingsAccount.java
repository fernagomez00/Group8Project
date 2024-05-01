import javax.persistence.Entity;

@Entity
public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(String customer, String openDate, double balance, double interestRate) {
        super(customer, openDate, balance);
        this.interestRate = interestRate;
    }

    // Getters and setters
    // Other methods specific to SavingsAccount
}
