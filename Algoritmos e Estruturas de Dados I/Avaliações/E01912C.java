// Autor: Luan Marcelino de Souza

import java.util.Scanner;
import java.text.DecimalFormat;
public class E01912C {
	public static void main(String[] args) {
		int andares, totMetrosQuadAndar, quantDias;
		double custoMaoObra, precoBruto, percLucro, precoFinal, valorImposto;
		String valorFormatado;
		
		Scanner arquivo = new Scanner(E01912C.class.getResourceAsStream("prova.txt"));
		andares = arquivo.nextInt();
		totMetrosQuadAndar = arquivo.nextInt();
		percLucro = arquivo.nextDouble();
		
		quantDias = andares*totMetrosQuadAndar/10;
		if (andares*totMetrosQuadAndar%10 != 0)
			quantDias++;
			
		if (quantDias>=5)
			valorImposto = 1000*(quantDias/5);
		else
			valorImposto = 0;
		
		custoMaoObra = 5000 + quantDias*260.23 + 56.3*andares*totMetrosQuadAndar;
		precoBruto = andares*totMetrosQuadAndar*125.5 + custoMaoObra + valorImposto;
		precoFinal = percLucro/100f*precoBruto + precoBruto;
		valorFormatado = new DecimalFormat("R$ #,##0.00").format(precoFinal);
		
		System.out.println("Preço Final = "+valorFormatado);
		arquivo.close();
	}
}