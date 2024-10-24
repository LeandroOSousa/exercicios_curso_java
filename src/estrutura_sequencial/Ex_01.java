package estrutura_sequencial;

import java.util.Scanner;

public class Ex_01 {
    /*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    mensagem explicativa, conforme exemplos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();
        sc.close();

        int soma = num1 + num2;
        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + soma);
    }
}
