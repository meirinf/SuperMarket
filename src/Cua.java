import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by 53638138e on 09/11/16.
 */
public class Cua {

    //Variables del objeto cua

    private double tiempo;
    private int nuncaixes;
    private boolean [] cajas;
    private double total;

    //Constructor

    public Cua( int caixa) {
        this.nuncaixes = caixa;
        this.cajas = new boolean[nuncaixes];
    }

    //Metodos

    //Metodo ocupar cola que se encarga de llenar la array de Clientes en la cola
    public void ocuparcua(int elejir_cola) {
        if (!cajas[elejir_cola]) {
            this.cajas[elejir_cola] = true;
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //Getters

        public int tiempomedio(int temps){

            tiempo = + (temps /2)/2;
            return temps/2;
        }

        public synchronized void desocuparCua( int tria_cua ) {
            this.cajas[tria_cua] = false;
            notify();
        }

        public int getNumCaixes() {
            return nuncaixes;
        }

        public double Pagar(int tot) {
            total = tot*tiempo;
            return total;
         }
}


