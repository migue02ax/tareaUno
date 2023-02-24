import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre, profesion como tu país");
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.nextLine();
        String[] separado = entrada.toUpperCase().split(" ");

        System.out.println("nombre: " + separado[0]);
        System.out.println("profesion: " + separado[1]);
        System.out.println("país: " + separado[2]);

    }
}