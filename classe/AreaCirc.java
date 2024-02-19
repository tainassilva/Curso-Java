package classe;

public class AreaCirc {

    double raio;
    double pi; // Pode ser usado Math.pi
              // colocando o static, ele fica associado a classe e não a instância
    // Para uma constante eu posso fazer assim:
    // final static double PI = 3.1415;
    AreaCirc(double raioInicial){
        pi= 3.14;
        raio = raioInicial;
    }
    double area(){
        // Math é um método estático, eu não preciso ficar criando uma instância para acessar a ele
        return pi * Math.pow(raio, 2);
       //return pi*raio*raio;
    }
//    static double area(double raio){
//        return pi * Math.pow(raio, 2);
//    }
    // pra acessar ele diretamente por classe : AreaCirc.area(2.5);

}

