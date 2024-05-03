package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Luciana";
        professor.idade = 40;
        professor.sexo = 'F';

        System.out.println("Nome: "+professor.nome+"\nIdade: "+professor.idade+"\nSexo: "+professor.sexo);
    }
}
