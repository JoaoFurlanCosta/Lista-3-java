import java.util.Locale; 
import java.util.Scanner; 

class ConversorTemperatura {

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

public class ConversorDeTemperaturaApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char escalaOrigem = sc.next().toUpperCase().charAt(0); 

        double temperaturaDigitada;
        double temperaturaConvertida;

        if (escalaOrigem == 'F') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperaturaDigitada = sc.nextDouble();
            temperaturaConvertida = ConversorTemperatura.fahrenheitParaCelsius(temperaturaDigitada);
            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", temperaturaConvertida);
        } else if (escalaOrigem == 'C') {
            System.out.print("Digite a temperatura em Celsius: ");
            temperaturaDigitada = sc.nextDouble();
            temperaturaConvertida = ConversorTemperatura.celsiusParaFahrenheit(temperaturaDigitada);
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", temperaturaConvertida);
        } else {
            System.out.println("Escala inválida! Por favor, digite 'C' ou 'F'.");
        }

        sc.close(); 
    }
}