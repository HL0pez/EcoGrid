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

    @Override
    public Solicitud crearSolicitud() {
        return new Solicitud(this);
    }
}
