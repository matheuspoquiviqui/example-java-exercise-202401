import java.util.Scanner;
public class Ativ05 {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    double totalTemperaturas = 12, somaTemperaturas = 0, mediaTemperaturas, temperatura; 

    System.out.println("Escreva 12 temperaturas da água, de uma determinada região geográfica.");
    System.out.println("Cada temperatura deve ser maior ou igual a 4 ºC (Celsius) e menor ou igual a 10º C.");

        for (int i = 0; i < totalTemperaturas; i++) {
           do {
            System.out.print("Escreva a temperatura " + (i + 1) + " (entre 4 e 10): ");
            temperatura = scanner.nextDouble();
            if (temperatura <= 4 || temperatura >= 11){
                System.out.println("Erro: Temperatura inválida! Informe uma temperatura entre 4°C e 10°C.");
            }
            } while (temperatura <= 4 || temperatura >= 11);
            
           somaTemperaturas += temperatura;
        }
        mediaTemperaturas = somaTemperaturas / totalTemperaturas;
        System.out.println("A média de hoje das temperaturas é: " + mediaTemperaturas + "°C");
    }
    Scanner close;
}