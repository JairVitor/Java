package Projetos.Zoologico;

public class Leão extends Animal{
    public Leão(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public void emitirSom(){
        System.out.println("Rugindo....");
    }
    public void comer(){
        System.out.println("Comendo carne");
    }
    public void andar(){
        System.out.println("O leão anda lentamente observando a caça");
    }
}
