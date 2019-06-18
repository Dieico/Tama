package Config;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testLigarIcon() {
		Action a = new Action("teste", 50, 1, 1);
		assertFalse(a.ligaIcon() == false);
	}
	
	@Test
	void testActionNullAddition() {
		Action a = new Action("teste", 50, 1, 1);
		assertNotNull(a.getValueAddition() <= 0);
	}
	
	@Test
	void testActionNullDecreasse( ) {
		Action a = new Action("teste", 50, 1, 1);
		assertNotNull(a.getValueDecrease() <= 0);
	}
	
	

}
