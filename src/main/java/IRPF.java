import jdk.jshell.spi.ExecutionControl.NotImplementedException;

/**
 * IRPF: Imposto de Renda sobre Pessoa Física
 */
public abstract class IRPF {
    protected double aliquota = 0;
    protected double discount = 0;
    protected double income = 0;

    /**
     * Defines values to aliquota and descontos according to the salary value
     */
    private void defineValues() throws NotImplementedException {
        throw new NotImplementedException("You should override this method on the child class");
    }

    public double getImpostoDeRenda() {
        return ((income - discount) * aliquota) / 100;
    }

    public double getAliquota() {
        return aliquota;
    }

    public IRPF setAliquota(double aliquota) {
        this.aliquota = aliquota;
        return this;
    }

    public double getDiscount() {
        return discount;
    }

    public IRPF setDiscount(double discount) {
        this.discount = discount;
        return this;
    }
}
