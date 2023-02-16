import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[6];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor: ");
            vetor[i] = scan.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("elemento (" + (i + 1) + ") do vetor = " + vetor[i]);
        }

        for (int x = (vetor.length - 1); x >= 0; x--) {
            System.out.println("elemento do vetor = " + vetor[x]);
        }
    }

}
