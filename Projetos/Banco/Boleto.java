package Projetos.Banco;

public class Boleto extends Pagamento {
    public  final  double TAXA_PAGAMENTO = 0.02;
    public Boleto(double valor, String vencimento) {
        super(valor, vencimento);
    }

    @Override
    public String processarPagamento() {
        double valorFinal;
        valorFinal = valor * TAXA_PAGAMENTO;
        System.out.println("O valor do seu pagamento era de " + valor + " e tera uma taxa de " + valorFinal);
        valorFinal += valor;
        System.out.println("O valor a ser cobrado com a taxa sera de " + valorFinal);
        return "";
    }
}
