package introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condicao: valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 30000;
        double valorParcela;

        System.out.println("O carro pode ser parcelado em: ");
        for (int qtdeParcelas=(int)valorCarro; qtdeParcelas>=1; qtdeParcelas--) {
            valorParcela = valorCarro/qtdeParcelas;
            if (valorParcela<1000) {
                continue;
            }
            System.out.println(qtdeParcelas+" x R$"+valorParcela);
        }
    }
}
