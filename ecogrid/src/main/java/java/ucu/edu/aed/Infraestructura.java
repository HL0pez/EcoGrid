package java.ucu.edu.aed;

import java.ucu.edu.aed.tda.implementaciones.ListaEnlazada;
import java.ucu.edu.aed.tda.implementaciones.Nodo;
import java.ucu.edu.aed.tda.implementaciones.Cola;
import java.ucu.edu.aed.tda.implementaciones.PilaListaEnlazada;
import java.ucu.edu.aed.interfaces.IInfraestructura;

public class Infraestructura<T> implements IInfraestructura {

    ListaEnlazada<NodoEnergia> listaNodo = new ListaEnlazada<>();
    ListaEnlazada<Consumidor> listaConsumidor = new ListaEnlazada<>();
    Cola<Solicitud> colaSolicitudes = new Cola<>();
    PilaListaEnlazada<Solicitud> historialTransacciones = new PilaListaEnlazada<>();

    public Infraestructura() {
        this.listaNodo = new ListaEnlazada<NodoEnergia>();
        this.listaConsumidor = new ListaEnlazada<Consumidor>();
        this.colaSolicitudes = new Cola<Solicitud>();
        this.historialTransacciones = new PilaListaEnlazada<Solicitud>();
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
    public ListaEnlazada<String> listaNodos() {
        ListaEnlazada<String> resultado = new ListaEnlazada<>();
        Nodo<NodoEnergia> nodoActual = listaNodo.getCabeza();
        while (nodoActual != null) {
            resultado.agregar(nodoActual.getDato().toString());
            nodoActual = nodoActual.getSiguiente();
        }
        return resultado;
    }

}
