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

    //Este metodo calcula el tiempo que el cliente esta
        public int tiempomedio(int temps){
            this.tiempo = temps;
            return temps;
        }
    //Este metodo abisa que la cola esta libre
        public synchronized void desocuparCua( int tria_cua ) {
            this.cajas[tria_cua] = false;
            notify();
        }
    //solo devuelbe el numero de cajas
        public int getNumCaixes() {
            return nuncaixes;
        }
    //calcula lo que hay que pagar que es introducido un valor aleatorio por el tiempo que el cliente lleva en el supermercado
        public double Pagar(int tot) {
            total = tot*tiempo;
            return total;
         }
}


