package sistemaEscolar;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Disciplina {

	private String discplina;
	private double[] nota = new double[4];
	
	
	public double getMdiaDasNotas() {
		double somaTotal = 0;
		for (int i = 0; i < nota.length; i++) {
			somaTotal += nota[i];
			
		}
		return somaTotal / 4;
	}
	public String getDiscplina() {
		return discplina;
	}

	public void setDiscplina(String discplina) {
		this.discplina = discplina;
	}

	

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(discplina);
		return result;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(discplina, other.discplina) && Arrays.equals(nota, other.nota);
	}

	@Override
	public String toString() {
		return "Disciplina [discplina=" + discplina + ", nota=" + nota + ", getDiscplina()=" + getDiscplina()
				+ ", getNota()=" + getNota() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

}
