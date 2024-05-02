package introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // A base, ou seja, a primeira parte de um array multidimensional, precisa, obrigatoriamente, ter um tamanho definido
        // A base do array, que eh um array, faz referencia a outro array
        // Ou seja, a base de um array multidimensional contem enderecos de memoria

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;

        for (int i=0; i<dias.length; i++) {
            System.out.println(dias[i]);                    // imprime 3 enderecos de memoria
        }

        for (int i=0; i<dias.length; i++) {
            for (int j=0; j<dias[i].length; j++) {
                System.out.println(dias[i][j]);             // imprime 9 numeros inteiros
            }
        }

        System.out.println("--------------------------");
        for (int[] arrayBase: dias) {
            for (int dia: arrayBase) {
                System.out.println(dia);
            }
        }

        /*
        int[][][] numeros = new int[2][2][2];

        for (int i=0; i<numeros.length; i++) {
            System.out.println(numeros[i]);                 // imprime 2 enderecos de memoria
        }

        for (int i=0; i<numeros.length; i++) {
            for (int j=0; j<numeros[i].length; j++) {
                System.out.println(numeros[i][j]);          // imprime 4 enderecos de memoria
            }
        }

        for (int i=0; i<numeros.length; i++) {
            for (int j=0; j<numeros[i].length; j++) {
                for (int k=0; k<numeros[i][j].length; k++) {
                    System.out.println(numeros[i][j][k]);   // imprime 8 numeros inteiros
                }
            }
        }
         */
    }
}
