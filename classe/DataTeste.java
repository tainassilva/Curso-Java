package classe;
public class DataTeste {
	public static void main(String[] args) {
		
		Data data = new Data(); // Data padrão 1/1/1970
		data.ano = 2021; // Como é uma variável , eu consigo atribuir um novo valor
		
		//Só passando os parâmetros 
		Data data2 = new Data(28,03,2023); 
		
		System.out.println(data.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
		
	}
}
