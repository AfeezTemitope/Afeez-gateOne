import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.InputMismatchException;

public class BankeBankAtmMachine {
    public static void main(String...a) {
        while(true) {
            printOptions();
            switch(chooseOption()) {
                case 1:
                    accountCreations();
                    break;
                case 2:
                    closeAccount();
                    break;
                default:
                    return;
            }
        }
    }

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> users = new ArrayList<>();
    static Random random = new Random();

    public static void printOptions() {
        String bankMenu = """
        =======================
        BANKE BANK MENU
        =======================
        >1. CREATE ACCOUNT
        -first name, last name, pin
        >2. CLOSE ACCOUNT
        """;
        System.out.println(bankMenu);
    }

    public static int chooseOption() {    
        System.out.print("Choose an option between (1-2): ");
        int options = scanner.nextInt();
        scanner.nextLine();
        return options;
    }

    public static void accountCreations() {
        System.out.print("Enter firstName: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter lastName: ");
        String lastName = scanner.nextLine();

        while(true) {
            System.out.print("Choose your personal 4-digit code: ");
            String pin = scanner.nextLine();
            if(pin.length() != 4) {
                System.out.println("Invalid pin, please enter a valid 4-digit code");
            } else {
                System.out.println("Pin successfully created");

                long accountNumber = Math.abs(random.nextLong()) % 1_000_000_0000L;
                users.add(firstName + " " + lastName + "\nYour pin: " + pin + "\nYour account number is: " + accountNumber);
                System.out.println("Your details: " + users);
                return;
            }
        }
    }

    public static void closeAccount() {
        System.out.print("Enter the account number of the account to close: ");
        long accountNumberToClose = 0;
        try {
            accountNumberToClose = scanner.nextLong();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine(); 
            return;
        }


        if (String.valueOf(accountNumberToClose).length() != 10) {
            System.out.println("Invalid account number, please enter a 10-digit account number");
            return;
        }

        for (int index = 0; index < users.size(); index++) {
            String userInfo = users.get(index);
            long accountNumber = Long.parseLong(userInfo.split("\n")[2].split(": ")[1]);

            if (accountNumber == accountNumberToClose) {
                users.remove(index);
                System.out.println("Account closed successfully.");
                return;
            }
        }
        System.out.println("Account not found");
    }
}
