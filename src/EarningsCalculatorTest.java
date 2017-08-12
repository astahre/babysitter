import static org.junit.Assert.*;

import org.junit.Test;


public class EarningsCalculatorTest {
	
	

	@Test
	public void oneRegularHourEarns12Dollars() {
		assertEquals(12, EarningsCalculator.calculateEarnings(1, 0, 0));
	}
	
	@Test
	public void twoRegularHoursEarns24Dollars() {
		assertEquals(24, EarningsCalculator.calculateEarnings(2, 0, 0));
	}
	
	@Test
	public void threePostBedtimeHoursEarns24Dollars() {
		assertEquals(24, EarningsCalculator.calculateEarnings(0, 3, 0));
	}
	
	@Test
	public void fourPostBedtimeHoursEarns32Dollars() {
		assertEquals(32, EarningsCalculator.calculateEarnings(0, 4, 0));
	}
	
	@Test
	public void twoPostMidnightHoursEarns32Dollars() {
		assertEquals(32, EarningsCalculator.calculateEarnings(0, 0, 2));
	}
	
	@Test
	public void threePostMidnightHoursEarns48Dollars() {
		assertEquals(48, EarningsCalculator.calculateEarnings(0, 0, 3));
	}
	
	@Test
	public void wagesfor5pmTo2amEquals104() {
		assertEquals(104, EarningsCalculator.calculateEarnings(4, 3, 2));
	}

}
