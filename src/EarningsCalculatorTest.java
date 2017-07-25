import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class EarningsCalculatorTest {
	
	private EarningsCalculator ec;
	
	@Before
	public void beforeEachTest() {
		ec = new EarningsCalculator();
	}

	@Test
	public void oneRegularHourEarns12Dollars() {
		assertEquals(12, ec.calculateEarnings(1, 0, 0));
	}
	
	@Test
	public void twoRegularHoursEarns24Dollars() {
		assertEquals(24, ec.calculateEarnings(2, 0, 0));
	}
	
	@Test
	public void threePostBedtimeHoursEarns24Dollars() {
		assertEquals(24, ec.calculateEarnings(0, 3, 0));
	}
	
	@Test
	public void fourPostBedtimeHoursEarns32Dollars() {
		assertEquals(32, ec.calculateEarnings(0, 4, 0));
	}
	
	@Test
	public void twoPostMidnightHoursEarns32Dollars() {
		assertEquals(32, ec.calculateEarnings(0, 0, 2));
	}

}
