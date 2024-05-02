/*
import java.util.Scanner;

public class C05ex08 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double areaSetorCircular, valorAngulo, raio;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor da �rea do setor circular: ");
		areaSetorCircular = teclado.nextDouble();
		System.out.print("Informe o valor do �ngulo: ");
		valorAngulo = teclado.nextDouble();
		raio = Math.sqrt((360*areaSetorCircular)/(valorAngulo*Math.PI));
		System.out.printf("\nRAIO = %1.2f",raio);
	}
}
*/

import javax.swing.JOptionPane;

public class C05ex08 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String areaSetorCircularStr, valorAnguloStr;
		double areaSetorCircular, valorAngulo, raio;
		
		areaSetorCircularStr = JOptionPane.showInputDialog(null, "Informe o valor da �rea do setor circular:", "Setor Circular", JOptionPane.QUESTION_MESSAGE);
		valorAnguloStr = JOptionPane.showInputDialog(null, "Informe o valor do �ngulo:", "Setor Circular", JOptionPane.QUESTION_MESSAGE);
		
		areaSetorCircular = Double.valueOf(areaSetorCircularStr);
		valorAngulo = Double.valueOf(valorAnguloStr);
		raio = Math.sqrt((360*areaSetorCircular)/(valorAngulo*Math.PI));
		
		JOptionPane.showMessageDialog(null, String.format("RAIO = %1.2f", raio), "Setor Circular", JOptionPane.INFORMATION_MESSAGE);
	}
}