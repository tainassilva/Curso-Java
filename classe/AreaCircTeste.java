package classe;

public class AreaCircTeste {
    public static void main(String[] args) {

        // É digitado o valor do raio e ele calcula chamando a classe AreaCirc
        AreaCirc a = new AreaCirc(5.6);
        System.out.println(a.area());

        // Aqui ele atribui o valor a pi
        AreaCirc a2 = new AreaCirc(5);
        a2.pi = 5;
        System.out.println(a2.area());
        // O out está sendo acessado direto da classe System

        // com o static, eu posso colocar assim pra acessar, pois ele só pode ser acessado a partir da classe
        // AreaCirc.pi = 3.1415



    }
}
