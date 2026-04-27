package ucu.edu.aed.interfaces;

public interface INodoEnergia {

int getId();
String getFuente();
int getCapacidadMax();
int getCargaActual();
void setFuente(String fuente);
void setCapacidadMax(int capacidadMax);
void setCargaActual(int cargaActual);
void imprimirNodoEnergia();

}
