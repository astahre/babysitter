import static org.junit.Assert.*;

import org.junit.Test;


public class HoursCalculationTest {

	@Test
	public void timeIn5TimeOut8NoBedtimeEquals3RegularHours() {
		HoursCalculation hc = new HoursCalculation();
		long[] expected = new long[3];
		expected[0] = 3;
		assertArrayEquals(expected, hc.calculateHours("05 PM", "08 PM", "09 PM"));
	}
	
	@Test
	public void timeIn5TimeOut9NoBedtimeEquals4RegularHours() {
		HoursCalculation hc = new HoursCalculation();
		long[] expected = new long[3];
		expected[0] = 4;
		assertArrayEquals(expected, hc.calculateHours("05 PM", "09 PM", "09 PM"));
	}

}
