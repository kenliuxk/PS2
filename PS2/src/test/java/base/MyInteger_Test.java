package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test

	
	public void testall() {
		int even = 4;
		int odd = 5;
		int oriprime = 2;
		int prime = 13;
		int notprime = 15;
		int number1 = 100;
		int number2 = 200;
		int number3 = 100;
		
		
		MyInteger evenNbr = new MyInteger(even);
		MyInteger oddNbr = new MyInteger(odd);
		MyInteger oriprimeNbr = new MyInteger(oriprime);
		MyInteger primeNbr = new MyInteger(prime);
		MyInteger notprimeNbr = new MyInteger(notprime);
		MyInteger number1Test = new MyInteger(number1);
		MyInteger number2Test = new MyInteger(number2);
		MyInteger number3Test = new MyInteger(number3);
		

		assertEquals(number1Test.getiValue(),100);
		assertEquals(number2Test.getiValue(),200);
		
		assertTrue(evenNbr.isEven());
		assertTrue(oddNbr.isEven());
		assertTrue(evenNbr.isOdd());
		assertTrue(oddNbr.isOdd());
		assertTrue(oriprimeNbr.isPrime());
		assertTrue(primeNbr.isPrime());
		assertFalse(notprimeNbr.isPrime());
		
		assertTrue(MyInteger.isEven(evenNbr));
		assertTrue(MyInteger.isEven(oddNbr));
		assertTrue(MyInteger.isOdd(evenNbr));
		assertTrue(MyInteger.isOdd(oddNbr));
		assertTrue(MyInteger.isPrime(oriprimeNbr));
		assertTrue(MyInteger.isPrime(primeNbr));
		assertFalse(MyInteger.isPrime(notprimeNbr));
		
		assertTrue(MyInteger.isEven(even));
		assertTrue(MyInteger.isEven(odd));
		assertTrue(MyInteger.isOdd(even));
		assertTrue(MyInteger.isOdd(odd));
		assertTrue(MyInteger.isPrime(oriprime));
		assertTrue(MyInteger.isPrime(prime));
		assertFalse(MyInteger.isPrime(notprime));
		
		assertTrue(number1Test.equals(number1));
		assertTrue(number1Test.equals(number1Test));
		assertFalse(number1Test.equals(number2));
		assertFalse(number1Test.equals(number2Test));		
		
		
	}
	

}
