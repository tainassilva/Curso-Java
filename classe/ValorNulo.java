package classe;

public class ValorNulo {
    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.concat("!!!"));

        // Erro de compilação: O programa nem executa
        // Precisa inicializar variáveis que são locais
        // String s2;

        /// NullPointerException: Essa variável é nula e voce vai tentar acessar algum atributo
        // String s2 = null;

        String s2 = Math.random() > 0.5 ? "Opa" : null;
        if (s2 != null) {
            System.out.println(s2.concat("???"));
        }

        /// NullPointerException: não aponta para um objeto real
        // não pode acessar atributo e nem método de algo que está nulo
        //Data d1= null;

        // Uma hora está nulo e outra não
        Data d1 = Math.random() > 0.5 ? new Data() : null;
        if (d1 != null) {
            d1.mes = 3;
            System.out.println(d1.obterDataFormatada());
        }
    }
}
