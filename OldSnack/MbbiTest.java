import java.util.Scanner;

public class MbbiTest {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int selectionA1 = 0, selectionB1 = 0, selectionA2 = 0, selectionB2 = 0, selectionA3 = 0, selectionB3 = 0, selectionA4 = 0, selectionB4 = 0;
	String[] selectedAnswers = new String[5];


        System.out.println("What is your name");
        String name = scanner.nextLine();
        // Extroverted Vs Introverted questions
	String[] questions = {
	"A. expend energy, enjoy groups         B. Conserve energy, enjoy one-on-one",
	"A. More outgoing, think out loud         B. More reserved, think to yourself",
	"A. Seek many tasks, Public activities, Interaction with Others         B. Seek private, Solitary activities with quiet to concentrate",
	"A. External, Communicate, Express yourself         B. Internal, Reticent, keep to yourself",
	"A. Active, Initiate         B. Reflective, Deliberate"
        };
	for (int i = 0; i < questions.length; i++) {
                boolean validInput = false;
            while (!validInput) {
	System.out.println(questions[i]);
        char answer = scanner.next().charAt(0);

	if (answer == 'A' || answer == 'a') {
        	selectionA1++;
		selectedAnswers[i] = "A";
                validInput = true;
        } else if (answer == 'B' || answer == 'b') {
        	selectionB1++;
		selectedAnswers[i] = "B";
                validInput = true;
        } else {
        System.out.println("Error expected A or B as a response");
        }
        }
        }

