package java.ucu.edu.aed;

import java.ucu.edu.aed.tda.implementaciones.ListaEnlazada;
import java.ucu.edu.aed.tda.implementaciones.Nodo;

public class Infraestructura<T> {

    ListaEnlazada<NodoEnergia> listaNodo = new ListaEnlazada<>();
    ListaEnlazada<Consumidor> listaConsumidor = new ListaEnlazada<>();

    public Infraestructura() {
        this.listaNodo = new ListaEnlazada<NodoEnergia>();
        this.listaConsumidor = new ListaEnlazada<Consumidor>();
    }

    public boolean registrarNodo(NodoEnergia nodo) {
        Nodo<NodoEnergia> nodoExistente = listaNodo.buscar(nodo);
        if (nodoExistente != null) {
            System.out.println("Nodo ya registrado: " + nodoExistente.getDato().toString());
            return false;
        }

        listaNodo.agregar(nodo);
        return true;
    }

    public boolean registrarConsumidor(Consumidor consumidor) {
        Nodo<Consumidor> consumidorExistente = listaConsumidor.buscar(consumidor);
        if (consumidorExistente != null) {
            System.out.println("Consumidor ya registrado: " + consumidorExistente.getDato().toString());
            return false;
        }

        listaConsumidor.agregar(consumidor);
        return true;
    }

}
