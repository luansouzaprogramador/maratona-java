package introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double imposto;

        if (salarioAnual<=34712) {
            imposto = 0.097*salarioAnual;
        } else if (salarioAnual<=68507) {
            imposto = 0.3735*salarioAnual;
        } else {
            imposto = 0.495*salarioAnual;
        }

        System.out.println("Com base no seu salario anual de R$"+salarioAnual+", voce devera pagar R$"+imposto+" de imposto neste ano.");
    }
}
