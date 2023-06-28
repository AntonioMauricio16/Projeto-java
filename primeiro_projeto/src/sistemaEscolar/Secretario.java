package sistemaEscolar;

import interfaces.PermitirAesso;

public class Secretario extends Pessoa implements PermitirAesso {
	private String regidtro;
	private String cargo;
	private String experienc;
	
	private String login;
	private String senha;
	
	public Secretario(String login,String senha) {
		this.login = login;
		this.senha = senha;
		
	}
	public Secretario() {
		// TODO Auto-generated constructor stub
	}
	 
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getRegidtro() {
		return regidtro;
	}
	public void setRegidtro(String regidtro) {
		this.regidtro = regidtro;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getExperienc() {
		return experienc;
	}
	public void setExperienc(String experienc) {
		this.experienc = experienc;
	}
	@Override
	public double salario() {
		
		return 0;
	}
	// metodo do contrato
	
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
	@Override
	public boolean autenticar() {
		
		return login.equals(login)&& senha.equals(senha);
	}
	
	

}
