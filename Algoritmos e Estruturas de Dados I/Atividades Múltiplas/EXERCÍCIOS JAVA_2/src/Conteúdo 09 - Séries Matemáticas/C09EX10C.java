import javax.swing.JOptionPane;

public class C09EX10C {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double numerador, denominador, serie=0;
		
		for (int aux=1; aux<=100; aux++) {
			numerador = 2*aux - 1;
			denominador = 2*aux;
			serie += numerador/denominador;
		}
		
		serie = (1/3.0) * Math.pow(serie, 2);
		JOptionPane.showMessageDialog(null, String.format("Valor da S�rie C = %.3f", serie), "S�RIES Matem�ticas", JOptionPane.INFORMATION_MESSAGE);
	}
}