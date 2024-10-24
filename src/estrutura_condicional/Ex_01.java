package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
         */

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        sc.close();

        if (numero < 0) {
            System.out.println("O número é negativo.");
        }else {
            System.out.println("O número não é positivo.");
        }
    }
}
