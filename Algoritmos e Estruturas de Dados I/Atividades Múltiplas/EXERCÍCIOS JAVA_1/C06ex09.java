/*
import java.util.Scanner;

public class C06ex09 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, sexo;
		double altura, pesoIdeal;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Informe seu sexo (M/F): ");
		sexo = teclado.nextLine();
		
		if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
			System.out.print("Informe sua altura, em metros: ");
			altura = teclado.nextDouble();
			if (sexo.equalsIgnoreCase("M")) {
				pesoIdeal = 72.7*altura-58;
			} else {
				pesoIdeal = 62.1*altura-44.7;
			}
			System.out.printf("\n%s, seu peso ideal � de %1.2f kg.", nome, pesoIdeal);
		} else {
			System.out.println("\nOp��o Inv�lida!");
		}
		
		teclado.close();
	}
}
*/

import javax.swing.JOptionPane;

public class C06ex09 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, sexo, alturaStr;
		double altura, pesoIdeal;
		
		nome = JOptionPane.showInputDialog(null, "Informe seu nome:", "Informa��es Pessoais", JOptionPane.QUESTION_MESSAGE);
		sexo = JOptionPane.showInputDialog(null, "Informe seu sexo (M/F):", "Informa��es Pessoais", JOptionPane.QUESTION_MESSAGE);
		
		if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
			alturaStr = JOptionPane.showInputDialog(null, "Informe sua altura, em metros:", "Informa��es Pessoais", JOptionPane.QUESTION_MESSAGE);
			altura = Double.valueOf(alturaStr);
			if (sexo.equalsIgnoreCase("M")) {
				pesoIdeal = 72.7*altura-58;
			} else {
				pesoIdeal = 62.1*altura-44.7;
			}
			JOptionPane.showMessageDialog(null, String.format("%s, seu peso ideal � de %1.2f kg.", nome, pesoIdeal), "Resultado", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Op��o Inv�lida!", "Erro", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}