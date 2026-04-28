package ucu.edu.aed.interfaces;

public interface IConsumidor {

static int ContadorId = 0;
int Id = 0;
String Nombre = "";
int prioridad = 0;
int demanda = 0;

int getId();
String getNombre();
int getPrioridad();
int getDemanda();
void setNombre(String nombre);
void setPrioridad(int prioridad);
void setDemanda(int demanda);
}

