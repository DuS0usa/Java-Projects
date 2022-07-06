import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Circulo extends JFrame {

	private JPanel contentPane;
	private JTextField cx1;
	private JTextField cxresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Circulo frame = new Circulo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Circulo() {
		setResizable(false);
		setTitle("\u00C1rea do C\u00EDrculo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 235, 205));
		panel.setBounds(0, 0, 444, 471);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Circulo.class.getResource("/img/circle1.png")));
		lblNewLabel.setBounds(52, 0, 350, 188);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite o RAIO:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(102, 236, 105, 14);
		panel.add(lblNewLabel_1);
		
		cx1 = new JTextField();
		cx1.setBounds(205, 234, 151, 20);
		panel.add(cx1);
		cx1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(122, 299, 73, 14);
		panel.add(lblNewLabel_2);
		
		cxresultado = new JTextField();
		cxresultado.setFont(new Font("Tahoma", Font.BOLD, 15));
		cxresultado.setEditable(false);
		cxresultado.setColumns(10);
		cxresultado.setBounds(205, 289, 151, 37);
		panel.add(cxresultado);
		
//		<---------------- CÁLCULO ------------------------>	
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double raio, area;
				
				if(cx1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Uma das caixinhas está vazia, informe um número por gentileza."
														,"EROR 404",JOptionPane.ERROR_MESSAGE);
				} else {
					raio = Double.parseDouble(cx1.getText());	
					area = 3.14 * (raio * raio);				
					cxresultado.setText(String.valueOf(area));
				}
			}
		});
//		<---------------------------------------------------->
		btnCalcular.setForeground(new Color(204, 153, 0));
		btnCalcular.setBackground(new Color(255, 255, 255));
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCalcular.setBounds(21, 397, 110, 44);
		panel.add(btnCalcular);
		
//		<---------------- LIMPAR ------------------------>	
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cx1.setText("");
				cxresultado.setText("");
				cx1.requestFocus();
			}
		});
//		<---------------------------------------------------->
		btnLimpar.setForeground(new Color(204, 153, 0));
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLimpar.setBackground(Color.WHITE);
		btnLimpar.setBounds(168, 397, 110, 44);
		panel.add(btnLimpar);
		
//		<---------------- CHAMAR INÍCIO ------------------------>	
		JButton btnIncio = new JButton("In\u00EDcio");
		btnIncio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial janela = new TelaInicial();
				Circulo.this.dispose();
				janela.setVisible(true);
			}
		});
//		<---------------------------------------------------->
		btnIncio.setForeground(new Color(204, 153, 0));
		btnIncio.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnIncio.setBackground(Color.WHITE);
		btnIncio.setBounds(311, 397, 110, 44);
		panel.add(btnIncio);
	}

}
