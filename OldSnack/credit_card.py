try:
        card_number = int(input("Enter the credit card number: "))
        card_number_str = str(card_number)
        if len(card_number_str) < 13 or len(card_number_str) > 16:
            print("Invalid credit card number!")
        else:
            card_type = ""
            if card_number_str.startswith("4"):
                card_type = "Visa"
            elif card_number_str.startswith("5"):
                card_type = "MasterCard"
            elif card_number_str.startswith("37"):
                card_type = "American Express"
            elif card_number_str.startswith("6"):
                card_type = "Discover"
            else:
                card_type = "unknown"

            odd_sum = 0
            even_sum = 0

            for i in range(len(card_number_str) - 1, -1, -2):
                odd_sum += int(card_number_str[i])

            for i in range(len(card_number_str) - 2, -1, -2):
                digit = 2 * int(card_number_str[i])
                even_sum += (digit // 10) + (digit % 10)

            total_sum = odd_sum + even_sum
            if total_sum % 10 == 0:
                print(f"Credit Card Type: {card_type}")
                print(f"Credit Card Number: {card_number}")
                print(f"Credit Card Length: {len(card_number_str)}")
                print("Credit Card Validity Status: valid")
            else:
                print("Credit Card Type: Invalid card")
                print(f"Credit Card Number: {card_number}")
                print(f"Credit Card Length: {len(card_number_str)}")
                print("Credit Card Validity Status: invalid")
except ValueError:
        print("Invalid input. Please enter a valid integer.")