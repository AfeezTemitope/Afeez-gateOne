import java.util.Scanner;
public class TaskOne{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
int score = 0;
int total = 0;
System.out.println("Enter 10 score");
for(int index = 0; index < 10; index++){
System.out.print("Enter score" + " " + (index + 1) + " : ");
score = scanner.nextInt();
total += score;

	}
System.out.println("Sum of all 10 score is " + total);

	
	}





}