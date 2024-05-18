const prompt = require('prompt-sync')();
var myPhonebook = []

function printHeader(){
const prompt =`
 =================================
|>>>>>WELCOME TO MY PHONEBOOK<<<<<|
 =================================
     `;
console.log(prompt)

} 

function printAvailableOption() {
    const promptText = `
        AVAILABLE OPTIONS
        > 1. Add Contact
        > 2. Remove Contact
        > 3. Search Contact
        > 4. Edit Contact
        > 5. Exit `;
    console.log(promptText)
}

	printHeader()
	const userInput = prompt("Do you want to add a contact 'yes or no'?? ").toLowerCase()
	if(userInput === "yes"){
	
while(true){
	printAvailableOption()
	const userInput = prompt("choose an option ")
	
switch(userInput){

case "1":
	const contactName = prompt("Enter the name u want to save ")
	const contactNumber = prompt("Enter phone number ")
	myPhonebook.push(contactName, contactNumber)
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
	const oldContactName = prompt("Enter the current contact: ")
	if(myPhonebook.includes(oldContactName)){
	const newContactName = prompt("Enter the correct name for the contact ")
	const index = myPhonebook.indexOf(oldContactName)
	myPhonebook.splice(index, 1, newContactName)
	console.log(`contact ${oldContactName} updated to ${newContactName} .`)
	} else {
	console.log(`contact ${oldContactName} not found in the phonebook`)
	}
		break;	
default:
	console.log("invalid option. please choose a valid option")
	return;

}
}


}
