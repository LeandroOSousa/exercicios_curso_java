package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
        Leia a hora inicial e a hora final de um jogo. A seguir calcule a
        duração do jogo, sabendo que o mesmo pode começar em um dia e terminar
        em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
        */
        System.out.print("Digite a hora inicial do jogo: ");
        int hora_inicial = sc.nextInt();
        System.out.print("Digite a hora do termino do jogo: ");
        int hora_final = sc.nextInt();
        sc.close();
        int duracao_jogo = 0;

        if (hora_inicial < hora_final) {
           duracao_jogo =  hora_final - hora_inicial;
        } else {
            duracao_jogo = 24 - hora_inicial + hora_final;
        }
        System.out.printf("\nO jogo duro %d horas.", duracao_jogo);
    }
}
