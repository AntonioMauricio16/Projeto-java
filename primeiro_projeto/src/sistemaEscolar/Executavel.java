package sistemaEscolar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import classesAuxiliares.ContratoAutenticacao;
import constantes.StatusAluno;
import curso.java.execao.ExecaoProcessarNota;
import interfaces.PermitirAesso;

public class Executavel {
	public static void main(String[] args) {
		
		try {
			
			try {
				File file =  new File("c://limha.txt");
				Scanner scaner = new Scanner(file);
			} catch (FileNotFoundException e) {
				throw new ExecaoProcessarNota(e.getMessage());
			}
			
			String login = JOptionPane.showInputDialog("Login");
			String senha = JOptionPane.showInputDialog("senha");
			
			
			
			if( new ContratoAutenticacao(new Secretario(login,senha)).autenticar()) {
				List<Aluno> alunos = new ArrayList<Aluno>();
				
				// e uma lista que contem uma cheve e dentro tem pouitra lista
				HashMap<String , List<Aluno>> map = new HashMap<String, List<Aluno>>();
				
				List<Aluno> alunosAprovados = new ArrayList<Aluno>();
				List<Aluno> alunosEmRecuperacao = new ArrayList<Aluno>();
				List<Aluno> alunosReprovados = new ArrayList<Aluno>();

				for (int qntAluno = 0; qntAluno <= 2; qntAluno++) {

					Aluno aluno1 = new Aluno();// declarando um objeto

					String nome = JOptionPane.showInputDialog("Digite seu nome");
					String idade = JOptionPane.showInputDialog("idade");

					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));
					aluno1.setDataNascimento("16/09/2021");
					aluno1.setRg("0215487");
					aluno1.setCpf("121.125.453-78");
					aluno1.setNomeMae("izabel");
					aluno1.setNomePai("mauricio");
					aluno1.setNomeEscola("islucdev");
					aluno1.setSerie("progamação");

					

					// percorendo lista de disciplinas
					for (int pos = 1; pos <= 4; pos++) {
						String nomeDiscisplina = JOptionPane.showInputDialog("Disciplina " + pos + "?");
						String valoraNota = JOptionPane.showInputDialog("Digite o valor da nota " + pos + "?");
						Disciplina disciplina = new Disciplina();
						disciplina.setDiscplina(nomeDiscisplina);
						//disciplina.setNota(Double.valueOf(valoraNota));

						aluno1.getDisciplinas().add(disciplina);
					}

					// removendo disciplinas
					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover disciplina ?");
					if (escolha == 0) {

						int contiinuarRemver = 0;
						int posicao = 1;
						while (contiinuarRemver == 0) {
							String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover?");
							aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++;
							contiinuarRemver = JOptionPane.showConfirmDialog(null, "Continuar Removendo ?");
						}

					}
					alunos.add(aluno1);
				}
				
				map.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				map.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				map.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				
				
				for (Aluno aluno : alunos) {
					
					if(aluno.getRsultadoFinal2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						map.get(StatusAluno.APROVADO).add(aluno);
						
					}else 
					if(aluno.getRsultadoFinal2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						map.get(StatusAluno.RECUPERACAO).add(aluno);
					}else {
						map.get(StatusAluno.REPROVADO).add(aluno);
					}
					
				}
				System.out.println("---------------Aprovasdos ----------------------------------");
				for (Aluno aluno : alunosAprovados) {
					System.out.println("Boletim : " + aluno.getRsultadoFinal2() + " com a media : " + aluno.getMediaNota());
					
				}
				
				System.out.println("---------------Em Recuperacão ----------------------------------");
				for (Aluno aluno : alunosEmRecuperacao) {
					System.out.println("Boletim : " + aluno.getRsultadoFinal2() + " com a media : " + aluno.getMediaNota());
					
				}
				
				System.out.println("---------------Reprovasdos ----------------------------------");
				for (Aluno aluno : alunosReprovados) {
					System.out.println("Boletim : " + aluno.getRsultadoFinal2() + " com a media : " + aluno.getMediaNota());
					
				}
					
			}else {
				JOptionPane.showMessageDialog(null, "Acesso Negado!");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			StringBuilder saida = new StringBuilder();
			 
			System.out.println("Mesnagem de Erro :" + e.getMessage());
			
			for(int i = 0; i <= e.getStackTrace().length; i++) {
				saida.append("\n erro na classe" + e.getStackTrace()[i].getClassName());
				saida.append("\n erro no metodo" + e.getStackTrace()[i].getMethodName());
				saida.append("\n erro na linha" + e.getStackTrace()[i].getLineNumber());
				
			}
			JOptionPane.showMessageDialog(null, "Erro ao Processar a Nota" + saida.toString());
		}finally {// sem´re execulta tendo erro ou não
			
			JOptionPane.showMessageDialog(null, "Obrigado por Aprender java");
			
		}
	}
}
