import java.util.Scanner;

public class TaskTwo{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);


int [] array = new int[10];
System.out.println("Enter 10 score");
for(int index = 0; index < 10; index++){
System.out.print("Enter score" + " " + (index + 1) + " : ");
array[index] = scanner.nextInt();


	}
for(int numbers : array){
System.out.print(numbers);
}

}

}