import java.util.Scanner;

public class Uni3Exe08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int produto1 = entrada.nextInt();
        int uni1 = entrada.nextInt();
        double precouni1 = entrada.nextDouble();
        int produto2 = entrada.nextInt();
        int uni2 = entrada.nextInt();
        double precouni2 = entrada.nextDouble();
        double resultado = (uni1 * precouni1) + (uni2 * precouni2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", resultado);

        entrada.close();

    }
}