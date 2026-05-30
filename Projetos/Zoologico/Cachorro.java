package Projetos.Zoologico;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }


    public void emitirSom(){
        System.out.println("Latindo...");
    }
    public void andar(){
        System.out.println("O cachorro corre abanando o rabo");
    }
    public void comer(){
        System.out.println("Comendo ração");
    }
}
