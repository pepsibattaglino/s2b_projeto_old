package pucrs.s2b.veppo.testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pucrs.s2b.veppo.testcases.SignUpTestCase;

@RunWith(Suite.class)
@SuiteClasses({
	SignUpTestCase.class
})

public class RegressionTestSuite {

	@BeforeClass
	public static void init() {
		System.out.println("Starting Execution.");
	}
	
	@AfterClass
	public static void end() {
		System.out.println("Finishing");
	}
	
}
