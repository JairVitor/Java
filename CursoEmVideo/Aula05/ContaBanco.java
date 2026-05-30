package CursoEmVideo.Aula05;

public class ContaBanco {
    public int numeroDaConta;
    protected String tipo;
    private String nomeDono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("------------------------");
        System.out.println("Conta: " + this.getNumeroDaConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getNomeDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void abrirConta(String t){
       this.setTipo(t);
       this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        }else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Sua conta contem dinheiro.Saque para possibilitar o fechamento da conta.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Sua conta esta negativada.Pague o que esta devendo para poder fechar sua conta.");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!!");
        }
    }
    public void depositar(float v){
        if (status = true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta de " + this.getNomeDono());
        }else {
            System.out.println("Impossivel Depositar");
        }
    }
    public void sacar(float v){
        if (this.isStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Dinheiro sacado com sucesso na conta de " + this.getNomeDono());
            }else {
                System.out.println("Imposssivel sacar, saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar, conta fechada");
        }
    }
    public void pagamentoMensal(){
        int v;
        v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (getTipo() == "CP") {
            v = 20;
        }
        if (this.isStatus()){
           this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por: "+ getNomeDono());
        }else {
            System.out.println("Impossivel pagar");
        }
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int n) {
        this.numeroDaConta = n;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
