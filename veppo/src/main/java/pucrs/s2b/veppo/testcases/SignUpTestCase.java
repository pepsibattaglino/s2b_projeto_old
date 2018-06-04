package pucrs.s2b.veppo.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pucrs.s2b.veppo.tasks.SignUpTask;
import pucrs.s2b.veppo.verificationpoints.SignUpVerificationPoint;

public class SignUpTestCase {
	
	private WebDriver driver;
	private SignUpTask signUpTask;
	private SignUpVerificationPoint signUpVerificationPoint;
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("http://www.rodoviaria-poa.com.br/inicio.php");
		this.driver.manage().window().maximize();
		this.signUpTask = new SignUpTask(driver);
		this.signUpVerificationPoint = new SignUpVerificationPoint(driver);
	}
	
	@Test
	public void testMain() {
		this.signUpTask.navegateToSignUpForm();
		this.signUpTask.fillOutSignUpForm("Fulano Fulani", "Av. Strada", "Casa", "Porto Alegre", "12345678", "RS", "F", "12345678901", "912345678", "123456789", "123456789", "fulano@gmail.com", "123456", "123456");
		this.signUpTask.submitSignUpForm();
		this.signUpVerificationPoint.checkSuccessMassage();
	}
	
	@After
	public void tearDown() {
		this.driver.quit();
	}

}
