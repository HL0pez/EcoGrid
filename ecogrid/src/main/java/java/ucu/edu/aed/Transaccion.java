package java.ucu.edu.aed;

import java.ucu.edu.aed.tda.implementaciones.ListaEnlazada;
import java.ucu.edu.aed.tda.implementaciones.Nodo;

public class Transaccion<T> extends ListaEnlazada<T> {

    Nodo<NodoEnergia> nodoEnergia;

    Nodo<Consumidor> nodoConsumidor;

    public Transaccion() {
        this.nodoEnergia = null;
        this.nodoConsumidor = null;
    }

    public void procesar() {
    }

}
