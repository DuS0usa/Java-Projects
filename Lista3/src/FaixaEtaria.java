import java.util.Scanner;
public class FaixaEtaria {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int idade, aNasc, aAtual;
	
		System.out.println("Informe o ano atual:");
		aAtual = leia.nextInt();
		System.out.println ("Informe seu ano de nascimento: ");
		aNasc = leia.nextInt();
		
		idade = aAtual - aNasc;
		
	
		if (idade < 10) {
			System.out.println("Você é uma Criança!");
		} else if (idade < 18) {
			System.out.println("Você é um Adolescente!");
			} else if (idade < 60) {
				System.out.println("Você é um Adulto!");
				} else {
					System.out.println("Você é um Idoso!");
				}

		leia.close();
	}

}
