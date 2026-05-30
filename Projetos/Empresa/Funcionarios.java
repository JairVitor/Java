package Projetos.Empresa;

public abstract class Funcionarios {
    private String nome;
    protected double salario;

    public void trabalhar(){

    }
    public double calcularBonus(){
        return 0;
    }

    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
