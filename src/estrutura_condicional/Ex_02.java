package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        /*
         Faça um programa para ler um número inteiro e verificar se ele é par ou impar.
         Se for par, mostrar a mensagem "O número é par".
         Se for ímpar, mostrar a mensagem "O número é ímpar".
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        sc.close();

        if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}
