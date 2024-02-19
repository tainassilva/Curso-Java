package fundamentos.operadores;

public class Aritmeticos {
	public static void main(String[] args) {
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // Como está em número inteiro , só vai aparecer o primeiro da divisão
		System.out.println(a / (double )b); // Com o CAST vai aparecer as casas depois da vígula
		System.out.println(a / (float) b);
		
		// Resto da divisão
		System.out.println(a % b);
		System.out.println(8 % 3);
		
		System.out.println(x + y - a * b);
		
		// como elevar um número a potência 
	   // O valor do tipo pow retorna double e abaixo teve que fazer um cast
	    int c = (int) Math.pow(2, 10); // 2 elevado a 10
		System.out.println(c);
		
	}
}
