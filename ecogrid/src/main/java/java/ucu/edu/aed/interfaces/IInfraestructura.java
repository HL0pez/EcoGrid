package java.ucu.edu.aed.interfaces;

import java.ucu.edu.aed.Consumidor;
import java.ucu.edu.aed.NodoEnergia;
import java.ucu.edu.aed.Solicitud;
import java.ucu.edu.aed.tda.implementaciones.Cola;
import java.ucu.edu.aed.tda.implementaciones.ListaEnlazada;
import java.ucu.edu.aed.tda.implementaciones.PilaListaEnlazada;

public interface IInfraestructura {

    Cola<Solicitud> colaSolicitudes = null;
    ListaEnlazada<NodoEnergia> nodos = null;
    ListaEnlazada<Consumidor> consumidores = null;
    PilaListaEnlazada<Solicitud> historialTransacciones = null;

    boolean registrarNodo(NodoEnergia nodo);
    void eliminarNodo(int id);
    NodoEnergia buscarNodo(int id);
    boolean registrarConsumidor(Consumidor consumidor);
    void eliminarConsumidor(int id);
    Consumidor buscarConsumidor(int id);
    void encolarSolicitud(Consumidor consumidor);
    void procesarSolicitud();
    void deshacerUltimaCarga();
    ListaEnlazada<String> listarNodos();
    ListaEnlazada<String> listarConsumidores();
    void encontrarNodoRecomendado(Solicitud solicitud);
    void crearSolicitud(NodoEnergia nodoEnergia, Consumidor consumidor);
}