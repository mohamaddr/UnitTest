package MohammadDergham;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatorTest {

	@Test
	void test() {

		calculator obj = new calculator();

		double expectedResult=1;
		double acutlResult=obj.addition(-1,2);
		assertEquals(expectedResult,acutlResult);
		
		
		double sub=1;
		double subs=obj.subtraction(2,1);
		assertEquals(sub,subs);
		
		double mul=2;
		double muls=obj.multiplication(-1, -2);
		assertEquals(mul,muls);
		
		
		double div=2;
		double divs=obj.division(4,2);
		assertEquals(div,divs);
		
		
		double mo=0;
		double mos=obj.modulus(100,2);
		assertEquals(mo,mos);
		
		
		
		
		

		
		
		
	}

}
