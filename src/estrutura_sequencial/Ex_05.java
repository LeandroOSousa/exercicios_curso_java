package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
        Fazer um programa para ler o código de uma peça 1, o número de peças 1,
        o valor unitário de cada peça 1, o código de uma peça 2,
        o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        */

        System.out.print("Digite o código da peça 1: ");
        int codigo1 = sc.nextInt();
        System.out.print("Digite o número de peças 1: ");
        int qtd1 = sc.nextInt();
        System.out.print("Digite o valor unitário de cada peça 1: ");
        double valorUnitario1 = sc.nextDouble();

        System.out.print("Digite o código da peça 2: ");
        int codigo2 = sc.nextInt();
        System.out.print("Digite o número de peças 1: ");
        int qtd2 = sc.nextInt();
        System.out.print("Digite o valor unitário de cada peça 2: ");
        double valorUnitario2 = sc.nextDouble();
        sc.close();

        double total = (qtd1 * valorUnitario1) + (qtd2 * valorUnitario2);
        System.out.printf("O valor a ser pago é: %.2f", total);
    }
}
