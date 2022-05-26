public class TrabalhadorFacade {

    public static Double getValorADeclarar(Trabalhador trabalhador) {
        double valor = 0;
        valor += IRRF.getInstance(trabalhador).getImpostoDeRenda();
        valor += PLR.getInstance(trabalhador).getImpostoDeRenda();
        return valor;
    }
}
