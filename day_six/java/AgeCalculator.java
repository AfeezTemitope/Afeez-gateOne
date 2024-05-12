import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class AgeCalculator{
    public static int ageCalculator(String dateOfBirth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - birthDate.getYear();
    }
}