package fundamentos.operadores;

public class DesafioLogico {
	public static void main(String[] args) {
		/* Trabalho na terça ( V ou F )
		/* Trabalho na quinta ( V ou F )
		 se um trabalho der certo,vai comprar a tv de 32
		 se os dois trabalho der certo, vai comprar a tv de 50
		 se um dos dois derem certo, a familia vai no shopping tomar sorvete
		 se nenhum dos dois derem certo, a familia vai ficar em casa
		 fazer uma negação de se a familia não tomar sorvete, ela está mais saudável
		*/
		
		boolean trabalhoTerca = true;
	    boolean trabalhoQuinta = true;
	    
	    if (trabalhoTerca && trabalhoQuinta ) {
	    	System.out.println("Compre a tv de 50 polegadas e vá tomar sorvete");
	    }
	    
	    if (trabalhoTerca || !trabalhoQuinta ) { // trabalho na terça deu certo, mas o de quinta não
	        System.out.println("Compre a tv de 32 polegadas e vá tomar sorvete");
	    }
	    
	    if (!trabalhoTerca && !trabalhoQuinta ) { 
	    	System.out.println(" Fique em casa porque tu está pobre");
	    }
		
		
	}
}
