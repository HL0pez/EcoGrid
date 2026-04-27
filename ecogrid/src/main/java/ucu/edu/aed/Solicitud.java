package ucu.edu.aed;

import ucu.edu.aed.interfaces.ISolicitud;

public class Solicitud implements ISolicitud {

    NodoEnergia nodoEnergia;
    Consumidor consumidor;


    public Solicitud(Consumidor consumidor) {
        this.nodoEnergia = null;
        this.consumidor = consumidor;
    }

    @Override
    public void procesar(NodoEnergia nodoEnergia) {
        this.nodoEnergia = nodoEnergia;
        int nuevaCargaActual = nodoEnergia.getCargaActual() - consumidor.getDemanda();
        nodoEnergia.setCargaActual(nuevaCargaActual);
    }

    @Override
    public NodoEnergia getNodoEnergia() {
        return nodoEnergia;
    }

    @Override
    public Consumidor getConsumidor() {
        return consumidor;
    }

    public int getDemanda() {
        return consumidor.getDemanda();
    }


}
