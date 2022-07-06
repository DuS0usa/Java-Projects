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
					System.out.println("Você tem "+idade+" anos e é MENOR de idade.");
					} else {
						System.out.println("Você tem "+idade+" anos e é MAIOR de idade.");
					}
				
				System.out.println("\nDeseja continuar a execução do programa? Digite:\n1 -> para SIM\n2 -> para NÃO");
				resposta = leia.nextInt();
			} while (resposta == 1);
	
			leia.close();

	}

}
