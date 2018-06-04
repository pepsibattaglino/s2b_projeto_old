package pucrs.s2b.veppo.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpAppObject {
	
	private WebDriver driver;
	
	public SignUpAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getServicosButton() {
		return this.driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/a[1]/img"));
	}
	
	public WebElement getVendasViaInternetButton() {
		return this.driver.findElement(By.xpath("/html/body/table/tbody/tr/td[5]/a/img"));
	}
	
	public WebElement getCadastreseAquiLink() {
		return this.driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td[3]/font/b/a/img"));
	}
	
	public WebElement getFormularioCadastroLink() {
		return this.driver.findElement(By.xpath("/html/body/center/table[1]/tbody/tr/td/font[1]/a[1]"));
	}
	
	//elements of sign up form
	public WebElement getNomeCompletoTextField() {
		return this.driver.findElement(By.name("nome"));
	}
	
	public WebElement getEnderecoTextField() {
		return this.driver.findElement(By.name("endereco"));
	}
	
	public WebElement getComplementoTextField() {
		return this.driver.findElement(By.name("complemento"));
	}
	
	public WebElement getCidadeTextField() {
		return this.driver.findElement(By.name("cidade"));
	}
	
	public WebElement getCEPTextField() {
		return this.driver.findElement(By.name("cep"));
	}
	
	public WebElement getEstadoComboBox() {
		return this.driver.findElement(By.name("uf")).findElement(By.cssSelector("body > center > table > tbody > tr > td > form > table > tbody > tr:nth-child(7) > td:nth-child(2) > font > select > option:nth-child(21)"));
	}
	
	public WebElement getPessoaFisicaRadioButton() {
		return this.driver.findElement(By.cssSelector("input[value=F]"));
	}
	
	public WebElement getPessoaJuridicaRadioButton() {
		return this.driver.findElement(By.cssSelector("input[value=J]"));
	}
	
	public WebElement getCPFTextField() {
		return this.driver.findElement(By.name("cpfcgc"));
	}
	
	public WebElement getTelefoneTextField() {
		return this.driver.findElement(By.name("fone"));
	}
	
	public WebElement getFaxTextField() {
		return this.driver.findElement(By.name("fax"));
	}
	
	public WebElement getCelularTextField() {
		return this.driver.findElement(By.name("bairro"));
	}
	
	public WebElement getEmailTextField() {
		return this.driver.findElement(By.name("email"));
	}
	
	public WebElement getSenhaTextField() {
		return this.driver.findElement(By.name("senha"));
	}
	
	public WebElement getConfirmaSenhaTextField() {
		return this.driver.findElement(By.name("pass1"));
	}
	
	public WebElement getEnviarButton() {
		return this.driver.findElement(By.name("btnCadAlt"));
	}
	
	public WebElement getLimparButton() {
		return this.driver.findElement(By.name("btnAux"));
	}
	
	
/*
  	//esse é para outro appObject
	public WebElement getPessoaRadioButton() {
		return this.driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[3]/form/center/table/tbody/tr[2]/td[2]/font/input[1]"));
	}
*/
}
