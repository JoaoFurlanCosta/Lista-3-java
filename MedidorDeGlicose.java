import java.util.Locale; 
import java.util.Scanner; 

class MedidorGlicose {
    private double medidaGlicose;

    public MedidorGlicose(double medidaGlicose) {
        this.medidaGlicose = medidaGlicose;
    }

    public String getClassificacao() {
        if (medidaGlicose <= 100.0) {
            return "normal";
        } else if (medidaGlicose <= 140.0) { 
            return "elevado";
        } else { 
            return "diabetes";
        }
    }
}

public class ClassificadorGlicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double glicose = sc.nextDouble();

        MedidorGlicose medidor = new MedidorGlicose(glicose);

        System.out.println("Classificacao: " + medidor.getClassificacao());

        sc.close(); 
    }
}