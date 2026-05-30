package Projetos.Empresa;

public class Desenvolvedor extends Funcionarios{
    public static final double BONUS_SALARIO = 0.10;
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public void trabalhar(){
        System.out.println("Programando..");
    }
    @Override
    public double calcularBonus(){
        System.out.println("Calculado o bonus...");
        return this.salario * BONUS_SALARIO;
    }
}
