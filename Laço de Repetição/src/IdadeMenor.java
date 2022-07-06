import java.util.Scanner;
public class IdadeMenor {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int i = 1, menor = 0, maior = 0, idade;
		
		while ( i <= 10) {
			System.out.println("Informe a idade do "+i+"º aluno.");
			idade = leia.nextInt();
			
			if (idade < 18) {
				menor = menor + 1;
				} else {
					maior = maior + 1;
				}
			i++;
		}
		System.out.println("Possui "+menor+" alunos menores de idade e "+maior+" alunos maiores de idade.");
		
		leia.close();
		
		}
}
