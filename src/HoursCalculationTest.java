import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class HoursCalculationTest {
	
	private long[] expected;
	
	@Before
	public void beforeEachTest() {
		expected = new long[3];
	}

	@Test
	public void timeIn5TimeOut8NoBedtimeEquals3RegularHours() {
		expected[0] = 3;
		assertArrayEquals(expected, HoursCalculation.calculateHours("05 PM", "08 PM", null));
	}
	
	@Test
	public void timeIn5TimeOut9NoBedtimeEquals4RegularHours() {
		expected[0] = 4;
		assertArrayEquals(expected, HoursCalculation.calculateHours("05 PM", "09 PM", null));
	}
	
	@Test
	public void timeIn5TimeOut10Bedtime9Equals4RegularHoursAnd1PostBedtimeHour() {
		expected[0] = 4;
		expected[1] = 1;
		assertArrayEquals(expected, HoursCalculation.calculateHours("05 PM", "10 PM", "09 PM"));
	}
	
	@Test
	public void timeIn5TimeOut1Bedtime9Equals4RegularHours3PostBedtimeHoursAnd1PostMidnightHour() {
		expected[0] = 4;
		expected[1] = 3;
		expected[2] = 1;
		assertArrayEquals(expected, HoursCalculation.calculateHours("05 PM", "01 AM", "09 PM"));
	}

}
