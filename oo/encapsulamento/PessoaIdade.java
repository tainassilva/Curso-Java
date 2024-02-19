package oo.encapsulamento;

public class PessoaIdade {
    private int idade;
    private String nome;
    private String sobrenome;
    public PessoaIdade(String nome,String sobrenome, int idade) {
        //Pode usar para não entrar idades negativas
        setNome(nome);
        setIdade(idade);
        setSobrenome(sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getNomeCompleto(){
        return getNome() + " " + getSobrenome();
    }

    // Getter : Mostra o valor da idade
    public int getIdade() {
        return idade;
    }
    // Setter : Atribui um valor a idade
    public void setIdade(int novaIdade) {
        // Validando idade positiva(abs)
        // Joga o negativo para o positivo
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }

    @Override
    public String toString() {
        return "Olá, eu sou a " + getNome() +
                " e tenho " + getIdade() + " anos.";
    }
}
