import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicoCambioAPI {

    public String obterDadosMoeda(String moedaBase) throws IOException, InterruptedException {

        String chaveApi = "0ac2f7d6a7d28047d868038b";

        String urlRequisicao =
                "https://v6.exchangerate-api.com/v6/" +
                chaveApi +
                "/latest/" +
                moedaBase;

        HttpClient clienteHttp = HttpClient.newHttpClient();

        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(urlRequisicao))
                .build();

        HttpResponse<String> resposta =
                clienteHttp.send(requisicao, HttpResponse.BodyHandlers.ofString());

        return resposta.body();
    }
}