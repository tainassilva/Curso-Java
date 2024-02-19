package fundamentos;

import java.util.Scanner;

public class DesafioFimModulo {
	/*Desafio 1 : Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
	* Desafio 2 : Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
	* Desafio 3 : Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
	* Desafio 4 : Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
	* Desafio 5 : Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
	* Desafio 6 : Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) 
	     utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
	*/
	
	public static void main(String[] args) {
		// Desafio 1 
		Scanner entrada =  new Scanner(System.in);
		System.out.print("Digite o valor em fahrenheit que deseja converter para celsius: ");
		double fah = entrada.nextDouble();
		double cel = (fah- 32) * 1.8;
		System.out.printf("%.2f fahrenheit equivale a %.2f graus celsius\n", fah,cel);
		
		// desafio 2
		System.out.print("Digite o valor em celsius que deseja converter para fahrenheit: ");
		double celsius = entrada.nextDouble();
		double fahrenheit = celsius * 1.8 + 32;
		System.out.printf("%.2f celsius equivale a %.2f graus fahrenheit\n", celsius,fahrenheit);
		
		// desafio 3
		System.out.print("Digite o seu peso: ");
		double peso = entrada.nextDouble();
		System.out.print("Digite a sua altura: ");
		double altura = entrada.nextDouble();
		double calculoImc = peso / Math.pow(altura,2);
		System.out.println("O seu imc é : " + calculoImc);
		
		//desafio 4
		
		System.out.print("Digite um valor que deseja ver ao quadrado e ao cubo: \n");
		int valor = entrada.nextInt();
		int valorQuadrado = (int) Math.pow(valor, 2);
		int valorCubo = (int) Math.pow(valor, 3);
		System.out.printf("O valor %d ao quadrado é %d e o valor ao cubo é %d\n",
				valor, valorQuadrado,valorCubo );
		
		//Desafio 5 
		System.out.print("Digite a base do triângulo: \n");
		double baseTriangulo  = entrada.nextDouble();
		System.out.print("Digite a altura do triângulo: \n");
		double alturaTriangulo = entrada.nextDouble();
		double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
		System.out.println("A área do triângulo é: " + areaTriangulo);
		
		//Desafio 6
		
		int a = 1;
		int b = 12;
		int c = -13;
		System.out.printf("Sua equação é: %dx² + %dx + %d = 0\n");
		int delta = (b*b) - (4 * a * c);
		System.out.printf("O valor de delta é %d", delta);
		
		int x1 = (int) ((-b + Math.sqrt(delta))/( 2 * a)); 
		int x2 = (int) ((-b - Math.sqrt(delta))/( 2 * a)); 
		
		System.out.printf("O valor do seu X1 é %d e o valor do seu X2 é" ,
				x1,x2);
		
		entrada.close();
	}
	
}
