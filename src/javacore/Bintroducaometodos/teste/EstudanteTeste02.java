package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Luan";
        estudante1.idade = 19;
        estudante1.sexo = 'M';

        estudante2.nome = "Dominic";
        estudante2.idade = 18;
        estudante2.sexo = 'M';

        estudante1.imprime();
        estudante2.imprime();
    }
}
