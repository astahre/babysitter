import static org.junit.Assert.*;

import org.junit.Test;


public class InputValidatorTest {
	

	@Test
	public void inTimeOF4pmIsNotValid() {
		assertEquals(false, InputValidator.validateTime("04 PM", "08 PM"));
	}
	
	@Test
	public void inTimeOF5pmIsValid() {
		assertEquals(true, InputValidator.validateTime("05 PM", "08 PM"));
	}
	
	@Test
	public void outTimeOF5amIsNotValid() {
		assertEquals(false, InputValidator.validateTime("05 PM", "05 AM"));
	}
	
	@Test
	public void outTimeOF4amIsValid() {
		assertEquals(true, InputValidator.validateTime("05 PM", "04 AM"));
	}
	
	@Test
	public void amIsValid() {
		assertEquals(true, InputValidator.validateAmPm("AM"));
	}
	
	@Test
	public void smIsNotValid() {
		assertEquals(false, InputValidator.validateAmPm("SM"));
	}
	
	@Test
	public void pmIsValid() {
		assertEquals(true, InputValidator.validateAmPm("PM"));
	}
	
}
