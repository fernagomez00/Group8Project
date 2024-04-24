import java.math.BigDecimal;

public class Account{
    private long id;
    private String firstname,lastname;
    private BigDecimal checking;
    private BigDecimal savings;

    public Account(){}

    public long getID(){
        return id;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public BigDecimal getChecking(){
        return checking;
    }

    public BigDecimal getSavings(){
        return savings;
    }

    public void setID(long id){
        this.id = id;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setChecking(BigDecimal checking){
        this.checking = checking;
    }

    public void setSavings(BigDecimal savings){
        this.savings = savings;
    }
}