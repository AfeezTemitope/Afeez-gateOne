import java.util.Scanner;
public class TaskEight{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
int score = 0;
int total = 0;

	System.out.println("Enter 10 score");
	for(int index = 0; index < 10; index++){
	System.out.print("Enter score" + " " + (index + 1) + " : ");
	score = scanner.nextInt();
	if (score > 0 && score < 100){
	total+= score;
	} else {
	System.out.println("invalid input");
	}
	}
	System.out.println("Total sum of valid score is " + total);	
	}





}