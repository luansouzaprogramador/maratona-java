// Autor: Luan Marcelino de Souza

import java.util.Scanner;
public class E01912B {
	public static void main(String[] args) {
		int cep, regiao, subRegiao, sufixo;
		String descricao = "", cpc;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe seu CEP com 8 algarismos: ");
		cep = teclado.nextInt();
		regiao = cep/10000000;
		subRegiao = cep%10000000/1000000;
		sufixo = cep%1000;
		
		if (cep>0 && cep<100000000) {
			switch (regiao) {
				case 0:
					descricao = "Grande São Paulo";
					break;
				case 1: case 2: case 3:
					descricao = "Sudeste";
					break;
				case 4: case 5:
					descricao = "Nordeste(BA, SE, PE, AL, PB, RN)";
					break;
				case 6:
					descricao = "Norte e Nordeste(CE, PI, MA)";
					break;
				case 7:
					descricao = "Centro-Oeste e DF";
					break;
				case 8: case 9:
					descricao = "Sul";
					break;
			}

			if (sufixo >= 990 && sufixo <= 998)
				cpc = "Sim";
			else
				cpc = "Não";

			System.out.println("\nRegião       = " + descricao);
			System.out.println("Sub-região   = " + subRegiao);
			System.out.println("CPC          = " + cpc);
		}
		else
			System.out.println("\nO CEP informado é inválido!");
		teclado.close();
	}
}