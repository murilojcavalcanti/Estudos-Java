import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int numero = scan.nextInt();
        int Fatorial = 1;
        for (int i = numero; i >= 1; i--) {
            Fatorial = Fatorial * i;
            System.out.println(Fatorial);
        }
        System.out.println("Resultado:" + Fatorial);

    }
}
