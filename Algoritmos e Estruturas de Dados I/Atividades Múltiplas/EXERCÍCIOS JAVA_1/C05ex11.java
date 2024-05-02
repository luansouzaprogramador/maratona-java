/*
import java.util.Scanner;

public class C05ex11 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		long numeroCheque;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o n�mero do cheque: ");
		numeroCheque = teclado.nextLong();
		System.out.println("\nInforma��es Banc�rias");
		System.out.println("Banco      = "+numeroCheque/1000000);
		System.out.println("Ag�ncia    = "+numeroCheque%1000000/1000);
		System.out.println("Sequencial = "+numeroCheque%1000);
	}
}
*/

import javax.swing.JOptionPane;

public class C05ex11 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String numeroChequeStr;
		int numeroCheque, banco, agencia, sequencial;
		
		numeroChequeStr = JOptionPane.showInputDialog(null, "Informe o n�mero do cheque:", "Cheque Banc�rio", JOptionPane.QUESTION_MESSAGE);
		numeroCheque = Integer.valueOf(numeroChequeStr);
		
		banco = numeroCheque/1000000;
		agencia = numeroCheque%1000000/1000;
		sequencial = numeroCheque%1000;
		
		JOptionPane.showMessageDialog(null, "Banco          =  "+banco+"\nAg�ncia       =  "+agencia+"\nSequencial =  "+sequencial, "Informa��es Banc�rias", JOptionPane.INFORMATION_MESSAGE);
	}
}