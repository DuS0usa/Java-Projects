package prjArea;
import javax.swing.JOptionPane;

public class Area {
	
		//ATRIBUTOS
		double area;
		double base;
		double altura;
		
		//M�TODO PARA CALCULAR A �REA UTILIZANDO -> System.out
		void calcularRetangulo() {
			System.out.println("A �rea do ret�ngulo � " + base * altura);
		}
			
		//M�TODO PARA CALCULAR A �REA UTILIZANDO -> JOptionPane
		void calcularRetangulo2() {
			JOptionPane.showMessageDialog(null, "A �rea do ret�ngulo � " + base * altura
											,"�rea do Ret�ngulo", JOptionPane.WARNING_MESSAGE);
		}
}


