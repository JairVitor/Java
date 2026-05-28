package Projetos.RPG;

public class Arqueiro extends Personagens {
    public Arqueiro(String nome, int vida, int nivel, int mana) {
        super(nome, 110, nivel, mana);
    }

    @Override
    public String atacar(Personagens personagens) {
        if (vida <= 0) {
            System.out.println("Você não pode mais atacar, você esta morto");
            return "";
        }
        int dano = 12;
        System.out.println("Arqueiro atacou!");
        if (personagens instanceof Guerreiro) {
            dano += 5;
            System.out.println("O Arqueiro tem vantagem contra o Guerreiro");
        }
        System.out.println("Ataque fisico feito você causou " + dano + " de dano");
        personagens.tomarDano(dano, this);
        return "";
    }

    @Override
    public int defesa(int dano, Personagens personagens){
        if (personagens instanceof Guerreiro){
            dano -= 3;
            System.out.println("Dano final recebido: " + dano);
        }
        if (personagens instanceof Arqueiro){
            dano -= 5;
            System.out.println("Dano final recebido: " + dano);
        }
        return dano;
    }

    @Override
    public String curar() {
        int vidaCheia = 110;
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
}
