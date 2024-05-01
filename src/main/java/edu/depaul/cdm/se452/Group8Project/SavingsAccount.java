import javax.persistence.Entity;
import javax.persistence.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "savings")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class SavingsAccount extends Account {
    private double intRate;

    public SavingsAccount(String customer, String openingDate, double balance, double intRate) {
        super(customer, openingDate, balance);
        this.intRate = intRate;
    }

    // Will set Getters and setters
    // Will add other methods specific to SavingsAccount
}
