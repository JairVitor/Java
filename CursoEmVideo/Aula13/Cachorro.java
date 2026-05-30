package CursoEmVideo.Aula13;

public class Cachorro extends Mamifero{
    @Override
    public void emitirSom(){
        System.out.println("AU!AU!AU!");
    }
    public void reagir(String frase){
        if(frase == "toma comida" || frase == "Ola"){
            System.out.println("Abanando o rabo e latindo");
        }else {
            System.out.println("Rosnando");
        }
    }
    public void reagir(int hora, int min){
        if (hora < 12){
            System.out.println("Abanando o rabo");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        }else {
            System.out.println("Abanando o rabo e latindo");
        }
    }
    public void reagir(boolean dono){
        if (dono = true){
            System.out.println("Abanando o rabo");
        }else {
            System.out.println("Rosnar e Latir");
        }
    }
    public void reagir(int idade, float peso){
        if(idade < 5){
            if (peso <10){
                System.out.println("Abanando o rabo");
            }else {
                System.out.println("Latindo");
            }
        }else {
            if (peso < 10){
                System.out.println("Rosnando");
            }else {
                System.out.println("Ignorando");
            }
        }
    }
}
