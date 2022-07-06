import java.util.Scanner;
public class SalarioDesconto {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		double salario, desconto;
		
		System.out.println("Informe seu SALÁRIO:");
		salario = leia.nextDouble();
		
		if (salario <= 1434.59) {
		System.out.printf("Não possuí desconto!");
			} else if (salario <= 2150.00) {
				desconto = (salario * 7.5 ) / 100 - 107.54;
				System.out.printf("Seu desconto do IRPF é %.2f reais",desconto);
				} else if (salario <= 2866.70) {
					desconto = (salario * 15) / 100 - 268.84;
					System.out.printf("Seu desconto do IRPF é %.2f reais",desconto);
					} else if (salario <= 3582.00) {
						desconto = (salario * 22.5) / 100 - 483.84;
						System.out.printf("Seu desconto do IRPF é %.2f reais",desconto);
						} else {
							desconto = (salario * 27.5) / 100 - 662.94;
							System.out.printf("Seu desconto do IRPF é %.2f reais",desconto);
							}
		
		leia.close();
	} 
 }

