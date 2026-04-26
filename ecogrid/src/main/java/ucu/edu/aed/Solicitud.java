package ucu.edu.aed;

import ucu.edu.aed.interfaces.ISolicitud;
import ucu.edu.aed.tda.implementaciones.Cola;
public class Solicitud extends Cola<Consumidor> implements ISolicitud{

    NodoEnergia nodoEnergia;
    Consumidor consumidor;
    int demandaRequerida;

    public Solicitud() {
        super();
    }
    public Solicitud(Consumidor consumidor) {
        this.nodoEnergia = null;
        this.consumidor = consumidor;
        this.demandaRequerida = consumidor.getDemanda();
    }

    @Override
    public void procesar(NodoEnergia nodoEnergia){
        this.nodoEnergia = nodoEnergia;

    }

    @Override
    public NodoEnergia getNodoEnergia() {
        return nodoEnergia;
    }

    @Override
    public Consumidor getConsumidor() {
        return consumidor;
    }
    @Override
    public int getDemandaRequerida() { return demandaRequerida; }

}
