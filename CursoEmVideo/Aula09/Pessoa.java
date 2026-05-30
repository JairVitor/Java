package CursoEmVideo.Aula09;


public class Pessoa {
    private String nome, sexo;
    private int idade;

    public void fazerAniver(){
        this.setIdade(getIdade() + 1);
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >=0)
            this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")){
            this.sexo = sexo.toUpperCase();
        }else {
            System.out.println("Sexo invalido! Use M ou F");
        }
    }
}
