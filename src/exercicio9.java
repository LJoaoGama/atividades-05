import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número com três dígitos :");
        int numero = sc.nextInt();

        int centena = (numero/100) %10;
        int dezena = (numero / 10) % 10;
        int unidade = (numero / 1) % 10;

        System.out.println("Valor da dezena --> " + dezena);
        System.out.println("Valor da centena --> " + centena);
        System.out.println("Valor da Unidade --> " + unidade);

        System.out.println(" O seu número inverso será: " + unidade + dezena + centena);
    }
}