def interpret_category(category_name, selection_a, selection_b):
	if selection_a > selection_b:
		print(f"{category_name}: You are more EXTROVERTED.")
	elif selection_a < selection_b:
		print(f"{category_name}: You are more INTROVERTED.")
	else:
		print(f"{category_name}: You have a balanced EXTROVERTED and INTROVERTED tendency.")

def get_input(question):
	while True:
		answer = input(question).lower()
		 if answer in ['a', 'b']:
		return answer
       		else:
            			print("Error: Expected 'A' or 'B' as a response.")

def main():
    selection_a1, selection_b1 = 0, 0
    selection_a2, selection_b2 = 0, 0
    selection_a3, selection_b3 = 0, 0

    print("What is your name?")
    name = input()

    print(f"Hello, {name}! Let's start the personality test.\n")

    # Extroverted Vs Introverted questions
    questions = [
        "A. expend energy, enjoy groups         B. Conserve energy, enjoy one-on-one",
        "A. More outgoing, think out loud         B. More reserved, think to yourself",
        "A. Seek many tasks, Public activities, Interaction with Others         B. Seek private, Solitary activities with quiet to concentrate",
        "A. External, Communicate, Express yourself         B. Internal, Reticent, keep to yourself",
        "A. Active, Initiate         B. Reflective, Deliberate"
    ]

    for question in questions:
        answer = get_input(question + "\n")
        if answer == 'a':
            selection_a1 += 1
        else:
            selection_b1 += 1

    print(f"Number of A selected is: {selection_a1}")
    print(f"Number of B selected is: {selection_b1}")
    interpret_category("Extroverted vs Introverted", selection_a1, selection_b1)
    print("\n"


    # Extroverted Vs Introverted questions
    questions = [
        "A. expend energy, enjoy groups         B. Conserve energy, enjoy one-on-one",
        "A. More outgoing, think out loud         B. More reserved, think to yourself",
        "A. Seek many tasks, Public activities, Interaction with Others         B. Seek private, Solitary activities with quiet to concentrate",
        "A. External, Communicate, Express yourself         B. Internal, Reticent, keep to yourself",
        "A. Active, Initiate         B. Reflective, Deliberate"
    ]

    for question in questions:
        print(question)
        answer = input().lower()

        if answer == 'a':
            selection_a1 += 1
        elif answer == 'b':
            selection_b1 += 1
        else:
            print("Error: Expected A or B as a response")

    print(f"Number of A selected is: {selection_a1}")
    print(f"Number of B selected is: {selection_b1}")
    interpret_category("Extroverted vs Introverted: ", selection_a1, selection_b1)
    print("\n")

    # Sensing Vs Intuitive
    questions2 = [
        "A. Intercept literally         B. Look for meaning and possibility",
        "A. Practical, realistic, experiential         B. Imaginative, Innovative Theoretical",
        "A. Standard, Usual, conventional         B. Different, Novel, Unique",
        "A. Focus on here-and-now         B. Look to the future, global perspective, big picture",
        "A. Facts, things, what is         B. Ideas, dreams, what could be, Philosophical"
    ]

    for question in questions2:
        print(question)
        answer = input().lower()

        if answer == 'a':
            selection_a2 += 1
        elif answer == 'b':
            selection_b2 += 1
        else:
            print("Error: Expected A or B as a response")

    print(f"Number of A selected is: {selection_a2}")
    print(f"Number of B selected is: {selection_b2}")
    interpret_category("SENSING vs INTUITIVE: ", selection_a2, selection_b2)
    print("\n")

    # Thinking T vs Feeling F
    questions3 = [
        "A. Logical, thinking, questioning         B. Empathetic, feeling, accommodating",
        "A. Candid, straight forward, frank         B. Tactful, kind, encouraging",
        "A. Firm, tend to criticize, hold the line         B. Gentle, tend to appreciate, conciliate",
        "A. Tough-minded, just        B. Tender-hearted, merciful",
        "A. Matter of fact, issue-oriented      B. Sensitive, people oriented, compassionate"
    ]

    for question in questions3:
        print(question)
        answer = input().lower()

        if answer == 'a':
            selection_a3 += 1
        elif answer == 'b':
            selection_b3 += 1
        else:
            print("Error: Expected A or B as a response")

    print(f"Number of A selected is: {selection_a3}")
    print(f"Number of B selected is: {selection_b3}")
    interpret_category("THINKING vs FEELING: ", selection_a3, selection_b3)
    print("\n")

    # Judging J Vs Perceptive
    questions4 = [
        "A. Organized, orderly         B. Flexible, adaptable",
        "A. Plan, schedule         B. Unplanned, spontaneous",
        "A. Regulated, structured         B. Easy-going, live and let live",
        "A. Preparation, plan ahead         B. Go with the flow, adapt as you go",
        "A. Control, govern         B. Latitude, freedom"
    ]

    for question in questions4:
        print(question)
        answer = input().lower()

        if answer == 'a':
            selection_a4 += 1
        elif answer == 'b':
            selection_b4 += 1
        else:
            print("Error: Expected A or B as a response")

    print(f"Number of A selected is: {selection_a3}")
    print(f"Number of B selected is: {selection_b3}")
    interpret_category("JUDGING vs PERSPECTIVE: ", selection_a4, selection_b4)
    print("\n")