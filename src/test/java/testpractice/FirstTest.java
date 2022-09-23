package testpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void tc1() {
		Reporter.log("Test Case 1",true);
	}
}
