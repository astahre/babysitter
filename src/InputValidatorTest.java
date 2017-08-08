import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class InputValidatorTest {
	
	private InputValidator iv;
	
	@Before
	public void beforeEachTest() {
		iv = new InputValidator();
	}

	@Test
	public void inTimeOF4pmIsTooEarly() {
		assertEquals(false, iv.validateTime("04 PM", "08 PM"));
	}
	
	@Test
	public void inTimeOF5pmIsValid() {
		assertEquals(true, iv.validateTime("05 PM", "08 PM"));
	}
	
}
