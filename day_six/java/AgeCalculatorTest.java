import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeCalculatorTest {
	@Test
	public void testAgeCalculator(){
	LocalDate currentDate = LocalDate.now();
	assertEquals(26, ageCalculator("04/01/1998"));

	}
}