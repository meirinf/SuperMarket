import java.util.Scanner;

/**
 * Created by 53638138e on 09/11/16.
 */

public class Supermarket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de caixes:");
        int caixes = Integer.parseInt(sc.nextLine());
        System.out.println("Nombre de clients:");
        int clients = Integer.parseInt(sc.nextLine());

        Cua cues = new Cua(caixes);

        Client clientela[] = new Client[clients];
        for (int j = 0; j < clients; j++) {
            clientela[j] = new Client(j,cues);
            clientela[j].start();
        }

        sc.close();
    }

}
