import javax.swing.JOptionPane;

public class C09EX04 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String termosStr;
		int termos;
		double numerador, denominador, serie=0;
		
		termosStr = JOptionPane.showInputDialog(null, "Informe a quantidade de termos:", "S�RIES Matem�ticas", JOptionPane.QUESTION_MESSAGE);
		termos = Integer.valueOf(termosStr);
		
		for (int aux=1; aux<=termos; aux++) {
			numerador = (4*aux-3)*(4*aux-2);
			denominador = (4*aux-1)*(4*aux);
			serie += numerador/denominador;
		}
		
		serie = Math.sqrt(serie);
		JOptionPane.showMessageDialog(null, String.format("Valor da S�rie = %.4f", serie), "S�RIES Matem�ticas", JOptionPane.INFORMATION_MESSAGE);
	}
}