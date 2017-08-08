import static org.junit.Assert.*;

import org.junit.Test;


public class ConvertTimeInputsToStringTest {

	@Test
	public void inputOf5andPmIs05_PM() {
		assertEquals("05 PM", ConvertTimeInputsToString.convertInputs(5, "pm"));
	}
	
	@Test
	public void inputOf5andAmIs05_AM() {
		assertEquals("05 AM", ConvertTimeInputsToString.convertInputs(5, "am"));
	}

}
