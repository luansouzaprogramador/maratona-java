import java.util.Scanner;

public class CalculaFatorial {
	// Fun��o: Calcular o fatorial de um n�mero
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		long numero, fatorial;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		numero = teclado.nextLong();
		fatorial = 1L;
		
		for (long contador = 2; contador <= numero; contador++) {
			fatorial = fatorial*contador;
		}
		System.out.print("O fatorial de " + numero + " � igual a " + fatorial);
		teclado.close();
	}
}