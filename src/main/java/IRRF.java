/**
 * IRPF: Imposto de Renda Retido na Fonte
 */
public class IRRF extends IRPF {
    private static IRRF instance;

    private IRRF(double income) {
        this.income = income;
        this.defineValues();
    }

    public static IRRF getInstance(Trabalhador trabalhador) {
        if (instance == null) {
            instance = new IRRF(trabalhador.getSalario());
        }
        return instance;
    }

    private void defineValues() {
        if (income > 1903.98 && income <= 2826.65) {
            this.aliquota = 7.5;
            this.discount = 142.80;
        }
        if (income > 2826.65 && income <= 3751.05) {
            this.aliquota = 15;
            this.discount = 354.80;
        }
        if (income > 3751.05 && income <= 4664.68) {
            this.aliquota = 22.5;
            this.discount = 636.13;
        }
        if (income > 4664.68) {
            this.aliquota = 27.5;
            this.discount = 869.36;
        }
    }
}
