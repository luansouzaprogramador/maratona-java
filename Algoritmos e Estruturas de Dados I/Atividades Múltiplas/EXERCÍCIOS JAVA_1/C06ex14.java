/*
import java.util.Scanner;

public class C06ex14 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um n�mero inteiro de 4 algarismos: ");
		numero = teclado.nextInt();
		System.out.println();
		
		if (numero/1000 >= 1 && numero/1000 < 10) {
			System.out.println("O n�mero "+numero+" de tr�s para frente � "+numero%10+numero%100/10+numero%1000/10/10+numero/1000+".");
		} else {
			System.out.println("O n�mero informado deve ter 4 d�gitos.");
		}
	}
}
*/

import javax.swing.JOptionPane;

public class C06ex14 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String numeroStr;
		int numero;
		
		numeroStr = JOptionPane.showInputDialog(null, "Informe um n�mero inteiro de 4 algarismos:", "Preencha o campo abaixo", JOptionPane.QUESTION_MESSAGE);
		numero = Integer.valueOf(numeroStr);
		
		if (numero/1000 >= 1 && numero/1000 < 10) {
			JOptionPane.showMessageDialog(null, "O n�mero "+numero+" de tr�s para frente � "+numero%10+numero%100/10+numero%1000/10/10+numero/1000+".", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero informado deve ter 4 d�gitos.", "Erro", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}