import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.print("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.print("Nota Inválida! Digita novamente: ");
            nota = scan.nextInt();

        }

    }

}
