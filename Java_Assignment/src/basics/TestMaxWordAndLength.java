package basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMaxWordAndLength {

	Arithmatic arith;
	
	@BeforeEach
	void setUp() throws Exception {
		arith= new Arithmatic();
	}
		
	@Test
	void testMaxStringAndLength() {
		assertEquals("hello|5", arith.verifyLengthandLongestWord());
	}
	
	@Test
	void testEmptyMaxWordAndLength() {
		assertEquals("", arith.verifyLengthandLongestWord());
	}
	
	@Test
	void testEmptyMaxWord() {
		assertEquals("|5", arith.verifyLengthandLongestWord());
	}

	@Test
	void testEmptyMaxLength() {
		assertEquals("hello|", arith.verifyLengthandLongestWord());
	}
	
}
