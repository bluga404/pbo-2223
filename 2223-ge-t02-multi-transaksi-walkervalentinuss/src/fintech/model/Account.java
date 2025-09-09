package fintech.model;

/**
 * @author beluga
 */
public class Account {

    // class definition
    String accountName;
    String accountOwner;
    Double accountBalance;

    public Account(String accountOwner, String accountName, Double accountBalance) {
        this.accountName = accountName;
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;
    }

    public String getAccountName(){
        return accountName;
    }
    public String getAccountOwner(){
        return accountOwner;
    }
    public Double getAccountBalance(){
        return accountBalance;
    }

    @Override
    public String toString() {
        //<account-name>|<owner>|<balance>
        return this.accountOwner + "|" + this.accountName + "|" + this.accountBalance;
    }

}