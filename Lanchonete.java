import java.util.Locale; 
import java.util.Scanner; 


class Produto {
    private int codigo;
    private double preco;
    private String nome; 

    public Produto(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}

class Lanchonete {
    private Produto[] menu;

    public Lanchonete() {
        menu = new Produto[5]; 
        menu[0] = new Produto(1, 5.00, "X-Salada"); 
        menu[1] = new Produto(2, 3.50, "Cachorro Quente");
        menu[2] = new Produto(3, 4.80, "Misto Quente");
        menu[3] = new Produto(4, 8.90, "X-Bacon");
        menu[4] = new Produto(5, 7.32, "Refrigerante");
    }

    public double getPrecoPorCodigo(int codigo) {
        for (Produto p : menu) {
            if (p.getCodigo() == codigo) {
                return p.getPreco();
            }
        }
        return -1.0; 
    }

    public double calcularValorTotal(int codigoProduto, int quantidade) {
        double precoUnitario = getPrecoPorCodigo(codigoProduto);

        if (precoUnitario == -1.0) {
            System.err.println("Erro: Código de produto inválido!");
            return 0.0;
        }

        return precoUnitario * quantidade;
    }
}

public class CaixaLanchonete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Lanchonete minhaLanchonete = new Lanchonete();

        System.out.print("Codigo do produto comprado: ");
        int codigo = sc.nextInt();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        double valorAPagar = minhaLanchonete.calcularValorTotal(codigo, quantidade);

        if (valorAPagar > 0 || (valorAPagar == 0 && codigo > 0)) { 
             System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);
        }


        sc.close();
    }
}