import java.util.Scanner;
public class C07ex04 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o nome da equipe de futebol: ");
		nome = teclado.nextLine();
		System.out.println();
		switch (nome) {
			case "Am�rica": case "Atl�tico": case "Cruzeiro": case "Villa Nova":
				System.out.println("O time pertence �Minas Gerais.");
				break;
			case "Botafogo": case "Flamengo": case "Fluminense": case "Vasco":
				System.out.println("O time pertence ao Rio de Janeiro.");
				break;
			case "Corinthians": case "Palmeiras": case "Santos": case "S�o Paulo":
				System.out.println("O time pertence �S�o Paulo.");
				break;
			case "Gr�mio": case "Internacional": case "Juventude":
				System.out.println("O time pertence ao Rio Grande do Sul.");
				break;
			case "N�utico": case "Santa Cruz": case "Sport":
				System.out.println("O time pertence � Pernambuco.");
				break;
			default:
				System.out.println("Time Inv�lido!");
		}
		teclado.close();
	}
}