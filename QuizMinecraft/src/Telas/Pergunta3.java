package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Pergunta3 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup alternativas = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta1 frame = new Pergunta1();
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
	public Pergunta3() {
		setTitle("Quiz Minecraft");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 444, 471);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rb4 = new JRadioButton("Esqueleto");
		rb4.setBackground(new Color(255, 255, 255));
		rb4.setForeground(new Color(75, 0, 130));
		rb4.setFont(new Font("Tahoma", Font.BOLD, 15));
		alternativas.add(rb4);
		rb4.setBounds(63, 277, 120, 33);
		panel.add(rb4);
		
		JLabel lblNewLabel = new JLabel("Qual o maior monstro do jogo?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setForeground(new Color(75, 0, 130));
		lblNewLabel.setBounds(80, 231, 305, 33);
		panel.add(lblNewLabel);
		
		JRadioButton rb1 = new JRadioButton("Ghast");
		rb1.setBackground(new Color(255, 255, 255));
		rb1.setForeground(new Color(75, 0, 130));
		rb1.setFont(new Font("Tahoma", Font.BOLD, 15));
		alternativas.add(rb1);
		rb1.setBounds(236, 277, 127, 33);
		panel.add(rb1);
		
		JRadioButton rb3 = new JRadioButton("Ender Dragon");
		rb3.setBackground(new Color(255, 255, 255));
		rb3.setForeground(new Color(75, 0, 130));
		rb3.setFont(new Font("Tahoma", Font.BOLD, 15));
		alternativas.add(rb3);
		rb3.setBounds(63, 337, 127, 33);
		panel.add(rb3);
		
		JRadioButton rb2 = new JRadioButton("Zumbi");
		rb2.setBackground(new Color(255, 255, 255));
		rb2.setForeground(new Color(75, 0, 130));
		rb2.setFont(new Font("Tahoma", Font.BOLD, 15));
		alternativas.add(rb2);
		rb2.setBounds(236, 337, 127, 33);
		panel.add(rb2);
		
//		|-------------------->> VERIFICAÇÃO DOS RB <<--------------------|
		JButton btnProximo = new JButton("Pr\u00F3ximo");
		btnProximo.setForeground(new Color(255, 255, 255));
		btnProximo.setBackground(new Color(75, 0, 130));
		btnProximo.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!rb1.isSelected() && !rb2.isSelected() &&
				   !rb3.isSelected() && !rb4.isSelected()) {
					JOptionPane.showMessageDialog(null, "Você não selecionou nenhuma alternativa");
				} else {
					if(rb3.isSelected()) {
						Pontos.Acerto++;
					} else {
						Pontos.Erro++;
					}
					Pergunta4 pergunta = new Pergunta4();
					Pergunta3.this.dispose();
					pergunta.setVisible(true);
				}
			
			}
		});
//		|----------------------------------------------------------------|
		btnProximo.setBounds(254, 395, 119, 42);
		panel.add(btnProximo);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Pergunta1.class.getResource("/img/perguntas.png")));
		lblNewLabel_1.setBounds(36, 0, 365, 208);
		panel.add(lblNewLabel_1);
		
		JButton btnIncio = new JButton("In\u00EDcio");
		btnIncio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaInicio pergunta = new TelaInicio();
				Pergunta3.this.dispose();
				pergunta.setVisible(true);
			}
		});
		btnIncio.setForeground(Color.WHITE);
		btnIncio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnIncio.setBackground(new Color(75, 0, 130));
		btnIncio.setBounds(65, 395, 119, 42);
		panel.add(btnIncio);
	}
}
