import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BabySitterPayCalculatorTest {
	
	
	private InputStream oldIn;
	private PrintStream oldOut;
	private ByteArrayOutputStream fakeOut;
	

	@Before
	public void beforeEachTest() {
		oldIn = System.in;
		oldOut = System.out;
		fakeOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(fakeOut));
	}

	@Test
	public void timeIn5pmTimeOut4amBedtime9pm() {
		String input = "5\npm\n4\nam\n9\npm\n";
		ByteArrayInputStream fakeIn = new ByteArrayInputStream(input.getBytes());
		System.setIn(fakeIn);
		BabySitterPayCalculator.main(new String[0]);
		String[] lines = new String(fakeOut.toByteArray()).split("\n");
		assertEquals("Enter the starting hour of your shift:", lines[0]);
		assertEquals("AM or PM", lines[1]);
		assertEquals("Enter the ending hour of your shift:", lines[2]);
		assertEquals("AM or PM", lines[3]);
		assertEquals("Enter the bedtime:", lines[4]);
		assertEquals("AM or PM", lines[5]);
		assertEquals("09 PM", lines[6]);
	}
	
	@After
	public void afterEachTest() {
		System.setIn(oldIn);
		System.setOut(oldOut);
	}

}
