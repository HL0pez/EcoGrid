package ucu.edu.aed;
import ucu.edu.aed.interfaces.IConsumidor;

public class Consumidor implements IConsumidor {

    private static int ContadorId = 0;
    public int Id;
    public String Nombre;
    public int prioridad;
    public int demanda;

    public Consumidor( String Nombre, int prioridad, int demanda) {
        
        this.Id = ++ContadorId;
        this.Nombre = Nombre;
        this.prioridad = prioridad;
        this.demanda = demanda;
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public int getDemanda() {
        return demanda;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setDemanda(int demanda) {
        this.demanda = demanda;
    }
}
