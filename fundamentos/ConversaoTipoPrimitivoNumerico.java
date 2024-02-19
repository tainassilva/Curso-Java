package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		// Valor inteiro tem como converter para ponto flutuante, já o contrário não dá certo
		double a = 1; // conversão implícita
		
		//O valor de ponto flutuante se origina como double. Tem que colocar o F na frente 
		float b = 1.12345F;// conversão explícita(CAST)
		//float b = (float) 1.12345232323; ... asqsim também dá certo
		// Se eu colocar mais números no float, haverá perda de informação
		
		// O java analiza os tipos . O int nãom suporta dentro do byte
		int c= 4;
		//byte d = c;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
}
