import java.util.Scanner;

class Uni3Exe09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();
        double retangulot = (A*C) / 2;
        double circulo = 3.14159 *(C*C);
        double trapezio = ((A*B) *C) / 2;
        double quadrado = B*B;
        double retangulo = A*B;

        System.out.print(String.format("TRIANGULO: %.3f", retangulot));
        System.out.print(String.format("CIRCULO: %.3f", circulo));
        System.out.print(String.format("TRAPEZIO: %.3f", trapezio));
        System.out.print(String.format("QUADRADO: %.3f", quadrado));
        System.out.print(String.format("RETANGULO: %.3f", retangulo));

        entrada.close();

    }
}