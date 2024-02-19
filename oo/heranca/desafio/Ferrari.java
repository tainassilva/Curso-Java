package oo.heranca.desafio;

// O implements usa a interface
public class Ferrari extends Carro implements Esportivo, Luxo{

    private boolean ligarTurbo;
    private boolean ligarAr;
    Ferrari(){
        this(500);
    }
    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr= false;
    }

    @Override
    public int getDelta() {
        // Se o turbo estiver ligado e o ar estiver desligado
        if(ligarTurbo && !ligarAr){
            return 35;
        }
        // Se o turbo estiver ligado e o ar também , diminui a potência do carro
        else if(ligarTurbo && ligarAr){
            return 30;
        }
        // Se o turbo estiver desligado e o ar também
        else if(!ligarTurbo && !ligarAr){
            return 20;
        }
        // Caso não ocorra nenhum dos casos
        else{
            return 15;
        }
    }

    //O Override lida se está sobrescrevendo da classe pai
    // Se sobrescrever, não pode baixar a visibilidade mas pode aumentar
    //Não pode ir de protected para publico, mas pode ir de protected para privado
//    @Override
//   public void acelerar(){
//        super.acelerar();
    }


