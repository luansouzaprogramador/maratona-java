/*
import java.util.Scanner;

public class C06ex01 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double x, y;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seja a fun��o afim determinada por:");
		System.out.println("\nf(x) = (5x+3)/(16-x^2)^(1/2), se x < 4");
		System.out.println("f(x) = 0, se x = 4");
		System.out.println("f(x) = (5x+3)/(x^2-16)^(1/2), se x > 4");
		
		System.out.print("\nInforme o valor de x e obtenha o y correspondente: ");
		x = teclado.nextDouble();
		
		if (x<4) {
			y = (5*x+3)/Math.sqrt(16-Math.pow(x,2));
		} else if (x == 4) {
			y = 0;
		} else {
			y = (5*x+3)/Math.sqrt(Math.pow(x,2)-16);
		}
		
		System.out.printf("O valor de f(%s) = %1.2f", x, y);
		teclado.close();
	}
}
*/

import javax.swing.JOptionPane;

public class C06ex01 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String xStr;
		double x, y;
		
		JOptionPane.showMessageDialog(null, "Seja a fun��o afim determinada por:\n\nf(x) = (5x+3)/(16-x^2)^(1/2), se x < 4\nf(x) = 0, se x = 4\nf(x) = (5x+3)/(x^2-16)^(1/2), se x > 4", "Fun��o", JOptionPane.INFORMATION_MESSAGE);
		xStr = JOptionPane.showInputDialog(null, "Informe o valor de x e obtenha o y correspondente:", "Fun��o", JOptionPane.QUESTION_MESSAGE);
		x = Double.valueOf(xStr);
		
		if (x<4) {
			y = (5*x+3)/Math.sqrt(16-Math.pow(x,2));
		} else if (x == 4) {
			y = 0;
		} else {
			y = (5*x+3)/Math.sqrt(Math.pow(x,2)-16);
		}
		
		JOptionPane.showMessageDialog(null, String.format("O valor de f("+x+") = %.2f",y), "Fun��o", JOptionPane.QUESTION_MESSAGE);
	}
}