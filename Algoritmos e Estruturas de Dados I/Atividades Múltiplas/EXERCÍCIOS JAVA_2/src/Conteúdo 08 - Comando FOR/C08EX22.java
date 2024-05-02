import javax.swing.JOptionPane;

public class C08EX22 {
	// Autor: Luan Marcelino de Souza
	public static void main(String[] args) {
		String numeroStr;
		int numero, quantDivisores=0;
		
		numeroStr = JOptionPane.showInputDialog(null, "Informe um n�mero inteiro maior que zero:", "Identificador de n�meros primos", JOptionPane.QUESTION_MESSAGE);
		numero = Integer.valueOf(numeroStr);
		
		if (numero>0) {
			for (int i=1; i<=numero; i++) {
				if (numero%i == 0) {
					quantDivisores++;
				}
			}
			
			if (quantDivisores==2) {
				JOptionPane.showMessageDialog(null, "O n�mero digitado � primo.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			}
			
			if (quantDivisores>2) {
				JOptionPane.showMessageDialog(null, "O n�mero digit�do n�o � primo", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else
			JOptionPane.showMessageDialog(null, "Valor inv�lido", "ERRO", JOptionPane.INFORMATION_MESSAGE);
	}
}