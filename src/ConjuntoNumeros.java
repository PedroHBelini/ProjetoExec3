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

        while (tamanho > 0 && tamanho < 10) {

            System.out.print("> ");

            int numero = scanner.nextInt();

            int indice = encontrarIndice(vetor, tamanho, numero);

            if (indice == -1) {
                if (tamanho < 10) {

                    vetor[tamanho] = numero;

                    tamanho++;

                }

            } else {

                for (int i = indice; i < tamanho - 1; i++) {

                    vetor[i] = vetor[i + 1];

                }
                tamanho--;

            }
            imprimirVetor(vetor, tamanho);

        }

        scanner.close();
    }
    private static int encontrarIndice(int[] vetor, int tamanho, int numero) {

        for (int i = 0; i < tamanho; i++) {

            if (vetor[i] == numero) {

                return i;

            }

        }

        return -1;

    }
    private static void imprimirVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}