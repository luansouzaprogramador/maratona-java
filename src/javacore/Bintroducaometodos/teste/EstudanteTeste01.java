package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Luan";
        estudante1.idade = 19;
        estudante1.sexo = 'M';

        estudante2.nome = "Dominic";
        estudante2.idade = 18;
        estudante2.sexo = 'M';

        impressora.imprimeEstudante(estudante1);
        impressora.imprimeEstudante(estudante2);
    }
}
