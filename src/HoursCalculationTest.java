import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class HoursCalculationTest {
	
	private HoursCalculation hc;
	private long[] expected;
	
	@Before
	public void beforeEachTest() {
		hc = new HoursCalculation();
		expected = new long[3];
	}

	@Test
	public void timeIn5TimeOut8NoBedtimeEquals3RegularHours() {
		expected[0] = 3;
		assertArrayEquals(expected, hc.calculateHours("05 PM", "08 PM", "09 PM"));
	}
	
	@Test
	public void timeIn5TimeOut9NoBedtimeEquals4RegularHours() {
		expected[0] = 4;
		assertArrayEquals(expected, hc.calculateHours("05 PM", "09 PM", "09 PM"));
	}

}
