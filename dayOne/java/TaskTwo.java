import java.util.Scanner;
public class TaskTwo{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
int scoreCount = 0;
int total = 0;
int average = 0;
int SCORE = 10;
	System.out.println("Enter 10 score");
	for(int index = 0; index < 10; index++){
	System.out.print("Enter score" + " " + (index + 1) + " : ");
		scoreCount = scanner.nextInt();
		total += scoreCount;

		average = total / SCORE;



	}

System.out.println("Averagescore of all 10 score is " + average);

	
	}





}