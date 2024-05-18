import java.util.Scanner;
public class TaskSeven{
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
if (score % 2 == 0){
total += score;
average = total / SCORE;

	}
}
System.out.println("Sum of all even score is " + total);
System.out.printf("Average of all even score is %.2f\n",average);

	
	}





}