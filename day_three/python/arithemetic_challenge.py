import random

def generate_arithmetic_problem():
	first_number = random.randint(1, 10)
	second_number = random.randint(1, 10)
	operator = ("*", "+", "-", "/")
	selected_operator = random.choice(operator)
	calculation = f"{first_number} {selected_operator} {second_number}"
	if selected_operator == "+":
        	correct_answer = first_number + second_number
	elif selected_operator == "-":
        	correct_answer = first_number - second_number
	elif selected_operator == "*":
        	correct_answer = first_number * second_number
	else:
        	correct_answer = first_number / second_number 
	return selected_operator, calculation, correct_answer






total_attempts = 10
correct_attempts = 0

print("Welcome to the Arithmetic Challenge!\nYou have 10 attempts to solve random arithmetic problems.")
print()
for attempt in range(total_attempts):
	correct_operator, problem, correct_answer = generate_arithmetic_problem()
	user_answer = float(input(f"Attempt {attempt + 1}: What is {problem} ? "))

	if user_answer == correct_answer:
		print("Correct!  ")
		correct_attempts += 1
	else:
		print(f"Incorrect. The correct answer was {correct_answer}.")

print("\nChallenge completed!")
print(f"Total correct attempts: {correct_attempts}/{total_attempts}")
print(f"Your final score: {correct_attempts * 10}%")



