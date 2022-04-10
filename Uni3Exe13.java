import java.util.Scanner;

public class Uni3Exe13 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Read an integer value,
        // which is the duration in seconds of a certain event in a factory,
        // and inform it expressed in hours:minutes:seconds.

        int totalsegundos = leitor.nextInt();
        int horas = totalsegundos / 3600;
        int restoHoras = totalsegundos % 3600;
        int minutos = restoHoras / 60;
        int restoMinutos = restoHoras % 60;
        int segundos = restoMinutos;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        leitor.close();

    }

}
