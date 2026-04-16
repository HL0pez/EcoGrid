package java.ucu.edu.aed;

public class NodoEnergia{

    private static int ContadorId = 0;
    public int Id;
    public String fuente;
    public int capacidadMax;
    public int cargaActual;

    public NodoEnergia(String fuente, int capacidadMax, int cargaActual) {
        
        this.Id = ++ContadorId;
        this.fuente = fuente;
        this.capacidadMax = capacidadMax;
        this.cargaActual = cargaActual;
    }

    public int getId() {
        return Id;
    }

    public String getFuente() {
        return fuente;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public void imprimirNodoEnergia() {
        System.out.println("------------------------------");
        System.out.println("Id: " + this.Id);
        System.out.println("Fuente: " + this.fuente);
        System.out.println("Capacidad Maxima: " + this.capacidadMax);
        System.out.println("Carga Actual: " + this.cargaActual);
    }
}