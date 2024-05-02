/*
import java.util.Scanner;

public class C08EX02 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		double notaFinal;
		int totalFaltas;
		
		for (int i=1; i<=50; i++) {
			System.out.print("Digite o nome do "+i+"� aluno: ");
			nome = teclado.nextLine();
			System.out.print("Digite a nota final de "+nome+": ");
			notaFinal = teclado.nextDouble();
			
			if (notaFinal<0) {
				System.out.println("Valor inv�lido!");
				break;
			}
			
			System.out.print("Digite o total de faltas de "+nome+": ");
			totalFaltas = teclado.nextInt();
			
			if (totalFaltas<0) {
				System.out.println("Valor inv�lido!");
				break;
			}
			
			if (notaFinal>=65 && totalFaltas<=16)
				System.out.println("Situa��o = Aprovado(a)\n");
			else
				System.out.println("Situa��o = Reprovado(a)\n");
			teclado.nextLine();
		}
		
		teclado.close();
	}
}
*/

import javax.swing.JOptionPane;

public class C08EX02 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, notaFinalStr, totalFaltasStr;
		double notaFinal;
		int totalFaltas;
		
		for (int i=1; i<=50; i++) {
			nome = JOptionPane.showInputDialog(null, "Digite o nome do "+i+"� aluno:", "Informa��es do Estudante", JOptionPane.QUESTION_MESSAGE);
			notaFinalStr = JOptionPane.showInputDialog(null, "Digite a nota final de "+nome+":", "Informa��es do Estudante", JOptionPane.QUESTION_MESSAGE);
			notaFinal = Double.valueOf(notaFinalStr);
			
			if (notaFinal<0) {
				JOptionPane.showMessageDialog(null, "Valor inv�lido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			totalFaltasStr = JOptionPane.showInputDialog(null, "Digite o total de faltas de "+nome+":", "Informa��es do Estudante", JOptionPane.QUESTION_MESSAGE);
			totalFaltas = Integer.valueOf(totalFaltasStr);
			
			if (totalFaltas<0) {
				JOptionPane.showMessageDialog(null, "Valor inv�lido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			if (notaFinal>=65 && totalFaltas<=16)
				JOptionPane.showMessageDialog(null, "APROVADO(A)", "Situa��o", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "REPROVADO(A)", "Situa��o", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}