package introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{6, 7, 8, 9, 10};

        for (int i=0; i<numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        // foreach: versao simplificada do for quando nao precisamos acessar os indices
        // No exemplo abaixo, "numero" eh uma variavel de referencia que a cada iteracao vai pegando um novo espaco em memoria
        // Nesse caso, a cada iteracao a variavel numero recebe o valor de um elemento da coleção "numeros3"
        for (int numero:numeros3) {
            System.out.println(numero);
        }
    }
}
