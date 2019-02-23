package test;

import org.junit.Assert;
import org.junit.Test;

import main.FizzBuzz;

public class FizzBuzzTest {

	FizzBuzz fizzBuzz = new FizzBuzz();

	@Test
	public void isDividable_shouldReturnTrue() {
		// when
		boolean result = fizzBuzz.isDividable(15, 5);
		// then
		Assert.assertTrue(result);

	}

	@Test
	public void isDividable_shouldReturnFalse() {
		boolean result = fizzBuzz.isDividable(37, 3);
		Assert.assertFalse(result);
	}

	@Test
	public void isDividable_divisionByZero_shouldNotThrowException() {
			boolean result = fizzBuzz.isDividable(36, 0);
			Assert.assertFalse(result);
	}
	@Test
	 public void isDividable_dividingZero_shouldNotThrowException() {
		 boolean result = fizzBuzz.isDividable(0, 36);
		 Assert.assertFalse(result);
	 }
	@Test
	public void fizz_shouldReturnFizz() {
		String result = fizzBuzz.fizz(6);
		Assert.assertSame("Fizz", result);	
	}
	@Test
	public void fizz_shouldNotReturnFizz() {
		String result = fizzBuzz.fizz(10);
		Assert.assertEquals("", result);
	}
	
	@Test
	public void buzz_shouldReturnBuzz() {
		String result = fizzBuzz.buzz(50);
		Assert.assertSame("Buzz", result);
	}
	@Test
	public void buzz_shouldNotReturnBuzz() {
		String result = fizzBuzz.buzz(51);
		Assert.assertEquals("", result);
	}
}
