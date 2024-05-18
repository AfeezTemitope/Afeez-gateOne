public class gateOneFunctions{

	public static int evenIndex(int[] numbers){
	int [] result = new int[numbers.length / 2];
		
		for ( int index = 0; index < numbers.length; index+=2){
		result[index / 2] = numbers[index];
		}
return result;	
	}


	public static int oddIndex(int[] numbers){
	int [] result = new int[numbers.length / 2];
		
	for ( int index = 1; index < numbers.length; index+=2){
	result[index / 2] = numbers[index];
		}
return result;	
	}

public static int sumOddIndex(int[] numbers) {
    int sum = 0;
    for (int i = 1; i < numbers.length; i+=2) {
            sum += numbers[i];
        }
    return sum;
}
		






}