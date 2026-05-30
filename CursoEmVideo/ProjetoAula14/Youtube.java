package CursoEmVideo.ProjetoAula14;

public class Youtube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Como o Real Madrid jogou sua HISTÓRIA no LIXO");
        v[1] = new Video("Speedrun de Invadir um CULTO (any% essa aqui kkkk)");
        v[2] = new Video("GRANNY tem a FAMÍLIA MAIS MALIGNA dos jogos?");

        gafanhotos g[] = new gafanhotos[2];
        g[0] = new gafanhotos("Jair", 20, "M","Jay");
        g[1] = new gafanhotos("Pedro", 17, "M","Peter");

       Visualizacao vis[] = new Visualizacao[5];
       vis[0] = new Visualizacao(g[1],v[0]);
       vis[0].avaliar();
       System.out.println(vis[0].toString());
       vis[1] = new Visualizacao(g[1],v[2]);
       vis[0].avaliar(90);
        System.out.println(vis[1].toString());

    }
}
