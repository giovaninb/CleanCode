package controle;

import java.awt.EventQueue;

import visão.App;

/*
 * Aplicação simples para mostrar a estruturação
 * do modelo Model, View and Control (MVC) de uma
 * calculadora simples, cujo único propósito é realizar 
 * a soma de dois números.
 */

public class Main {
	
	/**
	 * Método para lançar a aplicação.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					Controle controle  = new Controle(frame);
					frame.setVisible(true);
					frame.setResizable(false);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
