package prjArea;
import javax.swing.JOptionPane;

public class Area {
	
		//Atributos
		double area;
		double base;
		double altura;
		
		void calcularRetangulo() {
			System.out.println("A �rea do ret�ngulo � " + base * altura);
		}
		
		void calcularRetangulo2() {
			JOptionPane.showMessageDialog(null, "A �rea do ret�ngulo � " + base * altura);
		}
}