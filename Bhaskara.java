import java.util.Locale;
import java.util.Scanner;
import java.lang.Math; 


class EquacaoSegundoGrau {
    private double a;
    private double b;
    private double c;

    public EquacaoSegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularDelta() {
        return (b * b) - (4 * a * c);
    }

    public boolean possuiRaizesReais() {
        return calcularDelta() >= 0;
    }

    public double calcularX1() {
        if (!possuiRaizesReais()) {
            throw new IllegalStateException("Esta equação não possui raízes reais.");
        }
        double delta = calcularDelta();
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double calcularX2() {
        if (!possuiRaizesReais()) {
            throw new IllegalStateException("Esta equação não possui raízes reais.");
        }
        double delta = calcularDelta();
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}

public class BhaskaraCalculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Coeficiente a: ");
        double a = sc.nextDouble();

        System.out.print("Coeficiente b: ");
        double b = sc.nextDouble();

        System.out.print("Coeficiente c: ");
        double c = sc.nextDouble();

        EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(a, b, c);

        if (equacao.possuiRaizesReais()) {
            double x1 = equacao.calcularX1();
            double x2 = equacao.calcularX2();

            System.out.printf("X1 = %.4f%n", x1);
            System.out.printf("X2 = %.4f%n", x2);
        } else {
            System.out.println("Esta equacao nao possui raizes reais");
        }

        sc.close(); 
    }
}