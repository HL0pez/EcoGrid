package java.ucu.edu.aed;

import java.ucu.edu.aed.interfaces.ISolicitud;
import java.ucu.edu.aed.tda.implementaciones.Cola;
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
