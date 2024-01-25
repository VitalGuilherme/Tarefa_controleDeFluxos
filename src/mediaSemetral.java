/**
 * @author vitalGuilherme
 */

import java.util.Scanner;

public class mediaSemetral {

    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ano letivo 2023.");
            System.out.println("Digite o nome e série do aluno.");
            String nome = s.nextLine();
            String serie = s.nextLine();
            System.out.println("Aluno: " + nome);
            System.out.println("Série: " + serie);

            System.out.println("Digite as notas do primeiro semestre:");
            int notab1 = s.nextInt();
            int notab2 = s.nextInt();

            System.out.println("Digite as notas do segundo semestre:");

            int notab3 = s.nextInt();
            int notab4 = s.nextInt();
            int resultado = (notab1 + notab2 + notab3 + notab4) / 4;
            System.out.println("Aluno: " + nome + " média: " + resultado);


            if (resultado >= 7) {
                System.out.println("Aprovado.");
            } else if (resultado >= 5 && resultado <= 6) {
                System.out.println("Recuperação.");
            } else {
            System.out.println("Reprovado.");
            }

    }
}
