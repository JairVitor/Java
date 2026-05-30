package CursoEmVideo.ProjetoAula14;

public class gafanhotos extends Pessoa{
    private String login;
    private int totalAsssistido;

    public void viuMaisUm(){

    }

    public gafanhotos(String nome, int idade, String sexo, String login){
        super(nome, sexo, idade);
        this.login = login;
        this.totalAsssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAsssistido() {
        return totalAsssistido;
    }

    public void setTotalAsssistido(int totalAsssistido) {
        this.totalAsssistido = totalAsssistido;
    }

    @Override
    public String toString() {
        return "gafanhotos{" + super.toString()+
                "\nlogin='" + login + '\'' +
                ", totalAsssistido=" + totalAsssistido +
                '}';
    }
}
