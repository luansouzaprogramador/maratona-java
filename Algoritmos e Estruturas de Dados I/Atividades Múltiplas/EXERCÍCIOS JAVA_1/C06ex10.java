import java.util.Scanner;

public class C06ex10 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double capitalAplicado, taxaDiaria, rendimento, impostoRenda, valorResgatado;
		int numeroDias;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Sobre sua aplica��o financeira, informe o que se pede.");
		System.out.print("\nQual � o capital aplicado: R$");
		capitalAplicado = teclado.nextDouble();
		System.out.print("Informe o n�mero de dias que o dinheiro ficou aplicado: ");
		numeroDias = teclado.nextInt();
		System.out.print("Digite a taxa de rendimento di�ria: ");
		taxaDiaria = teclado.nextDouble();
		
		rendimento = capitalAplicado*(taxaDiaria/100)*numeroDias;
		impostoRenda = 0.15*rendimento;
		valorResgatado = capitalAplicado + rendimento - impostoRenda - 10;
		
		System.out.print("\n\nO rendimento sobre o capital de R$"+capitalAplicado+", aplicado a uma taxa di�ria de "+taxaDiaria+"% por um per�odo de "+numeroDias+" dias, � de R$"+rendimento);
		System.out.printf("\nValor a ser pago de Imposto de Renda: R$%1.2f",impostoRenda);
		System.out.printf("\nQuantia a ser resgatada: R$%1.2f",valorResgatado);
		teclado.close();
	}
}