import javax.swing.JOptionPane;

public class OperacoesBasicas {
	public static void main(String args[]) {
		
		double n1, n2, soma, divi, multi, sub;
		
		// ENTRADA DOS DADOS//
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro valor:","Operações Básicas",JOptionPane.QUESTION_MESSAGE));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo valor:","Operações Básicas",JOptionPane.QUESTION_MESSAGE));
		
		
		// PROCESSAMENTO DOS DADOS//
		soma = n1 + n2;
		sub = n1 - n2;
		multi = n1 * n2;
		divi = n1 / n2;
		
		
		//SAÍDA DE DADOS//
		JOptionPane.showMessageDialog(null, "A SOMA dos valores é: "+soma+
											"\nA SUBTRAÇÃO dos valores é: "+sub+
											"\nA MULTIPLICAÇÃO dos valores é: "+multi+
											"\nA DIVISÃO dos valores é: "+divi,"Resultado",JOptionPane.WARNING_MESSAGE);
		
	}
}




