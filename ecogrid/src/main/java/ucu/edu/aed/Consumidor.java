package ucu.edu.aed;
import ucu.edu.aed.interfaces.IConsumidor;

public class Consumidor implements IConsumidor {

    private static int ContadorId = 0;
    private int Id;
    private String Nombre;
    private int prioridad;
    private int demanda;

    public Consumidor( String Nombre, int prioridad, int demanda) {
        
        this.Id = ++ContadorId;
        this.Nombre = Nombre;
        this.prioridad = prioridad;
        this.demanda = demanda;
    }

    @Override
    public int getId() {
        return Id;
    }

    @Override
    public String getNombre() {
        return Nombre;
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
        this.Nombre = Nombre;
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
