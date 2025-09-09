package fintech.driver;

import java.util.Scanner;
import fintech.model.Account;

/**
 * @author beluga
 */
public class Driver1 {

    public static void main(String[] _args) {

        // codes
        /*
        var account = new Account("Wiro Sableng", "wirsab", 40.00);
        System.out.println(account);
         */
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();

        if (command.equals( "create-account")){
            String owner = input.nextLine();
            String username = input.nextLine();
            var account = new Account(owner, username, 0.0);
            System.out.println(account);
        } else {
            System.out.println("command unknown! try create-account instead");
        }
    }

}