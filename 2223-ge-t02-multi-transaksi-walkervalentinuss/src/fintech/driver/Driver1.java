package fintech.driver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import fintech.model.Account;

/**
 * @author beluga
 */
public class Driver1 {

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
                default -> System.out.println("command unknown! try create-account instead");
            }
        }
    }

}