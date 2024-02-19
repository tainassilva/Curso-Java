package controle;

public class For3 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) { // se o i for menor que 10, ele entra dentro do outro for
			for(int j = 0; j < 10; j++ ) {
				System.out.printf("[%d %d]", i,j); // se o j for menor que 10 , ele executa até chegar no 9,
			}									  // sai do laço e testa novamente o i.
			System.out.println();
		}
	}
}

