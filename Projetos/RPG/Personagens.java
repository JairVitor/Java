package Projetos.RPG;

public abstract class Personagens {
    protected String nome;
    protected int vida, nivel, mana;

    public void vida(){
        if (vida <= 0){
            System.out.println("O personagem morreu");
        }else {
            System.out.println("Seu personagem ainda esta vivo");
        }
    }

    public Personagens(String nome, int vida,int nivel, int mana) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Personagens{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", nivel=" + nivel +
                ", mana=" + mana +
                '}';
    }

    public abstract String atacar(Personagens personagens);

    public void tomarDano(int dano, Personagens personagens){
        dano = defesa(dano, personagens);
        vida  -= dano;
        if (vida < 0){
            vida = 0;
        }
        System.out.println(nome + " tomou " + dano + " de dano. Vida: " + vida);

        if (vida <= 0){
            System.out.println(nome + " morreu!!");
        }
    }

    public abstract String curar();

    public abstract int defesa(int dano,Personagens personagens);
}
