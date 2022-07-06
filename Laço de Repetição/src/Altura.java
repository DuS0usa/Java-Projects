
public class Altura {
	public static void main (String args[]) {
		
		int i = 1;
		double aPedro, aJoao;
		
		aPedro = 1.45;
		aJoao = 1.34;
		
		while (aJoao < aPedro) {
			aJoao = 0.025 + aJoao;
			aPedro = 0.020 + aPedro;
			i++;
		}
		System.out.println("Irá demorar "+i+" anos para o João ser maior que o Pedro.");
	}
}
