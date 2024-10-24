package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;
import java.util.spi.LocaleNameProvider;

import static java.util.Locale.US;

public class Ex_02 {
    public static void main(String[] args) {/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo
com quatro casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do raio: ");
        double raio = sc.nextDouble();
        sc.close();
        double area = 3.14159 * (raio * raio);

        System.out.printf("A aréa do círculo é: %.4f", area);
    }
}
