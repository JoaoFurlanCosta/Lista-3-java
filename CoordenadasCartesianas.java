import java.util.Locale; 
import java.util.Scanner; 


class PontoCartesiano {
    private double x;
    private double y;

    public PontoCartesiano(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getLocalizacao() {
        if (x == 0 && y == 0) {
            return "Origem";
        } else if (x == 0) {
            return "Eixo Y"; 
        } else if (y == 0) {
            return "Eixo X"; 
        } else if (x > 0 && y > 0) {
            return "Q1";
        } else if (x < 0 && y > 0) {
            return "Q2";
        } else if (x < 0 && y < 0) {
            return "Q3";
        } else { 
            return "Q4";
        }
    }
}

public class CoordenadasApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de X: ");
        double x = sc.nextDouble();

        System.out.print("Valor de Y: ");
        double y = sc.nextDouble();

        PontoCartesiano ponto = new PontoCartesiano(x, y);

        System.out.println(ponto.getLocalizacao());

        sc.close(); 
    }
}