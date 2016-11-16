import java.util.Random;

/**
 * Created by Dionis on 03/11/2015.
 */
public class Client extends Thread {

    int numero = 0;
    int temps = 0;
    Cua cua = null;
    double tempsmig;
    double preu;


    public Client(int n, Cua cues) {
        this.numero = n;
        this.cua = cues;
    }

    public void run(){
        Random rd = new Random();
        this.temps = rd.nextInt(1500);
        try {
            sleep(temps);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int tria_cua = rd.nextInt(cua.getNumCaixes());
        try {
            cua.ocuparcua(tria_cua);
            sleep(rd.nextInt(150));
            tempsmig =cua.tiempomedio(temps + temps/2);
            preu = cua.Pagar(rd.nextInt(250));
            cua.desocuparCua(tria_cua);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Soc el client: "+this.numero+" i he trigat a comprar "+temps+" He pagat"+preu+" en la caixa "+tria_cua);


    }
}
