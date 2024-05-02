import javax.swing.JOptionPane;

public class C08EX30 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String xStr, nStr;
		double x, n, soma=0, serie;
		
		xStr = JOptionPane.showInputDialog(null, "S�rie = lnx + x + x^2/2 + x^3/3 + x^4/4 + x^5/5 + ... + x^n/n\n\nTendo como base a s�rie logar�tmica acima, informe a seguir o valor de x:", "S�rie Logar�tmica", JOptionPane.QUESTION_MESSAGE);
		x = Double.valueOf(xStr);
		
		nStr = JOptionPane.showInputDialog(null, "Informe o valor de n:", "S�rie Logar�tmica", JOptionPane.QUESTION_MESSAGE);
		n = Integer.valueOf(nStr);
		
		for (int i=1; i<=n; i++) {
			soma += Math.pow(x, i)/i;
		}
		
		serie = Math.log(x)+soma;
		
		JOptionPane.showMessageDialog(null, "Valor = "+serie, "S�rie Logar�tmica", JOptionPane.INFORMATION_MESSAGE);
	}
}