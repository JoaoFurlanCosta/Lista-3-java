import java.util.Scanner;

class VerificadorMultiplos {
    private int numero1;
    private int numero2;

    public VerificadorMultiplos(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public boolean saoMultiplos() {
        if (numero1 == 0 && numero2 == 0) {
            return true; 
        }
        if (numero1 == 0 || numero2 == 0) {
            return (numero1 == 0 && numero2 != 0) || (numero2 == 0 && numero1 != 0);
        }


        return (numero1 % numero2 == 0) || (numero2 % numero1 == 0);
    }
}

public class MultiplosChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        VerificadorMultiplos verificador = new VerificadorMultiplos(num1, num2);

        if (verificador.saoMultiplos()) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }

        sc.close(); 
    }
}