package mediaAluno;

import javax.swing.JOptionPane;

public class mediaAluno {
	public static void main(String[] args) {
		String nota1 = JOptionPane.showInputDialog("Digite a nota 1");
		String nota2 = JOptionPane.showInputDialog("Digite a nota 2");
		String nota3 = JOptionPane.showInputDialog("Digite a nota 3 ");
		String nota4 = JOptionPane.showInputDialog("Digite a nota 4");

		double dnota1 = Double.parseDouble(nota1);
		double dnota2 = Double.parseDouble(nota2);
		double dnota3 = Double.parseDouble(nota3);
		double dnota4 = Double.parseDouble(nota4);

		double media = (dnota1 + dnota2 + dnota3 + dnota4) / 4;

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					JOptionPane.showMessageDialog(null, "Aluno Nota 10" +"Com  A  media :"+ media);
				} else {
					JOptionPane.showMessageDialog(null, "Aluno Aprovado" +"Com  A  media :" + media);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Aluno Esta Em Recuperação" +"Com  A  media :" + media);

			}
		} else {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado" +"Com  A  media :" + media );
		}

	}

}
