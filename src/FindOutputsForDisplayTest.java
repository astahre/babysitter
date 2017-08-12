import static org.junit.Assert.*;

import org.junit.Test;


public class FindOutputsForDisplayTest {

	@Test
	public void timeIn5pmTimeOut2amBedtime9pmReturns104() {
		FindOutputsForDisplay fo = new FindOutputsForDisplay();
		assertEquals("$104", fo.findOutputs("05 PM", "02 AM", "09 PM"));
	}

	@Test
	public void timeIn5pmTimeOut3amBedtime9pmReturns120() {
		FindOutputsForDisplay fo = new FindOutputsForDisplay();
		assertEquals("$120", fo.findOutputs("05 PM", "03 AM", "09 PM"));
	}
	
	@Test
	public void timeIn4pmTimeOut3amBedtime9pmReturnsInvalidMessage() {
		FindOutputsForDisplay fo = new FindOutputsForDisplay();
		assertEquals("The in time you have entered is too early, please run the calculator again with a valid time", 
				fo.findOutputs("04 PM", "03 AM", "09 PM"));
	}
	
	@Test
	public void timeIn5pmTimeOut5amBedtime9pmReturnsInvalidMessage() {
		FindOutputsForDisplay fo = new FindOutputsForDisplay();
		assertEquals("The out time you have entered is too late, please run the calculator again with a valid time", 
				fo.findOutputs("05 PM", "05 AM", "09 PM"));
	}
}
