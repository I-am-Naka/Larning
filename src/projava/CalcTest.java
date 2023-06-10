package projava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void add() {
		assertEquals(4, new Calc().add(2, 2), "2 + 2 = 4");
		assertEquals(6, new Calc().add(2, 4), "2 + 4 = 8");
	}

}
