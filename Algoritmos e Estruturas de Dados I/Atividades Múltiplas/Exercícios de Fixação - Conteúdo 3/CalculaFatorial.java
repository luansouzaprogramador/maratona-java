import java.util.Scanner;

public class CalculaFatorial {
	// Função: Calcular o fatorial de um número
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		long numero = teclado.nextLong();
		long fatorial = 1L;
		for (long contador = 2; contador <= numero; contador++) {
			fatorial = fatorial*contador;
		}
		System.out.print("O fatorial de " + numero + " e igual a " + fatorial);
		teclado.close();
	}
}