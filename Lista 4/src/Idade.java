import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
			
			int anoA, anoN, idade, resposta;
			
			do {
				System.out.println("Informe seu ano de nascimento:");
				anoN = leia.nextInt();
				System.out.println("Informe o ano atual:");
				anoA = leia.nextInt();
				
				idade = anoA - anoN;
				if (idade < 18) {
					System.out.println("Voc� tem "+idade+" anos e � MENOR de idade.");
					} else {
						System.out.println("Voc� tem "+idade+" anos e � MAIOR de idade.");
					}
				
				System.out.println("\nDeseja continuar a execu��o do programa? Digite:\n1 -> para SIM\n2 -> para N�O");
				resposta = leia.nextInt();
			} while (resposta == 1);
	
			leia.close();

	}

}
