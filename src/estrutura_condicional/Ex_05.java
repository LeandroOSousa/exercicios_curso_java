package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o codigo do item: ");
        int cod = sc.nextInt();
        System.out.print("Digite a quantidade do item: ");
        int qtd = sc.nextInt();
        sc.close();

        double total = 0;

        switch (cod) {
            case 1:
                total = qtd * 4.0;
                break;
            case 2:
                total = qtd * 4.5;
                break;
            case 3:
                total = qtd * 5.0;
                break;
            case 4:
                total = qtd * 2.0;
                break;
            case 5:
                total = qtd * 1.5;
                break;
            default:
                System.out.println("Codigo inexistente");
        }

        System.out.printf("Total = %.2f", total);
    }
}