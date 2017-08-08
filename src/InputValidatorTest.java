import static org.junit.Assert.*;

import org.junit.Test;


public class InputValidatorTest {

	@Test
	public void inTimeOF4pmIsTooEarly() {
		InputValidator iv = new InputValidator();
		assertEquals(false, iv.validateTime("04 PM", "08 PM"));
	}
	
	@Test
	public void inTimeOF5pmIsValid() {
		InputValidator iv = new InputValidator();
		assertEquals(true, iv.validateTime("05 PM", "08 PM"));
	}
	
}
