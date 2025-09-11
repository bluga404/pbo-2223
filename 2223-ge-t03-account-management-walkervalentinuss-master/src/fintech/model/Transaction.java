package fintech.model;

/**
 * @author beluga
 **/

public class Transaction {

   @Override
   public String toString(){
      //<id>|<transaction-name>|<amount>|<posted-at>|<note>|<balance>
      return this.getNextIndex() + "|" + this.transactionOwner + "|" + this.transactionAmount + "|" + this.transactionPostedAt + "|" + this.transactionNote + "|" + this.transactionBalance;
   }

}