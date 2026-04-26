package ucu.edu.aed.interfaces;

public interface IConsumidor {

int getId();
String getNombre();
int getPrioridad();
int getDemanda();
void setNombre(String nombre);
void setPrioridad(int prioridad);
void setDemanda(int demanda);
}

