package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        /*
        Temos uma variavel de referencia do tipo Estudante e um objeto do tipo Estudante
        A variavel de referencia faz referencia a um objeto
        O objeto eh criado por meio da palavra "new"
        Os atributos dentro da classe sao acessados atraves do nome da variavel de referencia (estudante)
         */
        Estudante estudante = new Estudante();
        estudante.nome = "Luan";
        estudante.idade = 19;
        estudante.sexo = 'M';

        System.out.println(estudante);
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
