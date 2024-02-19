package classe;

public class ThisDataExemplo {
    public static void main(String[] args) {

        ThisData d1 = new ThisData();
        d1.ano = 2021;

        var d2 = new ThisData(31,12,2020);

        String dataFormatada1 = d1.obterDataFormatada();

        // vão ter a mesma data porque apontam para um objeto que compartilham da mesma memória
        System.out.println(dataFormatada1);
        System.out.println(d2.obterDataFormatada());

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

    }
}
