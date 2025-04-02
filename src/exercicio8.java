import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número com três dígitos :");
        int numero = sc.nextInt();


        int dezena = (numero / 10) % 10;

        System.out.println("Valor da dezena --> " + dezena + " .");


    }
}











