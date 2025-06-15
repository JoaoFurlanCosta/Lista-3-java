import java.util.Locale;
import java.util.Scanner;


class Aluno {
    private double notaPrimeiroSemestre;
    private double notaSegundoSemestre;

 
    public Aluno(double notaPrimeiroSemestre, double notaSegundoSemestre) {
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
        this.notaSegundoSemestre = notaSegundoSemestre;
    }


    public double calcularNotaFinal() {
        return notaPrimeiroSemestre + notaSegundoSemestre;
    }


    public String verificarSituacao() {
        double notaFinal = calcularNotaFinal();
        if (notaFinal < 60.0) {
            return "REPROVADO";
        } else {
            return ""; 
        }
    }
}

public class NotasAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        Aluno aluno = new Aluno(nota1, nota2);

        double notaFinal = aluno.calcularNotaFinal();

        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);

        String situacao = aluno.verificarSituacao();
        if (!situacao.isEmpty()) {
            System.out.println(situacao);
        }

        sc.close();
    }
}