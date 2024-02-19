package classe;

public class ValorXRerefencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // Atribuição por valor (Tipo primitivo)

        //São valores indepedentes
        a++; //3
        b--; //1
        System.out.println(a + " " + b);

        Data d1 = new Data(1,6, 2022);
        Data d2 = d1; // Atribuição por referência (Objeto)

        d1.dia= 31;
        d2.mes = 12;
        d1.ano = 2025;

        // vão ter a mesma data porque apontam para um objeto que compartilham da mesma memória
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        // A chamada desse objeto alterou os objetos por onde passou
        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        // Aqui não gerá impacto porque esse resultado vai para outro lugar
        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }
    // Isso daqui não é uma boa prática
        static void voltarDataParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
    static void alterarPrimitivo(int c){
        c++;
    }
}
