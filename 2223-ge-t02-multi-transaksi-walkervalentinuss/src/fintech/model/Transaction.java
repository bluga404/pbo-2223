package fintech.model;

import java.util.Scanner;

/**
 * @author beluga
 **/

public class Transaction extends Account{

    // class definition

    private static int seq = 0;

    // transaction
    private final int transId;
    private final Double transAmount;
    private final String transPostedAt;
    private final String transNote;

    public Transaction(String owner, String name, Double openingBalance,
                       Double transAmount, String transPostedAt, String transNote) {
        super(owner, name, openingBalance);
        this.transId = ++seq;
        this.transAmount = transAmount;
        this.transPostedAt = transPostedAt;
        this.transNote = transNote;

        this.accountBalance = openingBalance + transAmount;
    }

    @Override
    public String toString() {
        //<id>|<transaction-name>|<amount>|<posted-at>|<note>|<balance>
        return this.accountName + "|" + this.accountOwner  + "|" + this.accountBalance;
    }

}