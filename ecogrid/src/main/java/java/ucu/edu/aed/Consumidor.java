package java.ucu.edu.aed;

import java.ucu.edu.aed.tda.implementaciones.Nodo;

public class Consumidor extends Nodo {

    public int Id;
    public String Nombre;
    public int prioridad;
    public int demanda;

    public Consumidor(int Id, String Nombre, int prioridad, int demanda) {
        super(new Consumidor(Id, Nombre, prioridad, demanda));

        this.Id = Id;
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

    public void setId(int Id) {
        this.Id = Id;
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
