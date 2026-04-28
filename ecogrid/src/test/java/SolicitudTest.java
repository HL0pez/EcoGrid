import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.aed.Consumidor;
import ucu.edu.aed.NodoEnergia;
import ucu.edu.aed.Solicitud;

import static org.junit.jupiter.api.Assertions.*;

public class SolicitudTest {

    NodoEnergia nodo;
    Consumidor consumidor;
    Solicitud solicitud;

    @BeforeEach
    void setUp() {
        nodo = new NodoEnergia("Solar", 100, 80);
        consumidor = new Consumidor("Casa", 3, 50);
        solicitud = new Solicitud(consumidor);;
    }

    @Test
    void testGetters() {
        assertEquals(consumidor, solicitud.getConsumidor());
        assertEquals(50, solicitud.getDemanda());
        solicitud.procesar(nodo);
        assertEquals(nodo, solicitud.getNodoEnergia());
    }

    @Test
    void testProcesar() {
        solicitud.procesar(nodo);
        assertEquals(30, solicitud.getNodoEnergia().getCargaActual());
    }
}
