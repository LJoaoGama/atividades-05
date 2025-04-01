import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0,000.00");

        double salario, valorhoraaula, numerohorastrabalhadas, descontoinss, salarioliquido;

        System.out.println("Digite a quantidade de horas trabalhadas esse mês: ");
        numerohorastrabalhadas = sc.nextDouble();

        System.out.println("Digite o valor da hor aula paga: ");
        valorhoraaula = sc.nextDouble();

        System.out.println("Informe o valor descontado pelo INSS: ");
        descontoinss = sc.nextDouble();

        salario = numerohorastrabalhadas*valorhoraaula;
        salarioliquido = salario - (salario * (descontoinss * 0.01));

        System.out.println("O seu salário bruto foi de R$ " + df.format(salario) + " .");
        System.out.println("Já o seu salário líquido foi R$ " + df.format(salarioliquido) + " .");


    }
}
