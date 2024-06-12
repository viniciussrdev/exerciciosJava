public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match");  // Exibe uma mensagem de boas-vindas
        System.out.println("Filme: Top Gun Maverick");  // Exibe o nome do filme

        int anoDeLancamento = 2022;  // Define o ano de lançamento do filme
        System.out.println("Ano de Lançamento: " + anoDeLancamento);  // Exibe o ano de lançamento

        boolean incluidoNoPlano = true;  // Define se o filme está incluído no plano
        double notadoFilme = 8.1;  // Define a nota do filme

        if (incluidoNoPlano) {  // Verifica se o filme está incluído no plano
            System.out.println("Incluído no Plano: SIM");  // Exibe que o filme está incluído no plano
        } else {
            System.out.println("Incluído no Plano: NÃO");  // Exibe que o filme não está incluído no plano
        }

        double media = (9.8 + 6.3 + 8.0) / 3;  // Calcula a média de notas
        System.out.println(media);  // Exibe a média

        // Define a sinopse do filme
        String sinopse = """
                Sinopse do Filme
                Filme de aventura nos ares
                com Tom Cruise e grande elenco.
                """;
        System.out.println(sinopse);  // Exibe a sinopse

        int classificacao = (int) (media / 2);  // Calcula a classificação do filme
        System.out.println(classificacao);  // Exibe a classificação
    }
}