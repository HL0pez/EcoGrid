package java.ucu.edu.aed;

import java.ucu.edu.aed.tda.implementaciones.Nodo;

public class NodoEnergia extends Nodo<NodoEnergia> {

    public int Id;
    public String fuente;
    public int capacidadMax;
    public int cargaActual;

    public NodoEnergia(int Id, String fuente, int capacidadMax, int cargaActual) {
        super(new NodoEnergia(Id, fuente, capacidadMax, cargaActual));
        this.Id = Id;
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

    public void setId(int Id) {
        this.Id = Id;
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
        System.out.println("Id: " + this.Id);
        System.out.println("Fuente: " + this.fuente);
        System.out.println("Capacidad Maxima: " + this.capacidadMax);
        System.out.println("Carga Actual: " + this.cargaActual);
    }
}