package classe;

// Funções de instância tem associado o this
public class ThisData {
    int dia;
    int mes;
    int ano;

    ThisData() {
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        // A partir de um construtor, chamar outro construtor
        this(1,1,1970);
    }

    ThisData(int dia, int mes, int ano) {
        // se eu fizer dia = dia, não vai fazer nada
        this.dia = dia; // O this referencia o objeto que está sendo criado, o objeto atual
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(this.obterDataFormatada());
    }
//    static void teste(){
//        // Aqui seria inválido porque não tem a setença dia
//        this.dia = 3;
//
//}
}
