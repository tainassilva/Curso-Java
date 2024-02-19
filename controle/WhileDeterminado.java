package controle;

public class WhileDeterminado {
	public static void main(String[] args) {
		
		int contador = 1; // Inicia o valor desejado,
		
		while (contador <= 20){ // Só vai parar se a condição for falsa
			System.out.println("contador= " + contador);
			contador+=2; // Conta até 20 de 2 em 2
		}
	}
}
