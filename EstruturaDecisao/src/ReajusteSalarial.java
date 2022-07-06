import javax.swing.JOptionPane;

public class ReajusteSalarial {
	public static void main (String args[]) {
		
		String nome;
		double salAntigo, salReajustado, valorR;
		
		nome = JOptionPane.showInputDialog(null, "Informe seu nome: ","Reajuste Salarial",JOptionPane.INFORMATION_MESSAGE);
		salAntigo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu salário: ","Reajuste Salarial",JOptionPane.INFORMATION_MESSAGE));
		
		
		if(salAntigo >= 1800){
			valorR = (salAntigo/100) * 10;
			salReajustado = salAntigo + valorR;
			JOptionPane.showMessageDialog(null, "Nome: "+nome+
												"\nSalário Antigo: "+salAntigo+
												"\nPercentual do Reajuste: 10%"+
												"\nValor do Reajuste: "+valorR+
												"\nSalário Reajustado: "+salReajustado,"Ficha Salarial",JOptionPane.WARNING_MESSAGE);
		} else if(salAntigo >=1000){
			valorR = (salAntigo/100) * 20;
			salReajustado = salAntigo + valorR;
			JOptionPane.showMessageDialog(null, "Nome: "+nome+
												"\nSalário Antigo: "+salAntigo+
												"\nPercentual do Reajuste: 20%"+
												"\nValor do Reajuste: "+valorR+
												"\nSalário Reajustado: "+salReajustado,"Ficha Salarial",JOptionPane.WARNING_MESSAGE);
		}
		
	}
}
