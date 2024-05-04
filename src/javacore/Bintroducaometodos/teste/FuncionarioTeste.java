package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Luan");
        funcionario.setIdade(19);
        funcionario.setSalarios(new double[]{380, 1400, 2000});
        funcionario.imprime();

        System.out.println(funcionario.getMediaSalarios());
    }
}
