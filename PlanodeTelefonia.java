import java.util.Locale;
import java.util.Scanner;

class FaturaTelefonia {
    private static final double VALOR_PLANO_BASICO = 50.00;
    private static final int MINUTOS_FRANQUIA = 100;
    private static final double CUSTO_POR_MINUTO_EXCEDENTE = 2.00;

    private int minutosConsumidos;

    public FaturaTelefonia(int minutosConsumidos) {
        this.minutosConsumidos = minutosConsumidos;
    }

    public double calcularValorAPagar() {
        double valorTotal = VALOR_PLANO_BASICO; 

        if (minutosConsumidos > MINUTOS_FRANQUIA) {
            int minutosExcedentes = minutosConsumidos - MINUTOS_FRANQUIA;
            valorTotal += (minutosExcedentes * CUSTO_POR_MINUTO_EXCEDENTE);
        }
        return valorTotal;
    }
}

public class CalculadoraContaTelefone {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();

        FaturaTelefonia fatura = new FaturaTelefonia(minutos);

        double valorFinal = fatura.calcularValorAPagar();

        System.out.printf("Valor a pagar: R$ %.2f%n", valorFinal);

        sc.close();
    }
}