import java.util.Locale; 
import java.util.Scanner; 


class CalculadoraSalario {
    private double salarioAtual;

  
    public CalculadoraSalario(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public double getPorcentagemAumento() {
        if (salarioAtual <= 1000.00) {
            return 0.20; 
        } else if (salarioAtual <= 3000.00) { 
            return 0.15; 
        } else if (salarioAtual <= 8000.00) { 
            return 0.10; 
        } else { 
            return 0.05; 
        }
    }

    public double calcularValorAumento() {
        return salarioAtual * getPorcentagemAumento();
    }

    public double calcularNovoSalario() {
        return salarioAtual + calcularValorAumento();
    }
}

public class AumentoSalarialApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        double salario = sc.nextDouble();

        CalculadoraSalario calculadora = new CalculadoraSalario(salario);

        double novoSalario = calculadora.calcularNovoSalario();
        double valorAumento = calculadora.calcularValorAumento();
        int porcentagem = (int) (calculadora.getPorcentagemAumento() * 100);

        System.out.printf("Novo salario R$ %.2f%n", novoSalario);
        System.out.printf("Aumento R$ %.2f%n", valorAumento);
        System.out.printf("Porcentagem = %d%%%n", porcentagem); 

        sc.close();
    }
}