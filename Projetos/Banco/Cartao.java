package Projetos.Banco;

public class Cartao extends Pagamento{
    public String debitoCredito;
    public final double TAXA_PAGAMENTO = 0.05;
    public Cartao(double valor, String vencimento, String debitoCredito) {
        super(valor, vencimento);
        this.debitoCredito = debitoCredito;
    }

    @Override
    public String processarPagamento() {
        if (debitoCredito.equalsIgnoreCase("Debito")){
            System.out.println("Pagamento em Debito aprovado");
        }else {
            System.out.println("Pagamento em Credito aprovado");
            double valorFinal;
            valorFinal = valor * TAXA_PAGAMENTO;
            System.out.println("O valor do pagamento era de " + valor + " e sera cobrado uma taxa de " + valorFinal);
            valorFinal += valor;
            System.out.println("E agora com as taxas por ter sido efetuado o pagamento no credito ficara de " + valorFinal);
        }
        return "";
    }
}
