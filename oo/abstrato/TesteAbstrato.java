package oo.abstrato;

public class TesteAbstrato {
    public static void main(String[] args) {
        Animal a = new Cachorro();
        Mamifero m = new Cachorro();

        System.out.println(a.mover());
        System.out.println(m.mamar());
        System.out.println(m.respirar());
    }
}
