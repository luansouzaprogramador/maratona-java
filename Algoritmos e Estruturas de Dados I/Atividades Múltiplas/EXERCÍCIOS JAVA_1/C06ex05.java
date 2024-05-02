/*
import java.util.Scanner;

public class C06ex05 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int numero;
		String resultado;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um n�mero inteiro: ");
		numero = teclado.nextInt();
		System.out.println();
		
		if (numero%5==0 && numero%7==0) {
			resultado = " � ";
		} else {
			resultado = " n�o � ";
		}
		
		System.out.println(numero+resultado+"divis�vel por 5 e 7 simultaneamente.");
		teclado.close();
	}
}
*/

import javax.swing.JOptionPane;

public class C06ex05 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String numeroStr, resultado;
		int numero;
		
		numeroStr = JOptionPane.showInputDialog(null, "Informe um n�mero inteiro:", "Verificador", JOptionPane.QUESTION_MESSAGE);
		numero = Integer.valueOf(numeroStr);
		
		if (numero%5==0 && numero%7==0) {
			resultado = " � ";
		} else {
			resultado = " n�o � ";
		}
		
		JOptionPane.showMessageDialog(null, numero+resultado+"divis�vel por 5 e 7 simultaneamente.", "Verificador", JOptionPane.INFORMATION_MESSAGE);
	}
}