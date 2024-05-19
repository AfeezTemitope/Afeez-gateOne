const prompt = require('prompt-sync')();

let users = [];

function printOptions(){
        const bankMenu = `
        ============================
          ||||BANKE BANK MENU||||            
        ============================
        >1. CREATE ACCOUNT         
        first name, last name, pin 
        >2. CLOSE ACCOUNT          
	    >3. DEPOSIT             
	    >4. WITHDRAW           
        >5. CHECK BALANCE          
        >6. TRANSFER FUND          
        >7. CHANGE PIN             
        ============================
        `;
        console.log(bankMenu)
}
function chooseOption() {    
        const options = prompt("Choose an option between (1-7): ")
	return options;
}
function accountCreations() {
	let firstName = prompt("Enter firstName: ");
	let lastName = prompt("Enter lastName: ");

    while(true) {
        let pin = prompt("Choose your personal 4-digit code: ");
        if(pin.length != 4) {
            console.log("Invalid pin, please enter a valid 4-digit code");
        } else {
            console.log("Pin successfully created");

            let accountNumber = Math.floor(Math.random() * (9999 - 1000 + 1)) + 1000;
            users.push(firstName + " " + lastName + "\nYour pin: " + pin + "\nYour account number is: " + accountNumber + "\nBalance: 0");
            console.log("Your details: " + users);
            break;
        }
    }
}
function closeAccount(){
	let accountNumberToClose = parseInt(prompt("Enter the account number of account to close: "))
	if (isNaN(accountNumberToClose)) {
        console.log("Invalid input. Please enter a number.");
        return;
	}
	for(let index = 0; index < users.length; index++){
	let userInfo = users[index]
	let accountNumber = parseInt(userInfo.split("\n")[2].split(": ")[1])

	if(accountNumber === accountNumberToClose){
	users.splice(index,1)
	console.log("Account closed successfully. ")
	return;
	}
	}
	console.log("Account not found ")
}
function depositFunds() {
    try {
        let accountNumber = prompt("Enter your account number: ");
        let pin = prompt("Enter your pin: ");
        let amount = parseFloat(prompt("Enter the amount to deposit: "));

        let userInfo = null;
        for (let user of users) {
            let userInfoParts = user.split("\n");
            let userAccountNumber = parseInt(userInfoParts[2].split(": ")[1].trim());
            let userPin = userInfoParts[1].split(": ")[1].trim();
            if (userAccountNumber == accountNumber && userPin == pin) {
                userInfo = user;
                break;
            }
        }
        if (userInfo == null) {
            console.log("Invalid account number or pin.");
            return;
        }
        let balance = parseFloat(userInfo.split("\n")[3].split(": ")[1]);
        balance += amount;
        userInfo = userInfo.split("\n")[0] + "\n" + userInfo.split("\n")[1] + "\n" + userInfo.split("\n")[2] + "\nBalance: " + balance;
        for (let i = 0; i < users.length; i++) {
            if (users[i].split("\n")[2].split(": ")[1] == String(accountNumber)) {
                users[i] = userInfo;
            }
        }
        console.log("Deposit successful. Your new balance is: " + balance);
    } catch (e) {
        console.log("Invalid input. Please enter the correct type of value.");
    }
}


while(true){
console.log()
printOptions()
switch(chooseOption()){
	case "1":
		accountCreations()
		break;
	case "2":
		closeAccount()
		break;
	case "3":
		depositFunds()
		break;
	default:
		console.log("invalid input exiting now!!! ")
		process.exit()
}
}
