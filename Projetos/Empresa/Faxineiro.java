package Projetos.Empresa;

public class Faxineiro extends Funcionarios{
    public static final double BONUS_SALARIO = 0.05;
    public Faxineiro(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public void trabalhar(){
        System.out.println("Lipando...");
    }
    @Override
    public double calcularBonus(){
        System.out.println("Calculado o bonus...");
        return this.salario * BONUS_SALARIO;
    }
}
