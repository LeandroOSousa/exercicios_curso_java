package estrutura_sequencial;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        /*
         Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
         o valor que recebe por hora e calcula o salário desse funcionário.
         A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do funcionario: ");
        int cod_funcionario = sc.nextInt();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horas_trabalhadas = sc.nextInt();

        System.out.print("Digite o valor por hora trabalhada: ");
        double valor_por_hora = sc.nextDouble();
        sc.close();

        double salario = horas_trabalhadas * valor_por_hora;
        System.out.printf("Funcionario: %d\n" +
                "Salario R$: %.2f", cod_funcionario, salario);
    }
}
