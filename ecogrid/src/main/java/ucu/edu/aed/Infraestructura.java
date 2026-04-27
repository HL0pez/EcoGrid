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
    public void eliminarNodo(NodoEnergia nodo) {
        listaNodo.remover(nodo);
    }

    @Override
    public NodoEnergia buscarNodo(NodoEnergia nodo) {
        Nodo<NodoEnergia> nodob = listaNodo.buscar(nodo);

        return nodob.getDato();
    }

    @Override
    public void eliminarConsumidor(Consumidor cons) {
        listaConsumidor.remover(cons);
    }

    @Override
    public Consumidor buscarConsumidor(Consumidor cons) {
        Nodo<Consumidor> nodob = listaConsumidor.buscar(cons);
        return nodob.getDato();
    }

    @Override
    public void encolarSolicitud(Solicitud solicitud) {
        colaSolicitudes.poneEnCola(solicitud);
    }

    @Override
    public void procesarSolicitud() {
        Solicitud solicitud = colaSolicitudes.quitaDeCola();

        NodoEnergia nodoAsignado = encontrarNodoRecomendado(solicitud);
        solicitud.procesar(nodoAsignado);
        
        historialTransacciones.push(solicitud);
    }

    @Override
    public void deshacerUltimaCarga() {
        Solicitud ultimaCarga = historialTransacciones.pop();
        ultimaCarga.nodoEnergia
                .setCargaActual(ultimaCarga.nodoEnergia.getCargaActual() + ultimaCarga.getDemanda());
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
        int demanda = solicitud.getDemanda();
        Nodo<NodoEnergia> actual = listaNodo.getCabeza();

        NodoEnergia mejorNodo = null;
        int menorDif = Integer.MAX_VALUE;

        while (actual != null) {
            int cargaActual = actual.getDato().getCargaActual();
            int diferencia = cargaActual - demanda;

            if (cargaActual >= demanda && diferencia < menorDif) {
                menorDif = diferencia;
                mejorNodo = actual.getDato();

            }
            actual = actual.getSiguiente();
        }
        return mejorNodo;
    }

    @Override
    public void crearSolicitud(Consumidor consumidor) {
        Solicitud solicitud = new Solicitud(consumidor);
        encolarSolicitud(solicitud);
    }

}
