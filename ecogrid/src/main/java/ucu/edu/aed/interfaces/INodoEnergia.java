package ucu.edu.aed.interfaces;

public interface INodoEnergia {

static int ContadorId = 0;
int Id = 0;
String fuente = "";
int capacidadMax = 0;
int cargaActual = 0;

int getId();
String getFuente();
int getCapacidadMax();
int getCargaActual();
void setFuente(String fuente);
void setCapacidadMax(int capacidadMax);
void setCargaActual(int cargaActual);
void imprimirNodoEnergia();

}
