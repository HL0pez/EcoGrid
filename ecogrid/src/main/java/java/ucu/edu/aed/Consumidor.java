package java.ucu.edu.aed;

public class Consumidores {

    public int Id;
    public String Nombre;
    public int prioridad;
    public int demanda;

    public Consumidores(int Id, String Nombre, int prioridad, int demanda) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.prioridad = prioridad;
        this.demanda = demanda;
    }
}
