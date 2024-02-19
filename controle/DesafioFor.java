package controle;

public class DesafioFor {
	public static void main(String[] args) {
		
		// Fazer com que exiba uma escadinha sem números na estrutura de controle
		String valor = "#";
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(valor);
//			valor += "#";
//		}
		// Se não for igual a 6 # , ele continua repetindo
		for(valor.equals("#");!valor.equals("######"); valor+="#") {
			System.out.println(valor);
		}
	}
}
 