package ucu.edu.aed;

import ucu.edu.aed.interfaces.IInfraestructura;
import ucu.edu.aed.tda.implementaciones.Cola;
import ucu.edu.aed.tda.implementaciones.ListaEnlazada;
import ucu.edu.aed.tda.implementaciones.Nodo;
import ucu.edu.aed.tda.implementaciones.PilaListaEnlazada;

public class Infraestructura<T> implements IInfraestructura {

    private ListaEnlazada<NodoEnergia> listaNodo;
    private ListaEnlazada<Consumidor> listaConsumidor;
    private Cola<Solicitud> colaSolicitudes;
    private PilaListaEnlazada<Solicitud> historialTransacciones;

    private static Infraestructura instancia = null;

    private Infraestructura() {
        this.listaNodo = new ListaEnlazada<>();
        this.listaConsumidor = new ListaEnlazada<>();
        this.colaSolicitudes = new Cola<>();
        this.historialTransacciones = new PilaListaEnlazada<>();
    }

    public static Infraestructura getInstancia() {
        if (instancia == null) {
            instancia = new Infraestructura();
        }
        return instancia;
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

    public ListaEnlazada<String> listarNodos() {
        ListaEnlazada<String> resultado = new ListaEnlazada<>();
        Nodo<NodoEnergia> nodoActual = listaNodo.getCabeza();
        while (nodoActual != null) {
            resultado.agregar(nodoActual.getDato().toString());

            nodoActual = nodoActual.getSiguiente();

        }
        return resultado;
    }

    public void eliminarNodo(NodoEnergia nodo) {
        listaNodo.remover(nodo);
    }

    public Nodo buscarNodo(NodoEnergia nodo) {
        return listaNodo.buscar(nodo);
    }

    public void eliminarConsumidor(Consumidor cons) {
        listaConsumidor.remover(cons);
    }

    public Nodo buscarConsumidor(Consumidor cons) {
        return listaConsumidor.buscar(cons);
    }

    @Override
    public void encolarSolicitud(Solicitud solicitud) {
        colaSolicitudes.poneEnCola(solicitud);
    }

    @Override
    public void procesarSolicitud() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'procesarSolicitud'");
    }

    @Override
    public void deshacerUltimaCarga() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deshacerUltimaCarga'");
    }

    @Override
    public ListaEnlazada<String> listarConsumidores() {
        ListaEnlazada<String> resultado = new ListaEnlazada<>();
        Nodo<Consumidor> consumidorActual = listaConsumidor.getCabeza();
        while (consumidorActual != null) {
            resultado.agregar(consumidorActual.getDato().toString());

            consumidorActual = consumidorActual.getSiguiente();

        }
        return resultado;
    }

    @Override
    public NodoEnergia encontrarNodoRecomendado(Solicitud solicitud) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'encontrarNodoRecomendado'");
    }

    @Override
    public void crearSolicitud(Consumidor consumidor) {
        Solicitud solicitud = new Solicitud(consumidor);
        encolarSolicitud(solicitud);
    }

}
