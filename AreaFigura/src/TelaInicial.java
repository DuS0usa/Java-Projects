import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setResizable(false);
		setTitle("C\u00E1lculos de \u00C1reas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 181));
		panel.setBounds(0, 0, 444, 471);
		contentPane.add(panel);
		panel.setLayout(null);
		
//		<---------------- CHAMAR QUADRADO ------------------------>
		JButton btnQuadrado = new JButton("Quadrado");
		btnQuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//construir a tela do retangulo(construtor)//
				Quadrado janela = new Quadrado();
				
				 //fechar a tela do retangulo//
					TelaInicial.this.dispose();
					
				//exibir e chamar a tela do retangulo//
					janela.setVisible(true);
			}
		});
//		<---------------------------------------------------->
		btnQuadrado.setForeground(new Color(204, 153, 0));
		btnQuadrado.setBackground(new Color(255, 255, 255));
		btnQuadrado.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnQuadrado.setBounds(29, 278, 159, 29);
		panel.add(btnQuadrado);
		
//		<---------------- CHAMAR RETâNGULO ------------------------>
		JButton btnRetngulo = new JButton("Ret\u00E2ngulo");
		btnRetngulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//construir a tela do retangulo(construtor)//
				Retangulo janela = new Retangulo();
				
				 //fechar a tela do retangulo//
					TelaInicial.this.dispose();
					
				//exibir e chamar a tela do retangulo//
					janela.setVisible(true);
			}
		});
//		<---------------------------------------------------->
		btnRetngulo.setForeground(new Color(204, 153, 0));
		btnRetngulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRetngulo.setBackground(Color.WHITE);
		btnRetngulo.setBounds(253, 278, 159, 29);
		panel.add(btnRetngulo);
		
//		<---------------- CHAMAR TRIÂNGULO ------------------------>
		JButton btnTringulo = new JButton("Tri\u00E2ngulo");
		btnTringulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Triangulo janela = new Triangulo();
				TelaInicial.this.dispose();
				janela.setVisible(true);	
			}
		});
//		<---------------------------------------------------->
		btnTringulo.setForeground(new Color(204, 153, 0));
		btnTringulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTringulo.setBackground(Color.WHITE);
		btnTringulo.setBounds(29, 334, 159, 29);
		panel.add(btnTringulo);
		
//		<---------------- CHAMAR LOSANGO ------------------------>
		JButton btnLosango = new JButton("Losango");
		btnLosango.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Losango janela = new Losango();
				TelaInicial.this.dispose();
				janela.setVisible(true);
			}
		});
//		<---------------------------------------------------->
		btnLosango.setForeground(new Color(204, 153, 0));
		btnLosango.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLosango.setBackground(Color.WHITE);
		btnLosango.setBounds(253, 334, 159, 29);
		panel.add(btnLosango);

//		<---------------- CHAMAR CÍRCULO ------------------------>
		JButton btnCrculo = new JButton("C\u00EDrculo");
		btnCrculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Circulo janela = new Circulo();
				TelaInicial.this.dispose();
				janela.setVisible(true);
			}
		});
//		<---------------------------------------------------->
		btnCrculo.setForeground(new Color(204, 153, 0));
		btnCrculo.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCrculo.setBackground(Color.WHITE);
		btnCrculo.setBounds(29, 389, 159, 29);
		panel.add(btnCrculo);
		
//		<---------------- CHAMAR TRAPÉZIO ------------------------>
		JButton btnTrapzio = new JButton("Trap\u00E9zio");
		btnTrapzio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Trapezio janela = new Trapezio();
				TelaInicial.this.dispose();
				janela.setVisible(true);
			}
		});
//		<---------------------------------------------------->
		btnTrapzio.setForeground(new Color(204, 153, 0));
		btnTrapzio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTrapzio.setBackground(Color.WHITE);
		btnTrapzio.setBounds(253, 389, 159, 29);
		panel.add(btnTrapzio);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/logo.png")));
		lblNewLabel.setBounds(49, 11, 341, 231);
		panel.add(lblNewLabel);
	}
}
