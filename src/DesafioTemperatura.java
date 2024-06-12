public class DesafioTemperatura {
    public static void main(String[] args) {
        double temperaturaEmCelsius = 30.4;  // Define a temperatura em Celsius
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;  // Converte a temperatura para Fahrenheit

        // Cria uma mensagem com as temperaturas
        String mensagem = String.format("A temperatura de %f graus Celsius " +
                "é equivalente a %f graus Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);  // Exibe a mensagem

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;  // Converte a temperatura em Fahrenheit para um número inteiro
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);  // Exibe a temperatura em Fahrenheit inteira
    }
}