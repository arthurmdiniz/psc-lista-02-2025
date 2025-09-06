import java.util.Scanner;

public class Lista02_E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float preco, litro, pagar;
        
        System.out.print("Informe o preço da gasolina: ");
        preco = scanner.nextFloat();

        System.out.print("Informe quanto litros foram abestecidos: ");
        litro = scanner.nextFloat();

        pagar =  preco * litro;

        System.out.printf("O valor a pagar é: %.2f", pagar);
        
        
    }
}
