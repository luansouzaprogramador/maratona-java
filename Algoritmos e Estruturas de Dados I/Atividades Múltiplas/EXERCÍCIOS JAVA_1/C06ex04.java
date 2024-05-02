/*
import java.util.Scanner;

public class C06ex04 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, situacaoCorporal;
		double altura, peso, imc;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("C�lculo de IMC");
		System.out.print("Informe seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Informe sua altura, em metros: ");
		altura = teclado.nextDouble();
		System.out.print("Informe seu peso, em kg: ");
		peso = teclado.nextDouble();
		imc = peso/Math.pow(altura,2);
		
		if (imc < 18) {
			situacaoCorporal = "est� desnutrido(a).";
		} else if (imc < 20) {
			situacaoCorporal = "est� abaixo do peso.";
		} else if (imc <= 25) {
			situacaoCorporal = "est� no peso ideal.";
		} else if (imc <= 27) {
			situacaoCorporal = "est� acima do peso.";
		} else {
			situacaoCorporal = "est� obeso(a).";
		}
		
		System.out.println("\n"+nome+", voc� "+situacaoCorporal);
		teclado.close();
	}
}
*/

import javax.swing.JOptionPane;

public class C06ex04 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String nome, alturaStr, pesoStr, situacaoCorporal;
		double altura, peso, imc;
		
		nome = JOptionPane.showInputDialog(null, "Informe seu nome:", "C�lculo de IMC", JOptionPane.QUESTION_MESSAGE);
		alturaStr = JOptionPane.showInputDialog(null, "Informe sua altura, em metros:", "C�lculo de IMC", JOptionPane.QUESTION_MESSAGE);
		altura = Double.valueOf(alturaStr);
		pesoStr = JOptionPane.showInputDialog(null, "Informe seu peso, em kg:", "C�lculo de IMC", JOptionPane.QUESTION_MESSAGE);
		peso = Double.valueOf(pesoStr);
		
		imc = peso/Math.pow(altura,2);
		
		if (imc < 18) {
			situacaoCorporal = "est� desnutrido(a).";
		} else if (imc < 20) {
			situacaoCorporal = "est� abaixo do peso.";
		} else if (imc <= 25) {
			situacaoCorporal = "est� no peso ideal.";
		} else if (imc <= 27) {
			situacaoCorporal = "est� acima do peso.";
		} else {
			situacaoCorporal = "est� obeso(a).";
		}
		
		JOptionPane.showMessageDialog(null, nome+", voc� "+situacaoCorporal, "C�lculo de IMC", JOptionPane.INFORMATION_MESSAGE);
	}
}