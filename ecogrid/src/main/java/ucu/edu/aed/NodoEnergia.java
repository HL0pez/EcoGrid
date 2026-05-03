package ucu.edu.aed;
import ucu.edu.aed.interfaces.INodoEnergia;

public class NodoEnergia implements INodoEnergia {

    private static int ContadorId = 0;
    private int Id;
    private String fuente;
    private int capacidadMax;
    private int cargaActual;

    public NodoEnergia(String fuente, int capacidadMax, int cargaActual) {
        
        this.Id = ++ContadorId;
        this.fuente = fuente;
        this.capacidadMax = capacidadMax;
        this.cargaActual = cargaActual;
    }

    @Override
    public int getId() {
        return Id;
    }

    @Override
    public String getFuente() {
        return fuente;
    }

    @Override
    public int getCapacidadMax() {
        return capacidadMax;
    }

    @Override
    public int getCargaActual() {
        return cargaActual;
    }

    @Override
    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    @Override
    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    @Override
    public void setCargaActual(int nuevaCargaActual) {
        if (nuevaCargaActual > capacidadMax) {
            this.cargaActual = capacidadMax;
        } else {
            this.cargaActual = nuevaCargaActual;
        }
    }

    @Override
    public void imprimirNodoEnergia() {
        System.out.println("------------------------------");
        System.out.println("Id: " + this.Id);
        System.out.println("Fuente: " + this.fuente);
        System.out.println("Capacidad Maxima: " + this.capacidadMax);
        System.out.println("Carga Actual: " + this.cargaActual);
    }
}