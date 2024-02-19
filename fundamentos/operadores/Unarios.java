package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++;  // a = a + 1
		a--; //a = a - 1
		
		++b;  // b = b + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio...");
		System.out.println(++a == b--); // O ++ na frente apressa em fazer a conta, vai incrementar antes de comparar
									   // Depois vai apenas comparar o b com o a . O b vale 2 e o a incrementou mais 1 = 2
									  // O resultado vai ser true
		
		System.out.println(a);
		System.out.println(b);
		
	}
	}
