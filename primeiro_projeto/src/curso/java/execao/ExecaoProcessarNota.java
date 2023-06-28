package curso.java.execao;

public class ExecaoProcessarNota  extends Exception{
	
	public ExecaoProcessarNota(String erro) {
		super("de erro ao processar nota!"+erro);
		
	}

}
