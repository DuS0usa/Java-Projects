package prjContaLuz;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
//		//CÓDIGO COM -> Scanner
//		Luz conta1 = new Luz();
//			System.out.println("Informe a Data de Leitura da conta: ");
//			conta1.dataLeitura = in.next();
//			System.out.println("Informe a Data de Pagamento da conta: ");
//			conta1.dataPagamento = in.next();
//			System.out.println("Informe a Média de Consumo da conta: ");
//			conta1.mediaConsumo = in.nextFloat();
//			System.out.println("Informe o Valor a Pagar da conta: ");
//			conta1.valorPagar = in.nextFloat();
//			System.out.println("Informe o Número de Leitura da conta: ");
//			conta1.numeroLeitura = in.nextInt();
//			System.out.println("Informe a Quantidade de KW Gasto da conta: ");
//			conta1.qtdKwGasto = in.nextInt();
//			
//			System.out.println("\nData de Leitura: " + conta1.dataLeitura 
//								+ "\nNº Leitura: " + conta1.numeroLeitura
//								+ "\nKw Gasto: " + conta1.qtdKwGasto
//								+ "\nValor a Pagar: " + conta1.valorPagar
//								+ "\nData de Pagamento: " + conta1.dataPagamento
//								+ "\nMédia de Consumo: " + conta1.mediaConsumo);
		
		//CÓDIGO COM -> JOptionPane
		Luz conta2 = new Luz();
			conta2.dataLeitura = JOptionPane.showInputDialog(null, "Informe a Data de Leitura da conta:");
			conta2.dataPagamento = JOptionPane.showInputDialog(null, "Informe a Data de Pagamento da conta:");
			conta2.mediaConsumo = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a Média de Consumo da conta:"));
			conta2.valorPagar = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o Valor a Pagar da conta:"));
			conta2.numeroLeitura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Número de Leitura da conta:"));
			conta2.qtdKwGasto = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Quantidade de KW Gasto da conta:"));
			
			JOptionPane.showMessageDialog(null, "\nData de Leitura: " + conta2.dataLeitura 
												+ "\nNº Leitura: " + conta2.numeroLeitura
												+ "\nKw Gasto: " + conta2.qtdKwGasto
												+ "\nValor a Pagar: " + conta2.valorPagar
												+ "\nData de Pagamento: " + conta2.dataPagamento
												+ "\nMédia de Consumo: " + conta2.mediaConsumo
												,"Dados da Conta de Luz",JOptionPane.WARNING_MESSAGE);
	
		in.close();
	}
}
