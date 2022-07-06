import javax.swing.JOptionPane;

public class ParImpar {

	public static void main(String[] args) {

		int i, n, par = 0, impar = 0;
		
			
		for(i = 1; i<=10; i++){
			
			n = Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE O "+ i +"º NÚMERO:","Par ou Ímpar?",JOptionPane.INFORMATION_MESSAGE));
			
			if(n % 2 == 0){
				par++;
			}else{
				impar++;			
			}
	
		}
		
		JOptionPane.showMessageDialog(null,"QUANTIDADE DE NÚMEROS PARES: " + par + 
										   "\nQUANTIDADE DE NÚMEROS ÍMPARES: " + impar,"RESULTADO",JOptionPane.WARNING_MESSAGE);

	}
}



