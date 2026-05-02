package ucu.edu.aed.tda.interfaces;

public interface TDAColaPrioridad<T> {

    boolean esVacio();
    
    public void vaciar();

    public void insertar(T dato, int prioridad);

    public T quitar();

    public T frente() ;
}
