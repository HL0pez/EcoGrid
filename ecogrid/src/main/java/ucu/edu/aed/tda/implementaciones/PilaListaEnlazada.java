package ucu.edu.aed.tda.implementaciones;
import ucu.edu.aed.tda.interfaces.TDAPila;

public class PilaListaEnlazada<T> extends ListaEnlazada<T> implements TDAPila<T> {

    @Override
    public void push(T elem) {
        Nodo<T> nuevoNodo = new Nodo<>(elem);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
    }

    @Override
    public T pop() {
        if (cabeza == null) {
            return null;
        }
        T dato = cabeza.getDato();
        cabeza = cabeza.getSiguiente();
        return dato;
    }

    @Override
    public T peek() {
        if (cabeza == null) {
            return null;
        }
        return cabeza.getDato();
    }


}
