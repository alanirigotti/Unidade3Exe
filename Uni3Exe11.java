import java.util.Scanner;

public class Uni3Exe11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int kilometro = entrada.nextInt();
        int resultado = (kilometro * 2);
        System.out.println(resultado + " minutos");
        
        entrada.close();
    }
    
}
