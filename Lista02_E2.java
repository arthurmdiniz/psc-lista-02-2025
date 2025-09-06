import java.util.Scanner;

public class Lista02_E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, soma, subtracao, multiplicacao;
        
        System.out.print("Informe o primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        numero2 = scanner.nextInt();

        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        multiplicacao = numero1 * numero2;

        System.out.println("A soma dos números informados é: "+ soma);
        System.out.println("A subtração dos números informados é: " + subtracao);
        System.out.println("A multiplicação dos números informados é: " + multiplicacao);
        
        
    }
}
