package Projetos.RPG;

public class Guerreiro extends Personagens {

    public Guerreiro(String nome, int vida, int nivel, int mana) {
        super(nome, 150 ,nivel, mana);
    }

    @Override
    public String atacar(Personagens personagens) {
        if (vida <= 0) {
            System.out.println("Você não pode mais atacar, você esta morto");
            return "";
        }
        int dano = 12;
        System.out.println("Guerreiro atacou!");
        if (personagens instanceof Mago) {
            dano += 5;
            System.out.println("O Guerreiro tem vantagem contra o Mago");
        }
        System.out.println("Ataque fisico feito você causou " + dano + " de dano");
        personagens.tomarDano(dano, this);
        return "";
    }


    @Override
    public int defesa(int dano ,Personagens personagens) {
        if (personagens instanceof Mago){
            dano -= 3;
            System.out.println("Ataque feito pelo Mago, sua defesa reduziu o dano em " + dano);
        }
        if (personagens instanceof Guerreiro){
            dano -= 5;
            System.out.println("Ataque feito pelo Guerreiro, sua defesa reduziu o dano em " + dano);
        }
            return dano;
    }

    @Override
    public String curar() {
        int vidaCheia = 150;
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
