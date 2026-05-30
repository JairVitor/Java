package CursoEmVideo.Aula09;

public class Livro implements Publicacao {
    private String titulo, autor;
    private int paginaAtual, totalPagina, ultimaPagLida, tempoLeitura;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes(){
        return "Livro: " + titulo +
                "\n Autor: " + autor +
                "\n TotPaginas: " + totalPagina +
                "\n PagAtual: " + paginaAtual +
                "\n Aberto: " + (aberto ? "Sim" : "Não") +
                "\n Leitor: " + (leitor != null ? leitor.getNome() : "Sem leitor") +
                "\n Ultima pagina lida: " + ultimaPagLida +
                "\n Tempo de leitura: " + tempoLeitura + "mim";
    }

    @Override
    public String toString() {
        return detalhes();
    }

    public Livro(String titulo, String autor, int totalPagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPagina = totalPagina;
        this.aberto = false;
        this.paginaAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        if (aberto) {
            System.out.println("Feche o livro antes de trocar o leitor");
            return;
        }
        if (leitor != null){
            this.leitor = leitor;
        }else {
            System.out.println("Leitor invalido");
        }
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public int getTotalPagina() {
        return totalPagina;
    }

    public void setTotalPagina(int totalPagina) {
        this.totalPagina = totalPagina;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        if (paginaAtual >= 0 && paginaAtual <= totalPagina){
            this.paginaAtual = paginaAtual;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void abrir() {
        if (!aberto){
            aberto = true;
            System.out.println("O livro foi aberto");
        }else {
            System.out.println("O livro ja esta aberto, por tanto nao pode ser aberto seu animal");
        }
    }

    @Override
    public void fechar() {
        if (aberto){
            aberto = false;
            System.out.println("O livro agora esta fechado");
        }else {
            System.out.println("O livro ja esta fechado, por tanto nao pode ser fechado seu animal");
        }
    }

    @Override
    public void folhear(int p) {
        if (!aberto){
            System.out.println("Abra o livro primeiro");
            return;
        }
        if (p >= 0 && p <= totalPagina){
            this.ultimaPagLida = this.paginaAtual;
            this.paginaAtual = p;
            System.out.println("Voce foi para a pagina "+ paginaAtual);
        }else {
            System.out.println("Pagina invalida!");
        }
    }

    @Override
    public void avancarPag() {
        if (!aberto){
            System.out.println("Abra o livro primeiro");
            return;
        }
        if (this.totalPagina > this.paginaAtual) {
            this.ultimaPagLida = this.paginaAtual;
            this.setPaginaAtual(getPaginaAtual() + 1);
            System.out.println("Pagina avançada com sucesso!");
        } else {
            System.out.println("Voce nao pode mais avançar paginas voce chegou no final do livro");
        }
    }

    @Override
    public void voltarPag() {
        if (!aberto){
            System.out.println("Abra o livro primeiro");
            return;
        }
        if (this.paginaAtual > 1) {
            this.ultimaPagLida = this.paginaAtual;
            this.setPaginaAtual(getPaginaAtual() - 1);
            System.out.println("Pagina volta-da com sucesso");
        }else {
            System.out.println("Voce nao pode voltar mais paginas pois ja esta na primeiara pagina");
        }
    }
}
