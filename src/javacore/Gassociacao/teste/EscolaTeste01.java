package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Luciana");
        Professor professor2 = new Professor("Izabela");
        Professor professor3 = new Professor("Mara");
        Professor professor4 = new Professor("Jonathas");
        Professor professor5 = new Professor("Daldegan");
        Professor[] professores = {professor1, professor2, professor3, professor4, professor5};

        Escola universidade = new Escola("Centro Federal de Educacao Tecnologica de Minas Gerais");
        universidade.setProfessores(professores);

        universidade.imprime();
    }
}
