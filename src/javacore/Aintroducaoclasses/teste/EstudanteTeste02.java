package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        // Vale ressaltar que ao definir o valor dos atributos diretamete na classe, todos os objetos criados terao o mesmo valor
        estudante.nome = "Luan";
        estudante.idade = 19;
        estudante.sexo = 'M';
        estudante2.nome = "Dominic";
        estudante2.idade = 18;
        estudante2.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("---------------------");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
