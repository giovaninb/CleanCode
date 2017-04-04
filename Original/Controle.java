package controle;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.print.attribute.standard.NumberUpSupported;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Calculadora;
import visão.App;

public class Controle implements KeyListener, ActionListener {

	private App app;
	private Calculadora calc;
	private int num1, num2, resultado;

	public Controle(App app) {
		this.app = app;
		registraListeners();
	}

	public void registraListeners() {
		System.out.println("Entra registraListeners.");
		// KeyListeners
		this.app.getBtnSomar().addKeyListener(this);
		this.app.getBtnLimpar().addKeyListener(this);
		// ActionListeners
		this.app.getBtnSomar().addActionListener(this);
		this.app.getBtnLimpar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equalsIgnoreCase("Somar")) {
			System.out.println("Somar pressionado!");
			calculaResultado();
		}
		if (e.getActionCommand().equalsIgnoreCase("Limpar")) {
			System.out.println("Limpar pressionado!");
			limparTela();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == e.VK_ENTER && e.getSource() == this.app.getBtnSomar()) {
			calculaResultado();
			limparTela();
			app.getTextField().requestFocus();
		} else if (e.getKeyCode() == e.VK_ENTER && e.getSource() == this.app.getBtnLimpar()) {
			limparTela();
			app.getTextField().requestFocus();
		} else if (e.getKeyCode() == e.VK_ENTER) {
			((JTextField) e.getSource()).transferFocus();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void calculaResultado() {
		try {
			System.out.println("---------------");
			num1 = Integer.parseInt(this.app.getTextField().getText());
			System.out.println("Num1: " + num1);
			num2 = Integer.parseInt(this.app.getTextField2().getText());
			System.out.println("Num2: " + num2);
			resultado = num1 + num2;
			System.out.println("Resultado: " + resultado);
			System.out.println("---------------");
			// this.app.getTextPane().setText(String.valueOf(resultado));
			this.app.getTextResultado().setText(String.valueOf(new Calculadora(num1, num2, resultado)));
		} 
		catch (NumberFormatException e) {
			// TODO: handle exception
			JOptionPane vazio = new JOptionPane();
			System.out.println("Valores incorretos ou inexistentes. Por favor, digite valores inteiros.");
			JOptionPane.showMessageDialog(app, "Valores incorretos ou inexistentes. Por favor, digite valores inteiros.");
		} 
		
	}

	public void limparTela() {
		this.app.getTextField().setText("");
		this.app.getTextField2().setText("");
		this.app.getTextResultado().setText("");
	}

}
