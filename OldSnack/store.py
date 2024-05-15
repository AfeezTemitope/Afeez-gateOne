from datetime import datetime

customer_name = input("Customer name: ")
cashier_name = input("Cashier name: ")
date = datetime.now()

bad_afeez = []

subtotal = 0

add_more_items = "yes"

while add_more_items.lower() == "yes":
    user_item = input("What did you want to buy? ")
    quantity = int(input("How many pieces: "))
    price_of_one_item = int(input("How much per unit: "))
    total = quantity * price_of_one_item
    subtotal += total
    bad_afeez.append((user_item, quantity, price_of_one_item, total))
    add_more_items = input("Do you want to add another item? (yes/no): ")

discount_percentage = int(input("Enter discount percentage: "))
discount = subtotal * (discount_percentage / 100)

vat_percentage = 17.50 / 100
vat = vat_percentage * subtotal
bill_total = (subtotal - discount) + vat

print("")
print("SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03293828343")
print(f"CASHIER: {cashier_name}\nCUSTOMER NAME: {customer_name}\t")
print(f"DATE: {date}\n")
print("==========================================")
print("ITEM\tQTY\tPRICE\tTOTAL(NGN)")

for item, qty, price, item_total in bad_afeez:
    print(f"{item}\t{qty}\t{price}\t{item_total:.2f}")

print("-------------------------------------------")
print(f"Sub-Total: {subtotal:.2f}")
print(f"Discount: {discount:.2f}")
print(f"VAT @ 17.50%: {vat:.2f}\n")
print("==========================================")
print(f"Bill Total: {bill_total:.2f}\n")
print("==========================================")
print(f"THIS IS NOT A RECEIPT. KINDLY PAY {bill_total:.2f}\n")
print("==========================================\n")

paid = float(input("How much did the customer give you?: "))
print("")
print("SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03293828343")
print(f"CASHIER: {cashier_name}\nCUSTOMER NAME: {customer_name}\t")
print(f"DATE: {date}\n")
print("==========================================")
print("ITEM\tQTY\tPRICE\tTOTAL(NGN)")

for item, qty, price, item_total in bad_afeez:
    print(f"{item}\t{qty}\t{price}\t{item_total:.2f}")
print("-------------------------------------------")
print(f"Sub-Total: {subtotal:.2f}")
print(f"Discount: {discount:.2f}")
print(f"VAT @ 17.50%: {vat:.2f}\n")
print("==========================================")
print("==========================================")
print(f"Bill Total: {bill_total:.2f}")
print(f"Amount Paid: {paid:.2f}")
print(f"Balance: {paid - bill_total:.2f}\n")
print("==========================================")
print("THANK YOU FOR YOUR PATRONAGE")