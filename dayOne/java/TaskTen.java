import java.util.Scanner;
public class TaskTen{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
int score = 0;
int total = 0;
double average = 0;
int SCORE = 10;

	System.out.println("Enter 10 score");
	for(int index = 0; index < 10; index++){
	System.out.print("Enter score" + " " + (index + 1) + " : ");
	score = scanner.nextInt();
	if (score > 0 && score < 100){
	total+= score;
	average = total / SCORE;

	}
	}

	System.out.println("Total sum of valid score is " + total);
	System.out.printf("Total average of all valid score is %.2f", average);	
	}





}