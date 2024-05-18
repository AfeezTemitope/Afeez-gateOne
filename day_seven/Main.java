import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) { 
            long randomNumber = random.nextLong(1_000_000_000L,10_000_000_000L);
            System.out.println("Random 10-digit number: " + randomNumber);
        }
    }
}