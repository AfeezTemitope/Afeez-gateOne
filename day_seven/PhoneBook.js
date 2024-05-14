const prompt = require('prompt-sync')();
var myPhonebook = {}

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
	myPhonebook.push(name: addContact, number: addContactNumber)
	console.log("Contact saved successfully. ")
	break;

case "2": 
	if (this.myPhonebook.length !== 0) {
	const deleteContact = prompt("Enter the name of contact u want to delete ")
	if (myphonebook.hasOwnProperty(deleteContact)) {
        delete myphonebook[removeContact];
        console.log(`Contact ${removeContact} has been removed from the phonebook.`);
	} else {
        console.log(`Contact ${removeContact} not found in the phonebook.`);
    	}
} 	else {
    	console.log("Phonebook is empty. No contact to remove.");
	}
		break;

	
default:
	console.log("invalid option. please choose a valid option")
	return;

}



}
}