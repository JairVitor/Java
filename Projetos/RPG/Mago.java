package Projetos.RPG;

public class Mago extends Personagens{
    public Mago(String nome, int vida, int nivel, int mana) {
        super(nome,100, nivel, mana);
    }

    @Override
    public String atacar(Personagens personagens) {
        if (vida <= 0) {
            System.out.println("Você não pode mais atacar, você esta morto");
            return "";
        }
        int dano = 12;
        System.out.println("Mago atacou!");
        if (personagens instanceof Arqueiro) {
            dano += 5;
            System.out.println("O Mago tem vantagem contra o Arqueiro");
        }
        System.out.println("Ataque fisico feito você causou " + dano + " de dano");
        personagens.tomarDano(dano, this);
        return "";
    }

    @Override
    public String curar() {
        int vidaCheia = 100;
        if (vida == vidaCheia){
            System.out.println("Voce não pode se curar, pois sua vida esta cheia");
        } else if (vida < vidaCheia) {
            vida += 10;
            System.out.println("Voce se curou");
        }else {
            System.out.println("Voce não pode se curar por que ja esta morto");
        }
        return "";
    }

    @Override
    public int defesa(int dano,Personagens personagens) {
        if (personagens instanceof Arqueiro){
            dano -= 3;
            System.out.println("Sua defesa reduziu 3 de dano");
        }
        if (personagens instanceof Mago){
            dano -= 5;
            System.out.println("Sua defesa reduziu 5 de dano");
        }
        return dano;
    }
}
