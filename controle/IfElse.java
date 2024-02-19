package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
	String valor = JOptionPane.showInputDialog("Informe um número:");
	int numero = Integer.parseInt(valor);
	
	if (numero % 2 == 0) {
		JOptionPane.showMessageDialog(null,"O número é par");
	}else {
		JOptionPane.showMessageDialog(null,"O número é ímpar");	
	}
 // Só cai no else se todas as condições forem falsas
	}
}