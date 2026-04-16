package java.ucu.edu.aed;

import java.ucu.edu.aed.tda.implementaciones.Cola;

public class GestionDemanda extends Cola<Consumidor> {

    public GestionDemanda() {
        super();
    }

    public void agregarConsumidor(Consumidor consumidor) {
        this.poneEnCola(consumidor);
    }

    public Consumidor atenderConsumidor(Consumidor consumidor) {
        return this.quitaDeCola();
    }

}
