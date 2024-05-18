import java.util.Scanner;

public class CreditCard{
    public static void main(String... args){

        Scanner input = new Scanner(System.in);

        System.out.print("Kindly enter your card details to confirm: ");
        String cardNumber = input.nextLine();

        if (cardNumber.length() < 13 || cardNumber.length() > 16){
            System.out.println("invalid credit card number!");
        } else{
            String cardType;
            if (cardNumber.startsWith("4")){
                cardType = "visa";
            }else if (cardNumber.startsWith("5")){
                cardType = "MasterCard";
            } else if (cardNumber.startsWith("37")){
                cardType = "American Express";
            } else if (cardNumber.startsWith("6")){
                cardType = "Discover";
            }else { 
                cardType = "unknown";
            }
int oddSum = 0;
int evenSum = 0;

for ( int i = cardNumber.length() -1; i >= 0; i -=2){
 oddSum += Character.getNumericValue(cardNumber.charAt(i));
} 

for ( int i = cardNumber.length() -2; i >= 0; i-=2){
int digit = 2 * Character.getNumericValue(cardNumber.charAt(i));
 evenSum +=  (digit / 10) + (digit % 10);
}

int totalSum = oddSum + evenSum;
if ( totalSum % 10 == 0){
        
            System.out.println("Credit Card Type: " + cardType);
	    System.out.println("Credit Card Number: " + cardNumber);
	    System.out.println("Credit Card Length: " + cardNumber.length());
	    System.out.println("Credit Card Validity Status: valid");
	  
} else {
	    System.out.println("Credit Card Type: Invalid card");
	    System.out.println("Credit Card Number: " + cardNumber);
	    System.out.println("Credit Card Length: " + cardNumber.length());
	    System.out.println("Credit Card Validity Status: invalid");


}
}
    }
}