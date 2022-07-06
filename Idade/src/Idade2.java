import java.util.Scanner;
public class Idade2 {
	public static void main (String args[]) {
	Scanner leia = new Scanner (System.in);
	
	int anoAtual, anoNasc, idade;
	
	System.out.println("Informe o ano atual:");
	anoAtual = leia.nextInt();
	
	System.out.println("Informe seu ano de nascimento:");
	anoNasc = leia.nextInt();

	idade = anoAtual - anoNasc;
	
	System.out.println("Sua idade é: "+idade);
	
	leia.close();
	}
}
