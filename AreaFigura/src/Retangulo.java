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

public class Retangulo extends JFrame {

	private JPanel contentPane;
	private JTextField cx1;
	private JTextField cx2;
	private JTextField cxresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Retangulo frame = new Retangulo();
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
	public Retangulo() {
		setTitle("\u00C1rea do Ret\u00E2ngulo");
		setResizable(false);
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
		lblNewLabel.setIcon(new ImageIcon(Retangulo.class.getResource("/img/retangulo1.png")));
		lblNewLabel.setBounds(47, 11, 340, 165);
		panel.add(lblNewLabel);
		
		JLabel label1 = new JLabel("Digite a BASE:");
		label1.setForeground(new Color(0, 0, 0));
		label1.setBackground(new Color(255, 255, 255));
		label1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label1.setBounds(75, 217, 104, 14);
		panel.add(label1);
		
		cx1 = new JTextField();
		cx1.setBounds(189, 215, 173, 20);
		panel.add(cx1);
		cx1.setColumns(10);
		
		cx2 = new JTextField();
		cx2.setColumns(10);
		cx2.setBounds(189, 262, 173, 20);
		panel.add(cx2);
		
		JLabel lblNewLabel_1 = new JLabel("Digite a ALTURA:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(75, 265, 121, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(93, 322, 104, 14);
		panel.add(lblNewLabel_2);
		
		cxresultado = new JTextField();
		cxresultado.setFont(new Font("Tahoma", Font.BOLD, 15));
		cxresultado.setEditable(false);
		cxresultado.setColumns(10);
		cxresultado.setBounds(189, 311, 173, 36);
		panel.add(cxresultado);
		
//		<---------------- CÁLCULO ------------------------>	
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double altura, base, area;
				
				if(cx1.getText().equals("") || cx2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Uma das caixinhas está vazia, informe um número por gentileza."
														,"EROR 404",JOptionPane.ERROR_MESSAGE);
				} else {
					altura = Double.parseDouble(cx1.getText());
					base = Double.parseDouble(cx2.getText());		
					area = altura * base;				
					cxresultado.setText(String.valueOf(area));
				}
			}
		});
//		<---------------------------------------------------->
		btnCalcular.setForeground(new Color(204, 153, 0));
		btnCalcular.setBackground(new Color(255, 255, 255));
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCalcular.setBounds(21, 394, 104, 36);
		panel.add(btnCalcular);
		
//		<---------------- LIMPAR ------------------------>	
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cx1.setText("");
				cx2.setText("");
				cxresultado.setText("");
				cx1.requestFocus();
			}
		});
//		<---------------------------------------------------->
		btnLimpar.setBackground(new Color(255, 255, 255));
		btnLimpar.setForeground(new Color(204, 153, 0));
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLimpar.setBounds(169, 394, 104, 36);
		panel.add(btnLimpar);
		
//		<---------------- CHAMAR INÍCIO ------------------------>
		JButton btnIncio = new JButton("In\u00EDcio");
		btnIncio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//construir a tela inicial(construtor)//
				TelaInicial inicial = new TelaInicial();
				
				 //fechar a tela do retangulo//
					Retangulo.this.dispose();
					
				//exibir e chamar a tela do retangulo//
					inicial.setVisible(true);
			}
		});
//		<---------------------------------------------------->
		btnIncio.setForeground(new Color(204, 153, 0));
		btnIncio.setBackground(new Color(255, 255, 255));
		btnIncio.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnIncio.setBounds(319, 394, 104, 36);
		panel.add(btnIncio);
	}

}
