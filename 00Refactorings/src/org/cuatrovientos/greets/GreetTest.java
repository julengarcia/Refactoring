package org.cuatrovientos.greets;
import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Bad Taste 
 * test class for mydick haha, you got it?
 * you're testing mydick. It's brilliant
 */
public class GreetTest {

	@Test
	public void testGreetMethod() {
		Greet myGreet = new Greet();

		String expected = "hola";
		String target = myGreet.greets(0, 1);
		assertEquals("Testing spanish greet once", expected, target);

		expected = "hellohello";
		target = myGreet.greets(1, 2);
		assertEquals("Testing english greet twice", expected, target);

		expected = "kaixokaixokaixokaixo";
		target = myGreet.greets(2, 4);
		assertEquals("Testing basque greet four times", expected, target);

	}

}
