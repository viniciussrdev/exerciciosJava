public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;  // Define o ano de lançamento do filme
        boolean incluidoNoPlano = true;  // Define se o filme está incluído no plano
        double notaDoFilme = 8.1;  // Define a nota do filme
        String tipoPlano = "Normal";  // Define o tipo de plano do usuário

        // Verifica se o filme foi lançado em 2022 ou depois
        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os usuários curtem!");  // Mensagem se o filme for um lançamento recente
        } else {
            System.out.println("Filmes retrôs apaixonantes!");  // Mensagem se o filme for mais antigo
        }

        // Verifica se o filme está incluído no plano e se o tipo de plano é "Plus"
        if (incluidoNoPlano == true & tipoPlano.equals("Plus")) {
            System.out.println("Filme Liberado!");  // Mensagem se o filme está liberado no plano "Plus"
        } else {
            System.out.println("Pagar locação.");  // Mensagem se o filme não está liberado no plano "Plus"
        }
    }
}
