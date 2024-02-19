package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7 ;
		
		System.out.println(condicao1 && condicao2); //O and tem que ser as duas condições verdadeiras para true
												   // Representado por && . Esta expressão vai ser false
		
		System.out.println(condicao1 || condicao2); // o ou tem que ser apenas uma condição verdadeira para true
		                                           // Representado por || . Esta expressão vai ser true
		
		System.out.println(!condicao2); // Ele inverte o valor lógico . Representado por !
		System.out.println(condicao1 && !condicao2); // true, pois inverteu a condição2
	}
	
}
