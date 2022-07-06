import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quadrado extends JFrame {

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
					Quadrado frame = new Quadrado();
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
	public Quadrado() {
		setResizable(false);
		setTitle("\u00C1rea do Quadrado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 235, 205));
		panel.setBounds(0, 0, 444, 471);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Quadrado.class.getResource("/img/quadrado1.png")));
		lblNewLabel.setBounds(47, 11, 332, 181);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite o Lado:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(66, 216, 101, 16);
		panel.add(lblNewLabel_1);
		
		cx1 = new JTextField();
		cx1.setBounds(168, 216, 177, 20);
		panel.add(cx1);
		cx1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(66, 273, 101, 14);
		panel.add(lblNewLabel_2);
		
		cxresultado = new JTextField();
		cxresultado.setEditable(false);
		cxresultado.setFont(new Font("Tahoma", Font.BOLD, 15));
		cxresultado.setColumns(10);
		cxresultado.setBounds(168, 260, 177, 41);
		panel.add(cxresultado);
		
//		<---------------- CÁLCULO ------------------------>
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double lado, area;
				lado = Double.parseDouble(cx1.getText());
				
				if(cx1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Uma das caixinhas está vazia, informe um número por gentileza."
														,"EROR 404",JOptionPane.ERROR_MESSAGE);
				} else {				
					area = lado * lado;	
					cxresultado.setText(String.valueOf(area));
				}
			}
		});
//		<---------------------------------------------------->
		btnCalcular.setBackground(new Color(255, 255, 255));
		btnCalcular.setForeground(new Color(204, 153, 0));
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCalcular.setBounds(21, 375, 101, 30);
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
		btnLimpar.setBackground(new Color(255, 255, 255));
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLimpar.setBounds(168, 375, 101, 30);
		panel.add(btnLimpar);
		
//		<---------------- CHAMAR TELA ------------------------>
		JButton btnIncio = new JButton("In\u00EDcio");
		btnIncio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//construir a tela inicial(construtor)//
				TelaInicial inicial = new TelaInicial();
				
				 //fechar a tela do retangulo//
					Quadrado.this.dispose();
					
				//exibir e chamar a tela do retangulo//
					inicial.setVisible(true);
			}
		});
//		<---------------------------------------------------->
		btnIncio.setBackground(new Color(255, 255, 255));
		btnIncio.setForeground(new Color(204, 153, 0));
		btnIncio.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnIncio.setBounds(313, 375, 101, 30);
		panel.add(btnIncio);
	}
}
