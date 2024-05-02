/*
import java.util.Scanner;

public class C06ex12 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		int quantBolas, quantBolasDefeito, quantMeses, quantCaixas, quantGalpao;
		double precoCaixa, valorAluguel, custoTotal, custoEmbalagem, custoEstocagem;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Sobre a produ��o de bolas de futebol, informe o que se pede.");
		System.out.print("\nQuantidade de bolas produzidas pela f�brica: ");
		quantBolas = teclado.nextInt();
		System.out.print("Quantidade de bolas com defeito e que ser�o descartadas: ");
		quantBolasDefeito = teclado.nextInt();
		System.out.print("Pre�o unit�rio das caixas de papel�o: ");
		precoCaixa = teclado.nextDouble();
		System.out.print("Quantidade de meses at� a Copa: ");
		quantMeses = teclado.nextInt();
		System.out.print("Valor mensal do aluguel: ");
		valorAluguel = teclado.nextDouble();
		
		quantCaixas = (quantBolas-quantBolasDefeito)/10;
		if ((quantBolas-quantBolasDefeito)%10 != 0) {
			quantCaixas++;
		}
		
		quantGalpao = quantCaixas/850;
		if (quantCaixas%850 != 0) {
			quantGalpao++;
		}
		
		custoEmbalagem = precoCaixa*quantCaixas;
		custoEstocagem = quantGalpao*valorAluguel*quantMeses;
		custoTotal = custoEmbalagem + custoEstocagem;
		
		System.out.println("------------------------------------------------------------------------");
		System.out.printf("Custo de Embalagem:    R$%1.2f\nCusto de Estoque:      R$%1.2f\nCusto Total:           R$%1.2f", custoEmbalagem, custoEstocagem, custoTotal);
		teclado.close();
	}
}
*/

import javax.swing.JOptionPane;

public class C06ex12 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String quantBolasStr, quantBolasDefeitoStr, precoCaixaStr, quantMesesStr, valorAluguelStr;
		int quantBolas, quantBolasDefeito, quantMeses, quantCaixas, quantGalpao;
		double precoCaixa, valorAluguel, custoTotal, custoEmbalagem, custoEstocagem;
		
		JOptionPane.showMessageDialog(null, "Sobre a produ��o de bolas de futebol, informe o que se pede a seguir.", "Ind�stria produtora de bolas de futebol", JOptionPane.INFORMATION_MESSAGE);
		
		quantBolasStr = JOptionPane.showInputDialog(null, "Quantidade de bolas produzidas pela f�brica:", "Ind�stria produtora de bolas de futebol", JOptionPane.QUESTION_MESSAGE);
		quantBolasDefeitoStr = JOptionPane.showInputDialog(null, "Quantidade de bolas com defeito e que ser�o descartadas:", "Ind�stria produtora de bolas de futebol", JOptionPane.QUESTION_MESSAGE);
		precoCaixaStr = JOptionPane.showInputDialog(null, "Pre�o unit�rio das caixas de papel�o:", "Ind�stria produtora de bolas de futebol", JOptionPane.QUESTION_MESSAGE);
		quantMesesStr = JOptionPane.showInputDialog(null, "Quantidade de meses at� a Copa:", "Ind�stria produtora de bolas de futebol", JOptionPane.QUESTION_MESSAGE);
		valorAluguelStr = JOptionPane.showInputDialog(null, "Valor mensal do aluguel:", "Ind�stria produtora de bolas de futebol", JOptionPane.QUESTION_MESSAGE);
		
		quantBolas = Integer.valueOf(quantBolasStr);
		quantBolasDefeito = Integer.valueOf(quantBolasDefeitoStr);
		precoCaixa = Double.valueOf(precoCaixaStr);
		quantMeses = Integer.valueOf(quantMesesStr);
		valorAluguel = Double.valueOf(valorAluguelStr);
		
		quantCaixas = (quantBolas-quantBolasDefeito)/10;
		if ((quantBolas-quantBolasDefeito)%10 != 0) {
			quantCaixas++;
		}
		
		quantGalpao = quantCaixas/850;
		if (quantCaixas%850 != 0) {
			quantGalpao++;
		}
		
		custoEmbalagem = precoCaixa*quantCaixas;
		custoEstocagem = quantGalpao*valorAluguel*quantMeses;
		custoTotal = custoEmbalagem + custoEstocagem;
		JOptionPane.showMessageDialog(null, String.format("Custo de Embalagem:    R$%1.2f\nCusto de Estoque:           R$%1.2f\nCusto Total:                       R$%1.2f", custoEmbalagem, custoEstocagem, custoTotal), "Ind�stria produtora de bolas de futebol", JOptionPane.INFORMATION_MESSAGE);
	}
}