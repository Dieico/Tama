package Config;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelaTest {

	@Test
	void testActionNotNull() {
		Action a = new Action("teste", 50, 1, 1);
		assertNotNull(a);
	}

	

}
