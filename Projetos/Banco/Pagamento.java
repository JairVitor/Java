package Projetos.Banco;

public abstract class Pagamento {
    protected double valor;
    protected String vencimento;

    public abstract String processarPagamento();

    public Pagamento(double valor, String vencimento) {
        this.valor = valor;
        this.vencimento = vencimento;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "valor=" + valor +
                ", vencimento='" + vencimento + '\'' +
                '}';
    }
}
