import com.google.gson.Gson;
import java.util.Scanner;

public class AplicacaoPrincipal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ServicoCambioAPI servicoCambio = new ServicoCambioAPI();
        Gson conversorJson = new Gson();

        int opcaoMenu = 0;

        while (opcaoMenu != 7) {

            System.out.println("\n===============================");
            System.out.println(" Sistema de Conversão Monetária ");
            System.out.println("===============================");
            System.out.println("1 - USD -> BRL");
            System.out.println("2 - BRL -> USD");
            System.out.println("3 - EUR -> BRL");
            System.out.println("4 - BRL -> EUR");
            System.out.println("5 - GBP -> BRL");
            System.out.println("6 - BRL -> GBP");
            System.out.println("7 - Encerrar");
            System.out.println("===============================");

            System.out.print("Selecione uma opção: ");
            opcaoMenu = leitor.nextInt();

            if (opcaoMenu == 7) {
                System.out.println("Finalizando sistema...");
                break;
            }

            String moedaOrigem = "";
            String moedaDestino = "";

            switch (opcaoMenu) {
                case 1 -> { moedaOrigem = "USD"; moedaDestino = "BRL"; }
                case 2 -> { moedaOrigem = "BRL"; moedaDestino = "USD"; }
                case 3 -> { moedaOrigem = "EUR"; moedaDestino = "BRL"; }
                case 4 -> { moedaOrigem = "BRL"; moedaDestino = "EUR"; }
                case 5 -> { moedaOrigem = "GBP"; moedaDestino = "BRL"; }
                case 6 -> { moedaOrigem = "BRL"; moedaDestino = "GBP"; }
                default -> {
                    System.out.println("Opção inválida!");
                    continue;
                }
            }

            System.out.print("Informe o valor para conversão: ");
            double quantia = leitor.nextDouble();

            try {

                String respostaJson = servicoCambio.obterDadosMoeda(moedaOrigem);

                DadosCambio dadosCambio = conversorJson.fromJson(respostaJson, DadosCambio.class);

                Double cotacao = dadosCambio.taxasConversao.get(moedaDestino);

                if (cotacao == null) {
                    System.out.println("Falha ao localizar moeda desejada.");
                    continue;
                }

                CalculadoraCambio calculadora = new CalculadoraCambio();
                double valorConvertido = calculadora.realizarConversao(quantia, cotacao);

                System.out.println("Valor convertido: " + valorConvertido + " " + moedaDestino);

            } catch (Exception erro) {

                System.out.println("Falha ao consultar serviço de câmbio.");
                System.out.println(erro.getMessage());

            }
        }

        leitor.close();
    }
}