import java.util.Scanner;

public class Uni3Exe10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();
        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();

        double distancia = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

        System.out.println(String.format("%.4f", distancia));

        entrada.close();

    }
}
