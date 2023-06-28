package sistemaEscolar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import constantes.StatusAluno;

public class Aluno extends Pessoa {
	
	private String nomeEscola;
	private String serie;

	// metodo que calcula a media do aluno

	public double getMediaNota() {
		double somaNotas = 0.0;
		for (Disciplina disciplina : disciplinas) {

			somaNotas += disciplina.getMdiaDasNotas();
		}
		return somaNotas / disciplinas.size();
	}

	// metodo mais usado no back em produção
	public boolean getRsultadoFinal() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	public String getRsultadoFinal2() {
		double media = this.getMediaNota();
		if(media >=50) {
			if(media >= 70) {
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplinas, nomeEscola, serie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(disciplinas, other.disciplinas) && Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(serie, other.serie);
	}

	@Override
	public String toString() {
		return "Aluno [nomeEscola=" + nomeEscola + ", serie=" + serie + ", disciplinas=" + disciplinas + "]";
	}
	
	@Override
	public boolean pessoaMaiorIdade() {
		// TODO Auto-generated method stub
		return super.pessoaMaiorIdade();
	}
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "pessoa  e maior de idade ?" : "menor de idade.";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
