package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somaArray(new int[]{1, 2, 3, 4, 5, 6});
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7);
    }
}
