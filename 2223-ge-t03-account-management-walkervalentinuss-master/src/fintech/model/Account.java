package fintech.model;
import java.util.LinkedList;

/**
 * @author beluga
 */
public class Account {

    // class definition

    @Override
    public String toString(){
        //<account-name>|<owner>|<balance>
        return this.accountName + "|" + this.accountOwner + "|" + this.accountBalance;
    }
}