import java.util.Scanner;
public class VelhoNovo {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int idade, i = 2, idVelho = 1, idNovo = 1;
		String nome, nomeVelho, nomeNovo; 
		
		System.out.println("Informe o 1º nome:");
		nome = leia.next();
		System.out.println("Informe a idade do 1º usuário:");
		idade = leia.nextInt();
		
		nomeVelho = nome;
		nomeNovo = nome;
		idNovo = idade;
		idVelho = idade;
		
		while (i <= 10) {
			System.out.println("Informe o "+i+"º nome:");
			nome = leia.next();
			System.out.println("Informe a idade do "+i+"º usuário:");
			idade = leia.nextInt();
			
			if (idade < idVelho) {
				idNovo = idade;
				nomeNovo = nome;
			} else {
				idVelho = idade;
				nomeVelho = nome;
			}
			
			i++;
			}
		
		System.out.println("O mais velho é "+nomeVelho+" com "+idVelho+" anos & o mais novo é "+nomeNovo+" com "+idNovo+" anos.");
		
		leia.close();
	}
}
