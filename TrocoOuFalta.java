import java.util.Locale; 
import java.util.Scanner; 

class CalculadoraTroco {
    private double precoUnitario;
    private int quantidadeComprada;
    private double valorRecebido;

    public CalculadoraTroco(double precoUnitario, int quantidadeComprada, double valorRecebido) {
        this.precoUnitario = precoUnitario;
        this.quantidadeComprada = quantidadeComprada;
        this.valorRecebido = valorRecebido;
    }

    public double calcularValorTotalCompra() {
        return precoUnitario * quantidadeComprada;
    }

    public double calcularDiferenca() {
        double valorTotal = calcularValorTotalCompra();
        return valorRecebido - valorTotal;
    }

    public boolean temTroco() {
        return calcularDiferenca() >= 0;
    }

    public String obterMensagemResultado() {
        double diferenca = calcularDiferenca();
        if (temTroco()) {
            return String.format(Locale.US, "TROCO = %.2f", diferenca);
        } else {
            return String.format(Locale.US, "DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", Math.abs(diferenca));
        }
    }
}

public class CaixaRegistradora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        double recebido = sc.nextDouble();

        CalculadoraTroco calculadora = new CalculadoraTroco(preco, quantidade, recebido);

        System.out.println(calculadora.obterMensagemResultado());

        sc.close(); 
    }
}