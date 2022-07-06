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
			System.out.println("Voc� � uma Crian�a!");
		} else if (idade < 18) {
			System.out.println("Voc� � um Adolescente!");
			} else if (idade < 60) {
				System.out.println("Voc� � um Adulto!");
				} else {
					System.out.println("Voc� � um Idoso!");
				}

		leia.close();
	}

}
