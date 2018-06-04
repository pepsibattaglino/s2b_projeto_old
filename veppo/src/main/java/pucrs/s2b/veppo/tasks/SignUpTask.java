package pucrs.s2b.veppo.tasks;

import org.openqa.selenium.WebDriver;

import pucrs.s2b.veppo.appobjects.SignUpAppObject;

public class SignUpTask {

	private SignUpAppObject signUpAppObject;
	
	public SignUpTask(WebDriver driver) {
		this.signUpAppObject = new SignUpAppObject(driver);
	}
	
	public void navegateToSignUpForm() {
		this.signUpAppObject.getServicosButton().click();
		this.signUpAppObject.getVendasViaInternetButton().click();
		this.signUpAppObject.getCadastreseAquiLink().click();
		this.signUpAppObject.getFormularioCadastroLink().click();
	}
	
	public void fillOutSignUpForm(	String nome, 
									String endereco, 
									String complemento,	
									String cidade, 
									String cep, 
									String estado, 
									String pessoa, 
									String cpf, 
									String telefone, 
									String fax, 
									String celular, 
									String email, 
									String senha, 
									String confirmarSenha) {
		this.signUpAppObject.getNomeCompletoTextField().sendKeys(nome);
		this.signUpAppObject.getEnderecoTextField().sendKeys(endereco);
		this.signUpAppObject.getComplementoTextField().sendKeys(complemento);
		this.signUpAppObject.getCidadeTextField().sendKeys(cidade);
		this.signUpAppObject.getCEPTextField().sendKeys(cep);
		this.signUpAppObject.getEstadoComboBox().sendKeys(estado);//pode dar problema
		this.signUpAppObject.getPessoaFisicaRadioButton().sendKeys(pessoa);//pode dar problema
		this.signUpAppObject.getCPFTextField().sendKeys(cpf);
		this.signUpAppObject.getTelefoneTextField().sendKeys(telefone);
		this.signUpAppObject.getFaxTextField().sendKeys(fax);
		this.signUpAppObject.getCelularTextField().sendKeys(celular);
		this.signUpAppObject.getEmailTextField().sendKeys(email);
		this.signUpAppObject.getSenhaTextField().sendKeys(senha);
		this.signUpAppObject.getConfirmaSenhaTextField().sendKeys(confirmarSenha);
	}
	
	public void submitSignUpForm() {
		this.signUpAppObject.getEnviarButton().click();
	}
	
	public void clearSubmitForm() {
		this.signUpAppObject.getLimparButton().click();
	}
	
}
