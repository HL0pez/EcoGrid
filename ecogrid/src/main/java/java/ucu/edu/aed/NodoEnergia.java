package java.ucu.edu.aed;

public class NodosDeEnergia {

    public int Id;
    public String fuente;
    public int capacidadMax;
    public int cargaActual;

    public NodosDeEnergia(int Id, String fuente, int capacidadMax, int cargaActual) {

        this.Id = Id;
        this.fuente = fuente;
        this.capacidadMax = capacidadMax;
        this.cargaActual = cargaActual;
    }

    public void actualizarEnergia() {
    }
}
