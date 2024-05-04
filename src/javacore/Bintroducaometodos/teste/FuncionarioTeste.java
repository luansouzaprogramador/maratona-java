package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Luan";
        funcionario.idade = 19;
        funcionario.salarios = new double[]{380, 1400, 2000};

        funcionario.imprime();
    }
}
