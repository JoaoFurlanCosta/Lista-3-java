import java.util.Scanner;

class ComparadorNumeros {
    private int numero1;
    private int numero2;
    private int numero3;

    public ComparadorNumeros(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public int encontrarMenor() {
        int menor;

        if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
        }
        else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
        }
        else {
            menor = numero3;
        }
        return menor;
    }
}

public class MenorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.print("Segundo valor: ");
        int valor2 = sc.nextInt();

        System.out.print("Terceiro valor: ");
        int valor3 = sc.nextInt();

        ComparadorNumeros comparador = new ComparadorNumeros(valor1, valor2, valor3);

        int menorNumero = comparador.encontrarMenor();

        System.out.println("MENOR = " + menorNumero);

        sc.close();
    }
}