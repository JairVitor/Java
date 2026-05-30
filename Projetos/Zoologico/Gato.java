package Projetos.Zoologico;

public class Gato extends Animal{
    public Gato(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }


    public void emitirSom(){
        System.out.println("Miando...");
    }
    public void andar(){
        System.out.println("O gato anda silenciosamente");
    }
    public void comer(){
        System.out.println("Bebendo leite");
    }
}
