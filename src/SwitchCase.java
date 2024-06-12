public class SwitchCase {
    public static void main(String[] args) {

        int dia = 3;
        String nomeDia;

        // Switch case para determinar o nome do dia da semana com base no número do dia
        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        // Exibe o nome do dia da semana correspondente ao número informado
        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}
