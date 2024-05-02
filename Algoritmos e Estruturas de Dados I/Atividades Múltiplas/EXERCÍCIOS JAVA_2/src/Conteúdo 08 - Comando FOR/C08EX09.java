/*
import java.util.Scanner;

public class C08EX09 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, sexo="";
		int quantPessoas, idade=0, somaM=0, somaF=0, homens=0, mulheres=0;
		double mediaM, mediaF;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe a quantidades de pessoas entrevistadas: ");
		quantPessoas = teclado.nextInt();
		if (!(quantPessoas<0)) {
			teclado.nextLine();
			
			for (int i=1; i<=quantPessoas; i++) {
				System.out.println("\n"+i+"� pessoa");
				System.out.print("Informe o nome: ");
				nome = teclado.nextLine();
				System.out.print("Informe a idade: ");
				idade = teclado.nextInt();
				
				if (idade<0) {
					System.out.println("\nValor inv�lido!");
					break;
				}
				
				teclado.nextLine();
				System.out.print("Informe o sexo (M/F): ");
				sexo = teclado.nextLine();
				if (!(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F"))) {
					System.out.println("\nValor inv�lido!");
					break;
				}
				if (sexo.equalsIgnoreCase("M")) {
					somaM += idade;
					homens++;
				}
				if (sexo.equalsIgnoreCase("F")) {
					somaF += idade;
					mulheres++;
				}
			}
			
			if (!(idade<0) && (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F"))) {
				mediaM = (float) somaM/homens;
				mediaF = (float) somaF/mulheres;
				
				System.out.printf("\nM�dia das idades dos homens = %1.1f", mediaM);
				System.out.printf("\nM�dia das idades das mulheres = %1.1f", mediaF);
			}
		}
		else
			System.out.println("\nValor inv�lido!");
		
		teclado.close();
	}
}
*/

import javax.swing.JOptionPane;

public class C08EX09 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, sexo="", quantPessoasStr, idadeStr;
		int quantPessoas, idade=0, somaM=0, somaF=0, homens=0, mulheres=0;
		double mediaM, mediaF;
		
		quantPessoasStr = JOptionPane.showInputDialog(null, "Informe a quantidades de pessoas entrevistadas:", "Pesquisa", JOptionPane.QUESTION_MESSAGE);
		quantPessoas = Integer.valueOf(quantPessoasStr);
		
		if (!(quantPessoas<0)) {
			for (int i=1; i<=quantPessoas; i++) {
				nome = JOptionPane.showInputDialog(null, "Informe o nome:", i+"� pessoa", JOptionPane.QUESTION_MESSAGE);
				idadeStr = JOptionPane.showInputDialog(null, "Informe a idade:", i+"� pessoa", JOptionPane.QUESTION_MESSAGE);
				idade = Integer.valueOf(idadeStr);
				
				if (idade<0) {
					JOptionPane.showMessageDialog(null, "Valor inv�lido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				
				sexo = JOptionPane.showInputDialog(null, "Informe o sexo (M/F):", i+"� pessoa", JOptionPane.QUESTION_MESSAGE);
				
				if (!(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F"))) {
					JOptionPane.showMessageDialog(null, "Valor inv�lido", "ERRO", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				if (sexo.equalsIgnoreCase("M")) {
					somaM += idade;
					homens++;
				}
				if (sexo.equalsIgnoreCase("F")) {
					somaF += idade;
					mulheres++;
				}
			}
			
			if (!(idade<0) && (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F"))) {
				mediaM = (float) somaM/homens;
				mediaF = (float) somaF/mulheres;
				JOptionPane.showMessageDialog(null, String.format("M�dia das idades dos homens = %1.1f"+
						"\n\nM�dia das idades das mulheres = %1.1f", mediaM, mediaF),
						"Resultado da Pesquisa", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else
			JOptionPane.showMessageDialog(null, "Valor inv�lido", "ERRO", JOptionPane.INFORMATION_MESSAGE);
	}
}