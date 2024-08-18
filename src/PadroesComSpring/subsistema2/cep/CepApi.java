package PadroesComSpring.subsistema2.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Vca";
    }

    public String recuperarEstado(String cep) {
        return "BA";
    }
}
