import static org.junit.Assert.*;

import org.junit.Test;


public class FindOutputsForDisplayTest {

	@Test
	public void timeIn5pmTimeOut2amBedtime9pmReturns104() {
		FindOutputsForDisplay fo = new FindOutputsForDisplay();
		assertEquals("$104", fo.findOutputs("05 PM", "02 AM", "09 PM"));
	}

}
