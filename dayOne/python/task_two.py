score_count = 0
total = 0
SCORE = 10

print("Enter 10 score")
for i in range(10):
	score = int(input("enter score "))
	total += score

average = total / SCORE
print(f"the total sum is {average}")