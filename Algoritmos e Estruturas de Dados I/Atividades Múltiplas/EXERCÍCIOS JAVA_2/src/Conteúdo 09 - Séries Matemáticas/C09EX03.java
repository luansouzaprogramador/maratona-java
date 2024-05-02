import javax.swing.JOptionPane;

public class C09EX03 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String termosStr;
		int termos;
		double numerador, denominador, serie=0;
		
		termosStr = JOptionPane.showInputDialog(null, "Informe a quantidade de termos:", "S�RIES Matem�ticas", JOptionPane.QUESTION_MESSAGE);
		termos = Integer.valueOf(termosStr);
		
		for (int aux=1; aux<=termos; aux++) {
			numerador = 1 + Math.sqrt(4*aux);
			denominador = 3*aux;
			serie += numerador/denominador;
		}
		JOptionPane.showMessageDialog(null, String.format("Valor da S�rie = %.4f", serie), "S�RIES Matem�ticas", JOptionPane.INFORMATION_MESSAGE);
	}
}