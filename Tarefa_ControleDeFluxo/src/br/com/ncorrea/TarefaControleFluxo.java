package br.com.ncorrea;

import java.util.Scanner;

public class TarefaControleFluxo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a nota do aluno 1: ");
        double notaAluno1 = scanner.nextDouble();

        System.out.print("Informe a nota do aluno 2: ");
        double notaAluno2 = scanner.nextDouble();

        System.out.print("Informe a nota do aluno 3: ");
        double notaAluno3 = scanner.nextDouble();

        System.out.print("Informe a nota do aluno 4: ");
        double notaAluno4 = scanner.nextDouble();

        System.out.println(mediaAlunos(notaAluno1, notaAluno2, notaAluno3, notaAluno4));

        scanner.close();

    }

    public static String mediaAlunos(double notaAluno1, double notaAluno2, double notaAluno3, double notaAluno4) {

        double resultadoMedia = (notaAluno1 + notaAluno2 + notaAluno3 + notaAluno4) / 4;

        if (resultadoMedia >= 7) {
            return "APROVADO!";
        } else if (resultadoMedia >= 5) {
            return "EM RECUPERAÇÃO!";
        } else {
            return "REPROVADO!";
        }

    }
}
