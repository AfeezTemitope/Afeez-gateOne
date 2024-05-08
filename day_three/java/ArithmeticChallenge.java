import java.util.Random;
import java.util.Scanner;

public class ArithmeticChallenge {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalAttempts = 10;
        int correctAttempts = 0;
	int count = 0;

        printHeader();

        for (int attempt = 1; attempt <= totalAttempts; attempt++) {
            int firstInteger = random.nextInt(10) + 1;
            int secondInteger = random.nextInt(10) + 1;
            char operator = randomOperator();
	System.out.print("question " + attempt + " " +firstInteger + secondInteger);
	int result = scanner.nextInt();
	
	
        }
    }

    public static void printHeader() {
        String prompt = """
            WELCOME TO THE
            ARITHMETIC CHALLENGE
            ========================
            You have 10 attempts to solve
            random arithmetic problems
            ===========================""";
        System.out.println(prompt);
    }

    public static char randomOperator() {
        char[] operators = {'+', '-', '*', '/'};
        Random random = new Random();
        return operators[random.nextInt(operators.length)];
    }

    public static double calculateResult(int firstInteger, char operator, int secondInteger) {
        switch (operator) {
            case '+':
                return firstInteger + secondInteger;
            case '-':
                return firstInteger - secondInteger;
            case '*':
                return firstInteger * secondInteger;
            case '/':
                return (double) firstInteger / secondInteger;
            default:
                System.out.println("Invalid operator: " + operator);
                return 0.0;
        }
    }
}
