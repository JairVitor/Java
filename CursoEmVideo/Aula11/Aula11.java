package CursoEmVideo.Aula11;

public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Marcos");
        v1.setSexo("M");
        v1.setIdade(35);
        System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("Jair");
        a1.setIdade(20);
        a1.setSexo("M");
        a1.setCurso("ADS");
        a1.setMatricula(91803070);
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(121212);
        b1.setNome("Joao");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
}
