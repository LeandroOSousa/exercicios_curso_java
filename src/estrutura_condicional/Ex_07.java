package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
        Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        Se o ponto estiver na origem, escreva a mensagem “Origem”.
        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
        situação.
         */
        System.out.print("Digite o valor de x: ");
        double x = sc.nextDouble();
        System.out.print("Digite o valor de y: ");
        double y = sc.nextDouble();

        if (y != 0 && x != 0) {
            if (y > 0) {
                if (x > 0) {
                    System.out.println("Q1");
                } else {
                    System.out.println("Q2");
                }
            } else {
                if (x > 0) {
                    System.out.println("Q4");
                } else {
                    System.out.println("Q3");
                }
            }
        } else {
            System.out.println("Origem");
        }
        sc.close();
    }
}
