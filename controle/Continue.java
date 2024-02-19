package controle;

public class Continue {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if (i == 5 || i ==6) {
				continue;
			}
		System.out.println(i);
		}
// Ele interrompe o que entrar na condição e executa 
// o restante do laço
}
}
