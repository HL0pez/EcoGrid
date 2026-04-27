package ucu.edu.aed.interfaces;

import ucu.edu.aed.Consumidor;
import ucu.edu.aed.NodoEnergia;

public interface ISolicitud {
    void procesar(NodoEnergia nodoEnergia);
    NodoEnergia getNodoEnergia();
    Consumidor getConsumidor();
    int getDemanda();
}
