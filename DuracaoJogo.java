import java.util.Scanner;

class CalculadoraDuracaoJogo {
    private int horaInicial;
    private int horaFinal;

    public CalculadoraDuracaoJogo(int horaInicial, int horaFinal) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    public int calcularDuracao() {
        int duracao;

        if (horaInicial == horaFinal) {
            duracao = 24;
        }
        else if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = (24 - horaInicial) + horaFinal;
        }
        return duracao;
    }
}

public class DuracaoJogoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horaInicial = sc.nextInt();

        System.out.print("Hora final: ");
        int horaFinal = sc.nextInt();

        CalculadoraDuracaoJogo jogo = new CalculadoraDuracaoJogo(horaInicial, horaFinal);

        System.out.printf("O JOGO DUROU %d HORA(S)%n", jogo.calcularDuracao());

        sc.close();
    }
}