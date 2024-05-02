/*
import java.util.Scanner;

public class C08EX06 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int numero, somaDivisiveisPor4=0, quantDivisiveisPor3=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe abaixo 10 n�meros inteiros.\n");
		for (int i=1; i<=10; i++) {
			System.out.print("Digite o "+i+"� n�mero: ");
			numero = teclado.nextInt();
			if (numero%2 == 0)
				System.out.println("O n�mero informado � PAR.");
			else
				System.out.println("O n�mero informado � �MPAR.");
			System.out.println();
			
			if (numero%4 == 0)
				somaDivisiveisPor4 += numero;
			if (numero%3 == 0)
				quantDivisiveisPor3 +=1;
		}
		
		System.out.println("\nSoma dos n�meros divis�veis por 4 = "+somaDivisiveisPor4);
		System.out.println("Quantidade de n�meros divis�veis por 3 = "+quantDivisiveisPor3);
		teclado.close();
	}
}
*/

import javax.swing.JOptionPane;

public class C08EX06 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String numeroStr;
		int numero, somaDivisiveisPor4=0, quantDivisiveisPor3=0;
		
		JOptionPane.showMessageDialog(null, "Informe a seguir 10 n�meros inteiros.", "Programa", JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=1; i<=10; i++) {
			numeroStr = JOptionPane.showInputDialog(null, "Digite o "+i+"� n�mero:", "Programa", JOptionPane.QUESTION_MESSAGE);
			numero = Integer.valueOf(numeroStr);
			
			if (numero%2 == 0)
				JOptionPane.showMessageDialog(null, "O n�mero informado � PAR.", "Programa", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "O n�mero informado � �MPAR.", "Programa", JOptionPane.INFORMATION_MESSAGE);
			
			if (numero%4 == 0)
				somaDivisiveisPor4 += numero;
			if (numero%3 == 0)
				quantDivisiveisPor3 +=1;
		}
		
		JOptionPane.showMessageDialog(null, "Soma dos n�meros divis�veis por 4 = "+somaDivisiveisPor4+"\n\nQuantidade de n�meros divis�veis por 3 = "+quantDivisiveisPor3, "Programa", JOptionPane.INFORMATION_MESSAGE);
	}
}