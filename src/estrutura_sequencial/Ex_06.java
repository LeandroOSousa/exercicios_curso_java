package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
        Fazer um programa que leia três valores com ponto
        flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
        */

        System.out.print("Digite o valor de A: ");
        double A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double B = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double C = sc.nextDouble();
        sc.close();

        double areaTrianguloRetangulo = (A * C) / 2;
        double areaCirculo = Math.PI * Math.pow(C, 2);
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = Math.pow(B, 2);
        double areaRetangulo = A * B;

        System.out.printf("A área do triângulo retângulo é: %.3f\n", areaTrianguloRetangulo);
        System.out.printf("A área do círculo é: %.3f\n", areaCirculo);
        System.out.printf("A área do trapézio é: %.3f\n", areaTrapezio);
        System.out.printf("A área do quadrado é: %.3f\n", areaQuadrado);
        System.out.printf("A área do retângulo é: %.3f\n", areaRetangulo);
    }
}
