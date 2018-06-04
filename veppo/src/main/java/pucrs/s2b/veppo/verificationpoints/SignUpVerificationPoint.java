package pucrs.s2b.veppo.verificationpoints;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;

public class SignUpVerificationPoint {

	private WebDriver driver;
	
	public SignUpVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkSuccessMassage() {
		final String expectedMessage = "CADASTRO EFETUADO COM SUCESSO";
		assertTrue(this.driver.getPageSource().contains(expectedMessage));
	}
	
}
