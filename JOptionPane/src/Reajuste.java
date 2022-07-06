import javax.swing.JOptionPane;

public class Reajuste {
	public static void main(String args[]) {
		
		double salAntigo, salAtual, valReajuste;
		String nome;
		
		
		// ENTRADA DE DADOS//
		nome = JOptionPane.showInputDialog(null, "Informe seu nome:","Reajuste do Salário",JOptionPane.QUESTION_MESSAGE);
		salAntigo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu salário (Inteiro):","Reajuste do Salário",JOptionPane.QUESTION_MESSAGE));
		
		
		// PROCESSAMENTO //
		valReajuste = (salAntigo / 100) * 10;
		salAtual = salAntigo + valReajuste;
		
		
		// SAIDA //
		JOptionPane.showMessageDialog(null, "Nome: "+nome+
											"\nSalário: "+salAntigo+
											"\nPercentual de Reajuste: 10%"+
											"\nValor do Reajuste: "+valReajuste+
											"\nSalário Reajustado: "+salAtual,"Resultado",JOptionPane.WARNING_MESSAGE);
	}
}



