package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.divideDoisNumeros(30, 2));
        System.out.println(calculadora.divideDoisNumeros2(30, 3));
        System.out.println(calculadora.divideDoisNumeros3(30, 5));
        calculadora.imprimeDivisaoDeDoisNumeros(30, 6);
        calculadora.imprimeDivisaoDeDoisNumeros(30, 0);
        calculadora.imprimeDivisaoDeDoisNumeros2(40, 0);
    }
}
