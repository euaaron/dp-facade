public class Trabalhador {
    private String ctps;
    private String nome;
    private double salario;
    private double bonus;

    public Trabalhador() {}

    /**
     *
     * @param ctps - Numero da Carteira de Trabalho do trabalhador
     * @param nome - Nome do trabalhador
     * @param salario - Salario Mensal do trabalhador
     * @param bonus - Bonus Anual do trabalhador (participação nos lucros)
     */
    public Trabalhador(String ctps, String nome, double salario, double bonus) {
        this.ctps = ctps;
        this.nome = nome;
        this.salario = salario;
        this.bonus = bonus;
    }

    public double getImpostoDeRenda() {
        return TrabalhadorFacade.getValorADeclarar(this);
    }

    public String getCtps() {
        return ctps;
    }

    public Trabalhador setCtps(String ctps) {
        this.ctps = ctps;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Trabalhador setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public double getSalario() {
        return salario;
    }

    public Trabalhador setSalario(double salario) {
        this.salario = salario;
        return this;
    }

    public double getBonus() {
        return bonus;
    }

    public Trabalhador setBonus(double bonus) {
        this.bonus = bonus;
        return this;
    }
}
