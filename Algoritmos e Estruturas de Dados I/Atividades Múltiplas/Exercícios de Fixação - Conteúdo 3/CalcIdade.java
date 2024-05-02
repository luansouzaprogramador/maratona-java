import java.util.Scanner;

public class CalcIdade {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int anoAtual, anoNascimento, idade;
		String nome;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite o ano em que voce nasceu: ");
		anoNascimento = teclado.nextInt();
		System.out.print("Digite o ano em que estamos: ");
		anoAtual = teclado.nextInt();
		idade = anoAtual-anoNascimento;
		System.out.print(nome+", voce tem/tera "+idade+" anos em "+anoAtual);
		teclado.close();
	}
}