	System.out.println("Hello " + name);
        System.out.println("You selected:");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i] + " " + selectedAnswers[i]);
        }
        System.out.println("Number of A selected is: " + selectionA1);
        System.out.println("Number of B selected is: " + selectionB1);
	interpretCategory("Extroverted vs Introverted: ", selectionA1, selectionB1);
	printLine();


        // Sensing Vs Intuitive
        String[] questions2 = {
	"A. Intercept literally         B. Look for meaning and possibility",
        "A. Practical, realistic, experiential         B. Imaginative, Innovative Theoretical",
        "A. Standard, Usual, conventional         B. Different, Novel, Unique",
	"A. Focus on here-and-now,	B. look to the future, global perspective, big picture",
	"A. facts, things, what is,	B. ideas, dreams, what could be, Philosophical",
        };

	for (String question : questions2) {
                boolean validInput = false;
                while (!validInput) {
        System.out.println(question);
        char answer = scanner.next().charAt(0);

	if (answer == 'A' || answer == 'a') {
                selectionA2++;
                validInput = true;
	} else if (answer == 'B' || answer == 'b') {
                selectionB2++;
                validInput = true;
        } else {
                System.out.println("Error expected A or B as a response");
        }
        }
        }
        System.out.println("Number of A selected is: " + selectionA2);
        System.out.println("Number of B selected is: " + selectionB2);
	interpretCategory1("SENSING vs INTUITIVE: ",selectionA2,selectionB2);
	printLine();

        //Thinking T vs Feeling F
	String[] questions3 = {
        "A. logigical, thinking,questioning         B. empathetic, feeling, accomodating",
        "A. Candid, straight forward, frank         B. Tactful, kind, encouraging",
        "A. firm, tend to criticize, hold the line, B. gentle, tend to appeciate, concilate",
        "A. tough-minded, just        B. tender-hearted, merciful",
        "A.Matter of fact, issue-oriented      B. Sensitive, People oriented, compassionate"
        };
        for (String question : questions3) {
                boolean validInput = false;
                while (!validInput){
        System.out.println(question);
        char answer = scanner.next().charAt(0);

	if (answer == 'A' || answer == 'a') {
                selectionA3++;
                validInput = true;
        } else if (answer == 'B' || answer == 'b') {
                selectionB3++;
                validInput = true;
        } else {
                System.out.println("Error expected A or B as a response");
        }
        }
        }
        System.out.println("Number of A selected is: " + selectionA3);
        System.out.println("Number of B selected is: " + selectionB3);
	interpretCategory2("THINKING vs FEELING: ",selectionA3,selectionB3);
	printLine();

	//Judging J Vs Perceptive
	String[] question4 = {
	"A. organized, orderly,   B. flexible, Adaptable",
	"A. plan, schedule,	B. unPlanned, spontenous",
	"A. regulated, structured,	B. easy-going, live abd let live",
	"A. preparation, plan ahead,	B. go with the flow, adapt as u go",
	"A. control, govern,	B. latitude, freedom"
	};
	for(String question : question4){
                boolean validInput = false;
                while (!validInput){
	System.out.println(question);
	char answer = scanner.next().charAt(0);

	if (answer == 'A' || answer == 'a'){
		selectionA4++;
                validInput = true;
	} else if (answer == 'B' || answer == 'b'){
		selectionB4++;
                validInput = true;
	} else {
		System.out.println("Error expected A or B as a response");
	}
        }
	}
        System.out.println("Number of A selected is: " + selectionA4);
        System.out.println("Number of B selected is: " + selectionB4);
	interpretCategory3("JUDGING vs PERSPECTIVE: ", selectionA4, selectionB4);
	printLine();
	printLine();
	printLine();
	printINFPInfo();


    }
	public static void printLine(){
	System.out.println("====================================================================================================================\n\n");
	}
		// Interpretation
	public static void interpretCategory(String categoryName, int selectionA1, int selectionB1) {
	System.out.println(categoryName + ": " + (selectionA1 > selectionB1 ? "You are more 'EXTROVERTED'." : "You are more 'INTROVERTED'."));
	}
	public static void interpretCategory1(String categoryName, int selectionA2, int selectionB2) {
	System.out.println(categoryName + ": " + (selectionA2 > selectionB2 ? "You are more 'SENSING'." : "You are more 'INTUITIVE'."));
	}
	public static void interpretCategory2(String categoryName, int selectionA3, int selectionB3) {
	System.out.println(categoryName + ": " + (selectionA3 > selectionB3 ? "You are more 'THINKING'." : "You are more 'FEEELING'."));
	}
	public static void interpretCategory3(String categoryName, int selectionA4, int selectionB4) {
	System.out.println(categoryName + ": " + (selectionA4 > selectionB4 ? "You are more 'JUDGING'." : "You are more 'PERSPECTIVE'."));
	}
	public static void printINFPInfo() {
        String prompt = """
        INFP
        Healer
        The Thoughtful Idealist (MBTI)
        The Mediator (16Personalities)
        The INFP Personality Type
        INFPs are imaginative idealists, guided by their own core values and beliefs.
        To a Healer, possibilities are paramount; 
        the realism of the moment is only of passing concern. 
        They see potential for a better future, 
        and pursue truth and meaning with their own individual flair.
        INFPs are sensitive, caring, and compassionate, and are deeply concerned with
        the personal growth of themselves and others. Individualistic and
        nonjudgmental, INFPs believe that each person must find their own path.
        They enjoy spending time exploring their own ideas and values, and are gently
        encouraging to others to do the same. INFPs are creative and often artistic;
        they enjoy finding new outlets for self-expression.
        What does INFP stand for?
        INFP is one of the sixteen personality types created by Katharine Briggs and
        Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTIO).
        INFP stands for Introversion, iNtuition, Feeling, and Perceiving, 
        which are four core personality traits based on the work of psychologist C.G. Jung.
        Each of the four letters of the INFP code signifies a key personality trait of this type.
        INFPs are energized by time alone (Introverted), focus on ideas and concepts rather than
        facts and details (iNtuitive), make decisions based on feelings and values (Feeling),
        and prefer to be spontaneous and flexible rather than planned and organized (Perceiving).
        """;
        System.out.println(prompt);
    }


}
