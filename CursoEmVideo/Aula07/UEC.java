package CursoEmVideo.Aula07;

public class UEC {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França", 11, 1, 2, 1.75f,68.9f,31);
        l[1] = new Lutador("Putscript","Brasil",14,2,3,1.68f,57.8f,29);
        l[2] = new Lutador("Snapshadow","EUA",12,1,2,1.65f,80.9f,35);
        l[3] = new Lutador("Dead Code","Australia",13,2,0,1.93f,81.6f,28);
        l[4] = new Lutador("UFOCobol","Brasil",5,3,4,1.70f,119.3f,37);
        l[5] = new Lutador("Nerdaart","EUA",12,4,2,1.81f,105.7f,30);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0],l[1]);
        UEC01.lutar();

    }
}
