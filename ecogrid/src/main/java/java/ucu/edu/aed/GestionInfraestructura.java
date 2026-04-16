package java.ucu.edu.aed;

import java.ucu.edu.aed.tda.implementaciones.ListaEnlazada;
import java.ucu.edu.aed.tda.implementaciones.Nodo;

public class GestionInfraestructura<T> extends ListaEnlazada<T> {

    ListaEnlazada<NodoEnergia> listaNodo = new ListaEnlazada<>();
    ListaEnlazada<Consumidor> listaConsumidor = new ListaEnlazada<>();

    public GestionInfraestructura(ListaEnlazada<NodoEnergia> listaNodo, ListaEnlazada<Consumidor> listaConsumidor) {
        super();
        this.listaNodo = listaNodo;
        this.listaConsumidor = listaConsumidor;
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
