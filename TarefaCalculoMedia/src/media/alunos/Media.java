package media.alunos;

/**
 * @author nicolas.tenorio
 */

public class Media {
    public static void main(String[] args) {
        //Métodos
        mediaDosAlunos();

    }

    public static void mediaDosAlunos() {
        double alunoNota1 = 10;
        double alunoNota2 = 8;
        double alunoNota3 = 7;
        double alunoNota4 = 9;

        double resultadoMedia = (alunoNota1 + alunoNota2 +alunoNota3 + alunoNota4) / 4;
        System.out.println("\n**************** MÉDIAS ***********************\n");
        System.out.println("A média das notas dos quatro alunos são: " + resultadoMedia);
    }
}
