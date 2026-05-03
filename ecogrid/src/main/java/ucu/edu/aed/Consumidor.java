package ucu.edu.aed;
import ucu.edu.aed.interfaces.IConsumidor;

public class Consumidor implements IConsumidor {

    private static int contadorId = 0;
    private final int id;
    private String nombre;
    private int prioridad;
    private int demanda;

    public Consumidor( String Nombre, int prioridad, int demanda) {
        
        this.id = ++contadorId;
        this.nombre = Nombre;
        this.prioridad = prioridad;
        this.demanda = demanda;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int getDemanda() {
        return demanda;
    }

    @Override
    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    @Override
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public void setDemanda(int demanda) {
        this.demanda = demanda;
    }
}
