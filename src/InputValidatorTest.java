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
	public void inTimeOF4pmIsNotValid() {
		assertEquals(false, iv.validateTime("04 PM", "08 PM"));
	}
	
	@Test
	public void inTimeOF5pmIsValid() {
		assertEquals(true, iv.validateTime("05 PM", "08 PM"));
	}
	
	@Test
	public void outTimeOF5amIsNotValid() {
		assertEquals(false, iv.validateTime("05 PM", "05 AM"));
	}
	
	@Test
	public void outTimeOF4amIsValid() {
		assertEquals(true, iv.validateTime("05 PM", "04 AM"));
	}
	
	@Test
	public void amIsValid() {
		assertEquals(true, iv.validateAmPm("AM"));
	}
	
	@Test
	public void smIsNotValid() {
		assertEquals(false, iv.validateAmPm("SM"));
	}
	
}
