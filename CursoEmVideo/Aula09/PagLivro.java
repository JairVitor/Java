package CursoEmVideo.Aula09;

public class PagLivro {
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];

       p[0] = new Pessoa("Pedro",17, "M");
       p[1] = new Pessoa("Clara", 16, "F");

       l[0] = new Livro("Catecismo da igreja catolica","CNBB",783,p[0]);
       l[1] = new Livro("A culpa e das estrelas","John Green",288, p[1]);
       l[2] = new Livro("A volta ao mundo em 80 dias","Julio Verne",300, p[0]);

        l[0].abrir();
        l[0].fechar();
        System.out.println(l[0].detalhes());


    }
}
