def add_contact(phonebook):
    name = input("Enter the name you want to save: ")
    phone_number = input("Enter the phone number: ")
    phonebook[name] = phone_number
    print(f"Contact '{name}' saved successfully in the phonebook.")

def remove_contact(phonebook):
    name = input("Enter the name of the contact to remove: ")
    if name in phonebook:
        del phonebook[name]
        print(f"Contact '{name}' removed from the phonebook.")
    else:
        print(f"Contact '{name}' not found in the phonebook.")

def search_contact(phonebook):
    name = input("Enter the name to search: ")
    if name in phonebook:
        print(f"Contact '{name}' found in the phonebook. Phone number: {phonebook[name]}")
    else:
        print(f"Contact '{name}' not found in the phonebook.")

def edit_contact(phonebook):
    old_name = input("Enter the current name of the contact: ")
    if old_name in phonebook:
        new_name = input("Enter the correct name for the contact: ")
        phonebook[new_name] = phonebook.pop(old_name)
        print(f"Contact '{old_name}' updated to '{new_name}'.")
    else:
        print(f"Contact '{old_name}' not found in the phonebook.")


phonebook = {}
while True:
        print("=======================")
        print("DO YOU WANT TO ADD A CONTACT ON MY PHONEBOOK")
        print("=======================")
        user_input = input("YES or NO: ").lower()
        if user_input == "yes":
            print("AVAILABLE OPTIONS")
            print("1. Add Contact")
            print("2. Remove contact")
            print("3. Search contact")
            print("4. Edit contact")
            print("5. Exit")
            try:
                available_option = int(input("Enter an available option number: "))
                if available_option == 1:
                    add_contact(phonebook)
                elif available_option == 2:
                    remove_contact(phonebook)
                elif available_option == 3:
                    search_contact(phonebook)
                elif available_option == 4:
                    edit_contact(phonebook)
                elif available_option == 5:
                    print("Exiting phonebook. Have a great day!")
                    break
                else:
                    print("Invalid option. Please choose a valid option (1, 2, 3, 4, or 5).")
            except ValueError:
                print("Invalid input. Please enter a valid option number.")
        else:
            print("NO conTacT avaiLabLe")

