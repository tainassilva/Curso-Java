package lambda;

@FunctionalInterface // Forca ter apenas um único método abstrato
public interface Calculo {
    // Uma classe vai implementar essa interface
    double executar(double a, double b);

    // Se tirar essa validação @FunctionalInterface vai até aceitar
    // na interface, mas vai dar erro na função lambda
    // double outroMetodo(double c, double d);

    //Pode usar um método default
    default String legal (){
        return "legal";
    }
    // Pode usar o método static
    static String muitoLegal(){
        return "Muito legal";
    }

}
