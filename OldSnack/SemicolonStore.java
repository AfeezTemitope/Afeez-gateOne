import java.util.*;
public class SemicolonStore {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();

        String cashierName;
        String customerName;
        String userItem;
        double quantity;
        double priceOfOneItem;
        String continueShopping;
        double total = 0;
        double discount = 0;
        double vatPercentage = 17.50 / 100;

        System.out.print("Customer name: ");
        customerName = scanner.nextLine();
        System.out.print("Cashier name: ");
        cashierName = scanner.nextLine();
        List<Object> badAfeez = new ArrayList<>(); 

        do {
            System.out.print("What did you want to buy? ");
            userItem = scanner.nextLine();

            System.out.print("How many pieces: ");
            quantity = scanner.nextInt();

            System.out.print("How much per unit: ");
            priceOfOneItem = scanner.nextInt();
            total += quantity * priceOfOneItem;
            badAfeez.add("\t" + userItem + "\t" + quantity + "\t" + priceOfOneItem + "\t" + quantity * priceOfOneItem);
            System.out.print("Do you want to buy something else? (yes/no): ");
            scanner.nextLine(); 
            continueShopping = scanner.nextLine();

        } while (continueShopping.equalsIgnoreCase("yes"));

        System.out.print("Enter discount percentage: ");
        discount = scanner.nextInt();
        discount = total * (discount / 100);

	
	double VAT = vatPercentage * total;
        double billTotal = (total  - discount) + VAT;
        System.out.println("******************");
        System.out.println("SEMICOLON  STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03293828343");
        System.out.println("CASHIER: " + cashierName + "\n" + "CUSTOMER NAME: " + " " + customerName +"\t");
        System.out.println("DATE: " + date); 
        System.out.println("                  ");
        System.out.println("==========================================");
        System.out.println("\tITEM\tQTY\tPRICE\tTOTAL(NGN)");

        for (Object item : badAfeez) {
            System.out.println(item);
        }
        System.out.println("-------------------------------------------");
        System.out.printf("Sub-Total: %.2f\n",  total);
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("VAT @ 17.50%% : %.2f\n", VAT);
        System.out.println("\n==========================================\n");
        System.out.printf("Bill Total: %.2f\n", billTotal);
        System.out.println("\n==========================================\n");
        System.out.printf("THIS IS NOT A RECIEPT KINDLY PAY %.2f\n", billTotal);
        System.out.println("\n==========================================\n");
        System.out.println("\n How much did the customer gave to you?\n");
        System.out.print("How much did the customer gave to you?: ");
        double paid = scanner.nextInt();
        System.out.println("******************");
        System.out.println("SEMICOLON  STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03293828343");
        System.out.println("CASHIER: " + cashierName + "\n" + "CUSTOMER NAME: " + " " + customerName +"\t");
        System.out.println("DATE: " + date); 
        System.out.println("                  ");
        System.out.println("==========================================");
        System.out.println("\tITEM\tQTY\tPRICE\tTOTAL(NGN)");

        for (Object item : badAfeez) {
            System.out.println(item);
        }
        
        System.out.println("-------------------------------------------");
        System.out.printf("Sub-Total: %.2f\n",  total);
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("VAT @ 17.50%% : %.2f\n", VAT);
        System.out.println("\n==========================================\n");
        System.out.printf("Bill Total: %.2f\n", billTotal);
        System.out.printf("Amount Paid: %.2f\n", paid);
        System.out.printf("Balance: %.2f", paid - billTotal);
        System.out.println("\n==========================================\n");
        System.out.println("\n THANK YOU FOR YOUR PATRONAGE ");

    }
}