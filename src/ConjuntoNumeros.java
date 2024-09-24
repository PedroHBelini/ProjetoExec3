import java.util.Scanner;

public class ConjuntoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10]; //
        int tamanho = 0; //

        System.out.print("> ");
        for (int i = 0; i < 5; i++) {
            vetor[tamanho] = scanner.nextInt();
            tamanho++;
        }

        imprimirVetor(vetor, tamanho);
        scanner.close();
    }
    private static void imprimirVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}