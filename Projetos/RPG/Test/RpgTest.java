package Projetos.RPG.Test;

import Projetos.RPG.Arqueiro;
import Projetos.RPG.Guerreiro;
import Projetos.RPG.Mago;
import Projetos.RPG.Personagens;

public class RpgTest {
    public static void main(String[] args) {
        Personagens [] personagens = new Personagens[3];
        personagens[0] = new Guerreiro("Torfin",150,5,15);
        personagens[1] = new Mago("Nextage", 100,10,10);
        personagens[2] = new Arqueiro("Robin", 110, 8,11);

        for (int i = 0; i < personagens.length; i++) {
            for (int j = 0; j < personagens.length; j++) {

                if (i != j) {
                    personagens[i].atacar(personagens[j]);
                }
            }
        }
    }
}
