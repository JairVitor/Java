package Projetos.Empresa.Test;

import Projetos.Empresa.Desenvolvedor;
import Projetos.Empresa.Faxineiro;
import Projetos.Empresa.Funcionarios;
import Projetos.Empresa.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {
       Funcionarios[] funcionario = new Funcionarios[3];
       funcionario[0] = new Gerente("Lisbon",15000);
       funcionario[1] = new Desenvolvedor(" Cho",10000);
       funcionario[2] = new Faxineiro("Rhigbi",2000);

       for (Funcionarios funcionarios : funcionario){
           System.out.println(funcionarios);

           funcionarios.trabalhar();
           System.out.println(funcionarios.calcularBonus());



           System.out.println("--------------------");
       }
    }
}
