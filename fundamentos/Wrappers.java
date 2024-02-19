package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
	//wrapper : Uma classe que dentro dela acaba envolvendo tipo primitivo
		
	Byte b = 100;
	Short s = 1000;
	Integer i = 10000;
	Long l= 100000L; // colocando o l no final porque ele entende como int
	
	// Convertendo uma string para int 
	Integer inteiro = Integer.parseInt("1000");
	System.out.println(inteiro);
	
	
	// O valor do byte que está nesta classe
	System.out.println(b.byteValue());
	
	// Transforma o valor do s em string. Mas podemos encontrar diversos comportamentos
	System.out.println(s.toString());
	
	System.out.println(l / 3);
	System.out.println(i * 3);
	
	Float f =  123.0F;
	System.out.println(f);
	
	Double d = 1234.5678;
	System.out.println(d);
	
	// Transformando a string em um valor booleano
	Boolean bo = Boolean.parseBoolean("true");
	System.out.println(bo);
	// Transformando o valor booleano em string e colocando em letra maiúscula
	System.out.println(bo.toString().toUpperCase());
	
	Character c = '#';
	System.out.println(c + "...");
	}

}
