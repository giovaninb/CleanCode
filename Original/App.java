package visão;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class App extends JFrame {
	private JPanel painelMaster;
	private JPanel painel;
	private JPanel painel2;
	private JPanel painel3;
	private JTextField textResultado;
	private JTextField textField;
	private JTextField textField2;
	private JButton btnSomar;
	private JButton btnLimpar;
	private JMenuBar menuBar;
	private JMenu mnMenu;
	private JMenuItem mntmSair;

	/**
	 * Create the frame.
	 */
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 250);
		setTitle("Prova 2 POO I");

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnMenu = new JMenu("Menu");
		mnMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
		menuBar.add(mnMenu);

		mntmSair = new JMenuItem("Sair");
		mntmSair.setFont(new Font("Tahoma", Font.BOLD, 15));
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnMenu.add(mntmSair);

		painelMaster = new JPanel();
		painelMaster.setBackground(new Color(255, 204, 204));
		painelMaster.setBorder(new EmptyBorder(5, 5, 5, 5));
		painelMaster.setLayout(new GridLayout(1, 1, 10, 10));
		setContentPane(painelMaster);

		painel = new JPanel();
		painel.setBackground(new Color(255, 204, 204));
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		painel.setLayout(new GridLayout(3, 1, 10, 10));
		painelMaster.add(painel);

		textResultado = new JTextField();
		textResultado.setFont(new Font("Tahoma", Font.BOLD, 30));
		textResultado.setEditable(false);
		textResultado.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		painel.add(textResultado);

		painel2 = new JPanel();
		painel2.setBackground(new Color(255, 204, 204));
		painel2.setBorder(new EmptyBorder(5, 5, 5, 5));
		painel2.setLayout(new FlowLayout());
		painel.add(painel2);

		JLabel nume1 = new JLabel("Primeiro número:");
		nume1.setFont(new Font("Tahoma", Font.BOLD, 15));
		painel2.add(nume1);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		painel2.add(textField);
		textField.setColumns(10);

		JLabel nume2 = new JLabel("Segundo número:");
		nume2.setFont(new Font("Tahoma", Font.BOLD, 15));
		painel2.add(nume2);

		textField2 = new JTextField();
		textField2.setFont(new Font("Tahoma", Font.BOLD, 15));
		painel2.add(textField2);
		textField2.setColumns(10);

		painel3 = new JPanel();
		painel3.setBackground(new Color(255, 204, 204));
		painel3.setBorder(new EmptyBorder(5, 5, 5, 5));
		painel3.setLayout(new FlowLayout());
		painel.add(painel3);

		btnSomar = new JButton("Somar");
		btnSomar.setFont(new Font("Tahoma", Font.BOLD, 15));
		painel3.add(btnSomar);

		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 15));
		painel3.add(btnLimpar);
	}

	/*
	 * 
	 * Método para alterar dar fit na fonte public void
	 * 
	 * setTextFitTextField(JTextField txField, String text){ Font originalFont =
	 * (Font)txField.getClientProperty("originalfont"); // Pegar fonte original
	 * com as propriedades do Client if (originalFont == null) { // primeiro vez
	 * que chamamos, ele adiciona originalFont = txField.getFont();
	 * txField.putClientProperty("originalfont", originalFont); } int
	 * stringWidth = txField.getFontMetrics(originalFont).stringWidth(text); int
	 * componentWidth = txField.getWidth();
	 * 
	 * if (stringWidth > componentWidth) { // Reajuste se necessário // Para
	 * descobrir quanto a fonte precisa encolher double widthRatio =
	 * (double)componentWidth / (double)stringWidth;
	 * 
	 * int newFontSize = (int)Math.floor(originalFont.getSize() * widthRatio);
	 * // Manter o tamanho mínimo
	 * 
	 * // 'Seta' a fonte do txField para o novo valor determinado.
	 * txField.setFont(new Font(originalFont.getName(), originalFont.getStyle(),
	 * newFontSize)); } else txField.setFont(originalFont); // Texto ajustado,
	 * não precisa de ajustes
	 * 
	 * txField.setText(text); }
	 * 
	 */

	public JButton getBtnSomar() {
		return btnSomar;
	}

	public void setBtnSomar(JButton btnSomar) {
		this.btnSomar = btnSomar;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}

	public JTextField getTextResultado() {
		return textResultado;
	}

	public void setTextResultado(JTextField textResultado) {
		this.textResultado = textResultado;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField2() {
		return textField2;
	}

	public void setTextField2(JTextField textField2) {
		this.textField2 = textField2;
	}

}
