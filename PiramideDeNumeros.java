import java.util.Scanner;

public class PiramideDeNumeros {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Piramide de números");
            System.out.println("======================");
            System.out.println("Escolha o numero limite da piramide: ");
            int numero = sc.nextInt();
            System.out.println("Piramide até o numero:  " + numero);
            for (int i = 1; i <= numero; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(i);
                }
                System.out.println("");
            }
        }
    }
}