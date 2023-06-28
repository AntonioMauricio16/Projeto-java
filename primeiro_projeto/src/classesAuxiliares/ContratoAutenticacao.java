package classesAuxiliares;

import interfaces.PermitirAesso;

public class ContratoAutenticacao {
	private PermitirAesso permitirAcesso;
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	public ContratoAutenticacao(PermitirAesso acesso) {
		
		this.permitirAcesso = acesso;
		// TODO Auto-generated constructor stub
	}
	

}
