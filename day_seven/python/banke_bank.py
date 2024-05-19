def close_account():
	account_number_to_close = input("Enter the account number of the account to close: ")
		try:
        	account_number_to_close = int(account_number_to_close)
	except ValueError:
        	print("Invalid input. Please enter a number.")
        	return

	for index, user_info in enumerate(users):
        	account_number = int(user_info.split("\n")[2].split(": ")[1])

        if account_number == account_number_to_close:
            users.pop(index)
            print("Account closed successfully.")
            return

	print("Account not found")

def depositFunds():
    try:
	accountNumber = int(input("Enter your account number: "))
        pin = input("Enter your pin: ")
        amount = float(input("Enter the amount to deposit: "))

        userInfo = None
        for user in users:
            userInfoParts = user.split("\n")
            userAccountNumber = int(userInfoParts[2].split(": ")[1].strip())
            userPin = userInfoParts[1].split(": ")[1].strip()
            if userAccountNumber == accountNumber and userPin == pin:
                userInfo = user
                break

        if userInfo is None:
            print("Invalid account number or pin.")
            return

        balance = float(userInfo.split("\n")[3].split(": ")[1])
        balance += amount
        userInfo = userInfo.split("\n")[0] + "\n" + userInfo.split("\n")[1] + "\n" + userInfo.split("\n")[2] + "\nBalance: " + str(balance)
        for i in range(len(users)):
            if users[i].split("\n")[2].split(": ")[1] == str(accountNumber):
                users[i] = userInfo

        print("Deposit successful. Your new balance is: ", balance)
    except ValueError:
        print("Invalid input. Please enter the correct type of value.")
