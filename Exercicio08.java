import java.util.Arrays;
import java.util.Scanner;

public class Exercicio08 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite " + (i+1) + ":");
            A[i] = scanner.nextInt();
        }

        int[] B = new int[5];
        for (int i = 0; i < B.length; i++) {
            System.out.println("Digite " + (i+1) + ":");
            B[i] = scanner.nextInt();
        }

        int[] C = new int[A.length + B.length];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }

        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }

        System.out.println("Vetor C concatenado: " + Arrays.toString(C));

        scanner.close();
    }
}
