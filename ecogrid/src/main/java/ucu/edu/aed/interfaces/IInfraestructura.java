package ucu.edu.aed.interfaces;

import ucu.edu.aed.Consumidor;
import ucu.edu.aed.NodoEnergia;
import ucu.edu.aed.Solicitud;
import ucu.edu.aed.tda.implementaciones.ListaEnlazada;

public interface IInfraestructura {


    boolean registrarNodo(NodoEnergia nodo);
    void eliminarNodo(NodoEnergia nodo);
    NodoEnergia buscarNodo(NodoEnergia nodo);
    boolean registrarConsumidor(Consumidor consumidor);
    void eliminarConsumidor(Consumidor cons);
    Consumidor buscarConsumidor(Consumidor cons);
    void encolarSolicitud(Solicitud solicitud);
    void procesarSolicitud();
    void deshacerUltimaCarga();
    ListaEnlazada<String> listarNodos();
    ListaEnlazada<String> listarConsumidores();
    NodoEnergia encontrarNodoRecomendado(Solicitud solicitud);
    Solicitud crearSolicitud(Consumidor consumidor);
}