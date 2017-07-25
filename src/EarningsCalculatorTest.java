import static org.junit.Assert.*;

import org.junit.Test;


public class EarningsCalculatorTest {

	@Test
	public void oneRegularHourEarns12Dollars() {
		EarningsCalculator ec = new EarningsCalculator();
		assertEquals(12, ec.calculateEarnings(1, 0, 0));
	}
	
	@Test
	public void twoRegularHoursEarns24Dollars() {
		EarningsCalculator ec = new EarningsCalculator();
		assertEquals(24, ec.calculateEarnings(2, 0, 0));
	}

}
