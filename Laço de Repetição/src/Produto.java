import java.util.Scanner;
public class Produto {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);

		double p, margemLucro, pv;
		String resposta = "sim";
		
		while (resposta.equalsIgnoreCase("sim")) {
				System.out.println("Informe o Pre�o de Custo");
				p = leia.nextDouble();
				System.out.println("Informe a Margem de Lucro:");
				margemLucro = leia.nextDouble();

				pv = p+(p / 100 * margemLucro) ;
				System.out.printf("Seu pre�o de venda � R$%.2f\n",pv);
			
				System.out.println("Continuar a execu��o do programa?");
				resposta = leia.next();
		}

			
		leia.close();
		
	}
}
