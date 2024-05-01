package introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * /
        int n1;
        int n2;
        double resultado;
        n1 = 10;
        n2 = 20;
        resultado = n1/(double)n2; // o resultado da divisao entre dois numeros inteiros eh inteiro

        System.out.println(resultado);

        // Observacao: comportamento do sinal de soma entre valores numericos e Strings
        System.out.println(n1+n2+" Valor "+n1+n2);
    }
}
