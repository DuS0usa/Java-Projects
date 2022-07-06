import java.util.Scanner;
public class IMC {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int i;
		double imc, altura = 0, peso, total = 0, media;
		
		for (i=1;i<=15;i++) {
			System.out.println("Informe o peso do usuário nº"+i);
			peso = leia.nextDouble();
			System.out.println("Informe a altura do usuário nº"+i);
			altura = leia.nextDouble();
			imc = peso / (altura*altura);
			
			if (imc <= 18.5) {
				System.out.println("Magreza");
			} else if (imc <= 24.9) {
				System.out.println("Normal");
				} else if (imc <= 29.9) {
					System.out.println("Obesidade Grau 1");
					} else if (imc <= 39.9) {
						System.out.println("Obesidade Grau 2");
					} else {
						System.out.println("Obesidade Grau 3");
					}
			
			total = total + altura;
		}
		media = total / 15;
		System.out.printf("A média das alturas é de %.2f",media);
	}

}

