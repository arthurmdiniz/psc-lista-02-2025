import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Lista02_E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String total_formatado;

        float preco_alemanha, preco_portugal, preco_italia, total_viagem;
        int total_pessoas;
     
        System.out.print("Digite o preço da viagem para Alemanha: R$");
        preco_alemanha = scanner.nextFloat();

        System.out.print("Digite o preço da viagem para Portugal: R$");
        preco_portugal = scanner.nextFloat();

        System.out.print("Digite o preço da viagem para Itália: R$");
        preco_italia = scanner.nextFloat();

        System.out.print("Digite a quantidade de pessoas que irão realizar a Eurotrip: ");
        total_pessoas = scanner.nextInt();

        total_viagem = (preco_alemanha + preco_portugal + preco_italia) * total_pessoas;
        total_formatado = formatter.format(total_viagem); //valor total da viagem com milhar

        System.out.printf("A viagem terá um total de "+ total_pessoas + " pessoas, a viagem terá um valor total de: "+ total_formatado );
        
    }
}
