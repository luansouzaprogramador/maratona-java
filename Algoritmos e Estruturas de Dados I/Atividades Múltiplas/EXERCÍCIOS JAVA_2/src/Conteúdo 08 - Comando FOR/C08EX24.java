import javax.swing.JOptionPane;

public class C08EX24 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		double serie, soma=0;
		
		for (int i=1; i<=99; i+=2) {
			soma += Math.pow(2, i);
		}
		
		serie = soma/3.0;
		JOptionPane.showMessageDialog(null, "Valor = "+serie, "S�rie", JOptionPane.INFORMATION_MESSAGE);
	}
}