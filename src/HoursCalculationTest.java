import static org.junit.Assert.*;

import org.junit.Test;


public class HoursCalculationTest {

	@Test
	public void timeIn5TimeOut8NoBedtimeEquals3RegularHours() {
		HoursCalculation hc = new HoursCalculation();
		int[] expected = new int[3];
		expected[0] = 3;
		assertArrayEquals(expected, hc.calculateHours("05 PM", "08 PM", "09 PM"));
	}

}
