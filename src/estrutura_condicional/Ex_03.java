package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
        "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
        múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
         */
        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int b = sc.nextInt();
        sc.close();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
