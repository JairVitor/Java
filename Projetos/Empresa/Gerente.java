package Projetos.Empresa;

public class Gerente extends Funcionarios{
    public static final double BONUS_SALARIO = 0.20;
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public void trabalhar(){
        System.out.println("Gerenciando a empresa");
    }

    @Override
    public double calcularBonus(){
        System.out.println("Calculado o bonus...");
        return this.salario * BONUS_SALARIO;
    }
}
