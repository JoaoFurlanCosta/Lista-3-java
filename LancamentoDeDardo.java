import java.util.Locale; 
import java.util.Scanner; 
import java.lang.Math;   


class LancamentoDardo {
    private double distancia1;
    private double distancia2;
    private double distancia3;

    public LancamentoDardo(double distancia1, double distancia2, double distancia3) {
        this.distancia1 = distancia1;
        this.distancia2 = distancia2;
        this.distancia3 = distancia3;
    }

    public double encontrarMaiorDistancia() {
        return Math.max(distancia1, Math.max(distancia2, distancia3));
    }
}

public class MedidorDardo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as tres distancias:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();

        LancamentoDardo lancamento = new LancamentoDardo(d1, d2, d3);

        System.out.printf("MAIOR DISTANCIA = %.2f%n", lancamento.encontrarMaiorDistancia());

        sc.close(); 
    }
}