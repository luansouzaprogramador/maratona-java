package introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] array = {1, 2, 3, 4, 5, 6};
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = array;

        for (int[] arrayBase: arrayInt) {
            for (int numero: arrayBase) {
                System.out.print(numero+" ");
            }
            System.out.println("\n------");
        }

        int[][] numeros = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int i=0; i<numeros.length; i++) {
            for (int j=0; j<numeros[i].length; j++) {
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println("\n------");
        }
    }
}
