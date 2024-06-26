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
		String addContactNumber = scanner.nextLine();		
		myPhonebook.add(addContact);
		myPhonebook.add(addContactNumber);
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
	case 3:
		System.out.print("Enter contact u want to search for ");
		String searchContact = scanner.nextLine();
		if (myPhonebook.contains(searchContact)){
		System.out.println("contact "+ searchContact + " found in the phonebook");
		} else {
		System.out.println("contact "+ searchContact + " not found in the phonebook" );
		}
			break;

	case 4:
		System.out.print("Enter the current name of the contact: ");
		String oldName = scanner.nextLine();
		if (myPhonebook.contains(oldName)) {
		System.out.print("Enter the correct name for the contact: ");
		String newName = scanner.nextLine();
		myPhonebook.set(myPhonebook.indexOf(oldName), newName);
		System.out.println("Contact '" + oldName + "' updated to '" + newName + "'.");
		} else {
		System.out.println("Contact '" + oldName + "' not found in the phonebook.");
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
   Do you want to add a contact 'yes or no' ?? """;
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