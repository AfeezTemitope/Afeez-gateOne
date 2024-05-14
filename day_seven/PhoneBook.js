const prompt = require('prompt-sync')();
var myPhonebook = []

function printPrompt(){
const prompt =`
 =================================
|>>>>>WELCOME TO MY PHONEBOOK<<<<<|
 =================================
   Do you want to add a contact 'yes or no' ?? `;
console.log(prompt)

} 

function availableOptions() {
    const promptText = `
        AVAILABLE OPTIONS
        > 1. Add Contact
        > 2. Remove Contact
        > 3. Search Contact
        > 4. Edit Contact
        > 5. Exit `;
    console.log(promptText)
}

	printPrompt()
	const userInput = prompt().toLowerCase()
	if(userInput === "yes"){
	availableOptions()
while(true){
	const availableOption = prompt("choose an option ")
switch(availableOption){

case "1":
	const addContact = prompt("Enter the name u want to save ")
	const addContactNumber = prompt("Enter phone number ")
	myPhonebook.push(addContact, addContactNumber)
	console.log("Contact saved successfully. ")
	break;

case "2":
	if(myPhonebook.length !== 0){
	const removeContact = prompt("Enter the name of the contact to remove ")
	if(myPhonebook.includes(removeContact)){
	myPhonebook.splice(removeContact)
	console.log(`contact ${removeContact} has been removed`)
	}else {
	console.log(`contact ${removeContact} not found in myPhonebook`)
	}
	} else {
	console.log("phonebook is empty no contact to remove ")
	} 
	break;

case "3":
	const searchContact = prompt("Enter contact u want to search for... ")
	if (myPhonebook.includes(searchContact)){
	console.log(`contact ${searchContact}  found in the phoneBook`)
	} else {
	console.log(`contact ${searchContact} not found in the phonebook`)
	}
		break;
case "4":


	
default:
	console.log("invalid option. please choose a valid option")
	return;

}
}


}
