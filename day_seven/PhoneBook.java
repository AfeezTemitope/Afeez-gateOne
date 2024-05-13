import java.util.ArrayList;
import java.util.Scanner;

	public class Phonebook {
		public static void main(String... args){
			ArrayList<String> myPhonebook = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		printPrompt();
		String userInput = scanner.nextLine().toLowerCase();
	if (userInput.equals("yes")){
		availableOption();
		
	while(true){
		System.out.print("choose an option ");
		int availableOption = scanner.nextInt();
		scanner.nextLine();
	
	switch(availableOption){
	case 1: 
		System.out.print("Enter the name u want to save ");
		String addContact = scanner.nextLine();
		System.out.print("Enter phoneNumber ");
		int addContactNumber = scanner.nextInt();
		myPhonebook.add(addContact);
		System.out.print("Contact saved successfully. ");
			break;
	case 2:
	if(!myPhonebook.isEmpty()){
		System.out.print("Enter the name of the contact to remove ");
		String removeContact = scanner.nextLine();

		if (myPhonebook.contains(removeContact)){
		myPhonebook.remove(removeContact); 
		System.out.println("contact "+ removeContact +" has been removed from phonebook");
		}else{
		System.out.println("contact "+ removeContact +" not found in phonebook");
		}
		
	}	else{
		System.out.println("phonebook is empty no contact to remove ");
		}

			break;
	case 5:
		System.out.print("exiting phone book!!! ");
		return;

	default:
		System.out.println("Invalid option "); 
					
		}

	}
	}


		}







public static void printPrompt(){
String prompt = """ 
 =================================
|>>>>>WELCOME TO MY PHONEBOOK<<<<<|
 =================================
   Do you want to add a contact?? """;
System.out.println(prompt);
}

public static void availableOption(){
String prompt = """
	AVAILABLE OPTION
> 1. Add Contact
> 2. Remove Contact
> 3. Search Contact
> 4. Edit Contact
> 5. Exit """;
System.out.println(prompt);
}


	}