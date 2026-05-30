package CursoEmVideo.Aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumeroDaConta(00001);
        p1.setNomeDono("Jubileu");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumeroDaConta(00002);
        p2.setNomeDono("Creuza");
        p2.abrirConta("CP");

        p1.depositar(300);
        p2.depositar(500);

        p2.sacar(100);

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
