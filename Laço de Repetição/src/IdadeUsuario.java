import java.util.Scanner;
public class IdadeUsuario {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int aNasc, aAtual, idade, i = 1;
		
		while (i <= 6) {
			System.out.println("Informe o ANO DE NASCIMENTO do "+i+"� usu�rio:");
			aNasc = leia.nextInt();
			System.out.println("Informe o ANO ATUAL:");
			aAtual = leia.nextInt();	
			
			idade = aAtual - aNasc;
			
			if (idade < 18) {
				System.out.println("O "+i+"� usu�rio � menor de idade com "+idade+" anos.");
				} else {
					System.out.println ("O "+i+"� usu�rio � maior de idade com "+idade+" anos.");
					}
			i = i + 1;
		}
		
		leia.close();
		
	}
}
