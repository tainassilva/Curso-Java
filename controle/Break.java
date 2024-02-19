package controle;

public class Break {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
	 //o break para o programa abruptamente, 
	//saiu do laço de repetição assim que encontrou o break e executou o que estava abaixo
		System.out.println(i);
		}
		System.out.println("Fim!");
	}
}
