import java.io.IOException;
import java.util.Scanner;

public class Uni3Exe12 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cedulas = leitor.nextInt();
        int notas = cedulas;
        int notas100 = notas / 100;
        notas -= notas100 * 100;
        int notas50 = notas / 50;
        notas -= notas50 * 50;
        int notas20 = notas / 20;
        notas -= notas20 * 20;
        int notas10 = notas / 10;
        notas -= notas10 * 10;
        int notas5 = notas / 5;
        notas -= notas5 * 5;
        int notas2 = notas / 2;
        notas -= notas2 * 2;
        int notas1 = notas;
        
        System.out.println(cedulas);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");

        leitor.close();
    }
	
}