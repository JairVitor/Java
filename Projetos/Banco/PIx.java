package Projetos.Banco;

public class PIx extends Pagamento {
    public PIx(double valor, String vencimento) {
        super(valor, vencimento);
    }

    @Override
    public String processarPagamento() {
        System.out.println("O valor do seu pagamento sera de " + valor );
        return "";
    }
}
