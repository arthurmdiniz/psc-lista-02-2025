import java.util.Scanner;

public class Lista02_E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota1, nota2, nota3, nota4;
        float media;
        
        System.out.print("Informe a nota do primeiro bimestre: ");
        nota1 = scanner.nextInt();

        System.out.print("Informe a nota do segundo bimestre: ");
        nota2 = scanner.nextInt();

        System.out.print("Informe a nota do terceiro bimestre: ");
        nota3 = scanner.nextInt();

        System.out.print("Informe a nota do quarto bimestre: ");
        nota4 = scanner.nextInt();

        media = (float) (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("A média dos bimestres é: %.2f", media);
        
        
    }
}
