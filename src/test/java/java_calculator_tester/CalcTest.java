package java_calculator_tester;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalcTest {

	 @Test
	    public void testAdd() {
		 Calc calcolatore = new Calc();
		 float result = calcolatore.add(1, 2);
	        assertEquals(3, result, 0);
	    }

	    @Test
	    public void testSubtract() {
	    	Calc calcolatore = new Calc();
	    	float result = calcolatore.subtract(5, 3);
	        assertEquals(2, result, 0);
	    }

	    @Test
	    public void testDivide() {
	    	Calc calcolatore = new Calc();
	    	float result = calcolatore.divide(6, 2);
	        assertEquals(3, result, 0);
	    }

	    @Test
	    public void testMultiply() {
	    	Calc calcolatore = new Calc();
	    	float result = calcolatore.multiply(2, 3);
	        assertEquals(6, result, 0);
	    }

}
