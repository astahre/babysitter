import static org.junit.Assert.*;

import org.junit.Test;


public class InputValidatorTest {

	@Test
	public void inTimeOF4pmIsTooEarly() {
		InputValidator iv = new InputValidator();
		assertEquals(false, iv.validateTime("4 PM", "08 PM"));
	}
	
}
