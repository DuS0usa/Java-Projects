import java.util.Scanner;
public class AprovadoReprovado{
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int n1, n2, m, m2, exame;
		
		System.out.println("Informe a primeira nota do aluno:");
		n1 = leia.nextInt();
		System.out.println("Informe a segunda nota do aluno:");
		n2 = leia.nextInt();
		m = (n1+n2)/2;
		
		if (m >= 6) {
			System.out.println("O aluno est� APROVADO, pois sua m�dia � "+m);
			} else if (m >= 3 && m < 6) {
				System.out.println("O aluno est� em Exame!\nEntre com a nota de Exame:");
				exame = leia.nextInt();
				m2 = (exame+m)/2;
					if (m2 >= 6) {
						System.out.println("O aluno est� APROVADO! Sua nova m�dia � "+m2);
						} else {
							System.out.println("O aluno est� REPROVADO! Sua m�dia foi "+m2);
							}
				} else {
					System.out.println("O aluno est� REPROVADO! Sua m�dia � "+m);
					}
			
		leia.close();
	}
}
