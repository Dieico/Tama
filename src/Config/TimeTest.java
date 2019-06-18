package Config;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void testdecrease() {
		Time t = new Time();
		LocalTime a = t.verificahora();
		assertTrue(a != LocalTime.now());
	}
	
	@Test
	void testDescaso() {
		Time t = new Time();
		int a = t.getDescaso();
		assertTrue(a <= 0);
	}

}
