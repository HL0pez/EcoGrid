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

    @Override
    public void eliminarNodo(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarNodo'");
    }

    @Override
    public NodoEnergia buscarNodo(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarNodo'");
    }

    @Override
    public void eliminarConsumidor(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarConsumidor'");
    }

    @Override
    public Consumidor buscarConsumidor(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarConsumidor'");
    }

    @Override
    public void encolarSolicitud(Consumidor consumidor){
        Solicitud solicitud = consumidor.crearSolicitud();
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarConsumidores'");
    }

    @Override
    public void encontrarNodoRecomendado(Solicitud solicitud) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'encontrarNodoRecomendado'");
    }

    @Override
    public void crearSolicitud(NodoEnergia nodoEnergia, Consumidor consumidor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearSolicitud'");
    }

}
