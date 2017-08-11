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
	public void timeIn5Returns05() {
		String input = "5\npm\n";
		ByteArrayInputStream fakeIn = new ByteArrayInputStream(input.getBytes());
		System.setIn(fakeIn);
		BabySitterPayCalculator.main(new String[0]);
		String[] lines = new String(fakeOut.toByteArray()).split("\n");
		assertEquals("Enter the starting hour of your shift:", lines[0]);
		assertEquals("AM or PM", lines[1]);
		assertEquals("05 PM", lines[2]);
	}
	
	@After
	public void afterEachTest() {
		System.setIn(oldIn);
		System.setOut(oldOut);
	}

}
