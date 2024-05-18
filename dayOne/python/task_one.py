score = 0
total = 0

print("Enter 10 score")
for i in range(10):
	score = int(input("enter score "))
	total += score
print(f"the total sum is {total}")