package primeiro_projeto;

public class opredadoresLogicos {
	
	public static void main(String[] args) {
		int nota1 = 28;
		int nota2 = 95;
		int nota3 = 15;
		int nota4 = 68;
		
		int media = (nota1 + nota2 + nota3 + nota4)/ 4;
		
		if(media >= 70) {
			System.out.println("Aluno Aprovado");
		}else if(media >= 40 && media <=60) {
			System.out.println("Aluno Em Recuperacão");
			
		}else {
			System.out.println("Aluno Reprovado");
		}
		 
		// opreração ternaria simples
		String saida = media >= 70? "Aluno Provado " : (media >=40 && media <=60)? "Aluno Em Recuperação" : "Aluno Rprovado";
		
		System.out.println(saida);
	}
	
		
}
