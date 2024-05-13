import java.util.ArrayList;
import java.util.Scanner;

	public class Phonebook {
		public static void main(String... args){
			ArrayList<String> myPhonebook = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		printPrompt();
		String userInput = scanner.nextLine().toLowerCase();

		}







public static void printPrompt(){
String prompt = """ 
 =================================
|>>>>>WELCOME TO MY PHONEBOOK<<<<<|
 =================================
   Do you want to add a contact?? """;
System.out.println(prompt);
}
	}