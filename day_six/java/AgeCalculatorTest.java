import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeCalculatorTest {
	@Test
	public void testAgeCalculator(){
	assertEquals(26, AgeCalculator.ageCalculator("04/01/1998"));

	}
}