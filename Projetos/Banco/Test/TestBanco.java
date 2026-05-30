package Projetos.Banco.Test;

import Projetos.Banco.Boleto;
import Projetos.Banco.Cartao;
import Projetos.Banco.PIx;
import Projetos.Banco.Pagamento;

public class TestBanco {
    public static void main(String[] args) {
        Pagamento pagamento = new Cartao(2000,"20/02/2020","Credito");
        Pagamento pagamento1 = new PIx(3000,"20/02/2020");
        Pagamento pagamento2 = new Boleto(4000,"20/02/2020");

        System.out.println(pagamento);
        pagamento.processarPagamento();
        System.out.println("-----------------------------");
        System.out.println(pagamento2);
        pagamento2.processarPagamento();
        System.out.println("-----------------------------");
        System.out.println(pagamento1);
        pagamento1.processarPagamento();
    }
}
