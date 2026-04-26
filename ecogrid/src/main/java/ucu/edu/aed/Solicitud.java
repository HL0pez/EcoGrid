package ucu.edu.aed;

import ucu.edu.aed.interfaces.ISolicitud;
import ucu.edu.aed.tda.implementaciones.Cola;
public class Solicitud extends Cola<Consumidor> implements ISolicitud{

    NodoEnergia nodoEnergia;
    Consumidor consumidor;

    public Solicitud() {
        super();
    }

    @Override
    public void procesar(NodoEnergia nodoEnergia){

    }
}
