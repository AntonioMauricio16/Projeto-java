package sistemaEscolar;

public class Diretor extends Pessoa {
private String rgEducacional;
 private String tempoDirecao;
 private String titulacao;
public String getRgEducacional() {
	return rgEducacional;
}
public void setRgEducacional(String rgEducacional) {
	this.rgEducacional = rgEducacional;
}
public String getTempoDirecao() {
	return tempoDirecao;
}
public void setTempoDirecao(String tempoDirecao) {
	this.tempoDirecao = tempoDirecao;
}
public String getTitulacao() {
	return titulacao;
}
public void setTitulacao(String titulacao) {
	this.titulacao = titulacao;
}
@Override
public double salario() {
	// TODO Auto-generated method stub
	return 0;
}
 
 
 
}
