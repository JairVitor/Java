package Projetos.Zoologico;

public abstract class Animal {
    private String nome;
    private int idade;
    private double peso;

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                '}';
    }

    public void comer(){
        System.out.println("comendo...");
    }

    public void andar(){
        System.out.println("Andando...");
    }

    public void emitirSom(){
        System.out.println("Emitindo som...");
    }

    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
