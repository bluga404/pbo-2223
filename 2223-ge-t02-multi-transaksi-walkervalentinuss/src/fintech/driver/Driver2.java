package fintech.driver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import fintech.model.*;

/**
 * @author beluga
 */
public class Driver2 {

    private static Map<String, Account> accounts = new HashMap<>();

    public static void main(String[] _args) {

        // codes
        Scanner input = new Scanner(System.in);

        while (input.hasNextLine()){
            String command = input.nextLine();
            if (command.equals("---")){
                break;
            }
            switch (command) {
                case "create-account" -> {
                    String owner = input.nextLine();
                    String username = input.nextLine();
                    var account = new Account(owner, username, 0.0);
                    accounts.put(username, account);

                    System.out.println(account);
                }
                case "create-transaction" -> {
                    String name = input.nextLine().trim();
                    double amount = Double.parseDouble(input.nextLine().trim());
                    String postedAt = input.nextLine().trim();
                    String note = input.nextLine().trim();

                    var account = accounts.get(name);
                    if (account == null) {
                        System.out.println("Account not found: " + name);
                        return;
                    }

                    double openingBalance = account.getAccountBalance();

                    Transaction transaction = new Transaction(
                            account.getAccountOwner(),
                            account.getAccountName(),
                            openingBalance,
                            amount,
                            postedAt,
                            note
                    );

                    accounts.put(name, transaction);
                    System.out.println(transaction);
                }
                default -> System.out.println("command unknown! try create-account / create-transaction instead");
            }

        }

    }
  }
