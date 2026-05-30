package CursoEmVideo.Aula10;

public class ProjetoPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professsor p3 = new Professsor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p1.setSexo("M");
        p1.setIdade(17);

        p2.setNome("Maria");
        p2.setSexo("F");
        p2.setIdade(16);
        p2.setCurso("Informatica");

        p3.setNome("Felipe");
        p3.setSexo("M");
        p3.setIdade(26);
        p3.setSalario(2500.75f);

        p4.setNome("Fabiana");
        p4.setSexo("F");
        p4.setIdade(29);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
