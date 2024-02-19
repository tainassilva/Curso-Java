package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5; // Declarada e inicializada
		System.out.println(a);
		
		// eu não posso colocar uma variável de outro tipo , pois o java fixa o tipo 
		//a = "...";
		
		//var b = 4.5;
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);	
		
		// Aqui vai dar erro porque já foi determinada como String inicialmente
		//c = 4.5;
		
		double d; // Variável foi declarada
		d = 123.54; // Variável foi inicializada
		System.out.println(d); // Variável foi usada
		
		// com o var eu não consigo fazer sem iniciar a variável
		 //var e ;
		 //var = 123.54;
		 //System.out.println(e);
		 
		 var f = 123.54;
		 System.out.println(f);
		 
		
		
		
				
	} 

}
