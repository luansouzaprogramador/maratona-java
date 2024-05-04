package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        // Alta coesao          -> bom
        // Baixa coesao         -> ruim
        // Auto acoplamento     -> ruim
        // Baixo acoplamento    -> bom

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luan");
        pessoa.setIdade(19);
        pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
