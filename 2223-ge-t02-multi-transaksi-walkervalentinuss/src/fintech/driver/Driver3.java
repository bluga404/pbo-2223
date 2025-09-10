package fintech.driver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import fintech.model.*;

/**
 * @author beluga
 */
public class Driver3 {

    private static Map<String, Account> accounts = new HashMap<>();

    public static void main(String[] _args) {

        // codes
        /*
        var account = new Account("Wiro Sableng", "wirsab", 40.00);
        System.out.println(account);
         */
        Scanner input = new Scanner(System.in);

        // make user can create account as long as they don't type "---"

        while (input.hasNextLine()){
            String command = input.nextLine();
            String[] parts = command.split("#");
            if (parts[0].equals("---")){
                break;
            }
            switch (parts[0]){
                case "create-account" -> {
                    String owner = parts[1];
                    String username = parts[2];

                    // check if username exist
                    var acc = accounts.get(username);
                    if (acc == null){
                        var account = new Account(owner, username, 0.0);
                        accounts.put(username, account);
                        System.out.println(account);
                    } else {
                        System.out.println("Username exist! Try different username");
                    }
                }
                // add find-account case so the user can search their account
                case "find-account" -> {
                    String username = parts[1].toLowerCase();
                    var acc = accounts.get(username.toLowerCase());

                    if (acc != null){
                        System.out.println(acc);
                    }
                }
                case "create-transaction" -> {
                    String username = parts[1];
                    double amount = Double.parseDouble(parts[2]);
                    String postedAt = parts[3];
                    String note = parts[4];

                    var account = accounts.get(username);
                    if (account != null) {
                        double openingBalance = account.getAccountBalance();

                        Transaction transaction = new Transaction(
                                account.getAccountOwner(),
                                account.getAccountName(),
                                openingBalance,
                                amount,
                                postedAt,
                                note
                        );

                        accounts.put(username, transaction);
                    }

                }
                default -> System.out.println("command unknown! try create-account instead");
            }
        }
    }

}