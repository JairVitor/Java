package Projetos.Zoologico.Test;

import Projetos.Zoologico.Animal;
import Projetos.Zoologico.Cachorro;
import Projetos.Zoologico.Gato;
import Projetos.Zoologico.Leão;

public class TestZoo{
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Cachorro("Scooby",12,10.9);
        animais[1] = new Gato("Frajola",2,5);
        animais[2] = new Leão("Frajola",2,5);

        for (Animal animal : animais){
            System.out.println(animal);

            animal.andar();
            animal.emitirSom();
            animal.comer();

            System.out.println("--------------------");
        }

        /*System.out.println(animais[0]);
        animais[0].andar();
        animais[0].emitirSom();
        animais[0].comer();
        System.out.println("---------------------");
        System.out.println(animais[1]);
        animais[1].andar();
        animais[1].emitirSom();
        animais[1].comer();
        System.out.println("---------------------");
        System.out.println(animais[2]);
        animais[2].andar();
        animais[2].emitirSom();
        animais[2].comer();
        */

       /* Animal animal = new Cachorro("Scooby",12,10.9);
        System.out.println(animal);
        animal.andar();
        animal.emitirSom();
        animal.comer();
        System.out.println("------------------------------");
        Animal animal1 = new Gato("Frajola",2,5);
        System.out.println(animal1);
        animal1.andar();
        animal1.emitirSom();
        animal1.comer();
        System.out.println("------------------------------");
        Animal animal2 = new Leão("Mufasa", 19,100);
        System.out.println(animal2);
        animal2.andar();
        animal2.emitirSom();
        animal2.comer();
        */
    }
}
