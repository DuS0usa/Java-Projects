package prjArea;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//
//		//�REA DO RET�NGULO COM -> Scanner
//		Area retangulo = new Area();
//			System.out.println("Digite a Base do ret�ngulo");
//			retangulo.base = in.nextDouble();
//			System.out.println("Digite a Altura do ret�ngulo");
//			retangulo.altura = in.nextDouble();
//			
//			retangulo.calcularRetangulo();
		
		
		//�REA DO RET�NGULO COM -> JOptionPane
		Area retangulo2 = new Area();
			retangulo2.base = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a BASE do ret�ngulo:"
													,"�rea do Ret�ngulo", JOptionPane.INFORMATION_MESSAGE));
			retangulo2.altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a ALTURA do ret�ngulo:"
													,"�rea do Ret�ngulo", JOptionPane.INFORMATION_MESSAGE));
			
			retangulo2.calcularRetangulo2();
			
		in.close();	
	}
}
