package chapter02;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator cal = new Calculator();
		System.out.println(cal.add(6, 3));
	}

}
