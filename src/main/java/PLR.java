/**
 * PLR: Participação nos Lucros e Resultados
 */
public class PLR extends IRPF {
    private static PLR instance;

    private PLR(double income) {
        this.income = income;
        this.defineValues();
    }

    public static PLR getInstance(Trabalhador trabalhador) {
        if (instance == null) {
            instance = new PLR(trabalhador.getBonus());
        }
        return instance;
    }

    private void defineValues() {
        if (income > 6677.55 && income <= 9922.28) {
            this.aliquota = 7.5;
            this.discount = 500.82;
        }
        if (income > 9922.28 && income <= 13167.00) {
            this.aliquota = 15;
            this.discount = 1244.99;
        }
        if (income > 13167.01 && income <= 16380.38) {
            this.aliquota = 22.5;
            this.discount = 2232.51;
        }
        if (income > 16380.38) {
            this.aliquota = 27.5;
            this.discount = 3051.53;
        }
    }
}
