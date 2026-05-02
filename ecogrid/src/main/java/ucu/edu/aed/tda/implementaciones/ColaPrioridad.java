package ucu.edu.aed.tda.implementaciones;
import ucu.edu.aed.tda.interfaces.TDAColaPrioridad;

public class ColaPrioridad<T> implements TDAColaPrioridad<T>{

    private NodoPrioridad<T> primero;

    @Override
    public boolean esVacio() {
        return primero == null;
    }
    @Override
    public void vaciar() {
        primero = null;
    }
    @Override
    public void insertar(T dato, int prioridad) {
        NodoPrioridad<T> nuevo = new NodoPrioridad<>(dato, prioridad);

        if (primero == null || prioridad < primero.getPrioridad()) {
            nuevo.setSiguiente(primero);
            primero = nuevo;
            return;
        }

        NodoPrioridad<T> actual = primero;
        while (actual.getSiguiente() != null &&
               actual.getSiguiente().getPrioridad() <= prioridad) {
            actual = actual.getSiguiente();
        }

        nuevo.setSiguiente(actual.getSiguiente());
        actual.setSiguiente(nuevo);
    }
    @Override
    public T quitar() {
        if (esVacio()) return null;

        NodoPrioridad<T> aux = primero;
        primero = primero.getSiguiente();
        return aux.getDato();
    }
    @Override
    public T frente() {
        if (esVacio()) return null;
        return primero.getDato();
    }
}