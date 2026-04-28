
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ucu.edu.aed.NodoEnergia;

public class NodoEnergiaTest {
    
    NodoEnergia nodo;
    
    @BeforeEach
    void setUp() {
        nodo = new NodoEnergia("Solar", 100, 50);
    }
    
    @Test
    void testGetters() {
        assertEquals("Solar", nodo.getFuente());
        assertEquals(100, nodo.getCapacidadMax());
        assertEquals(50, nodo.getCargaActual());
        assertTrue(nodo.getId() > 0);
    }

    @Test
    void testSetFuente() {
        nodo.setFuente("Eolica");

        assertEquals("Eolica", nodo.getFuente());
    }

    @Test
    void testSetCapacidadMax() {
        nodo.setCapacidadMax(200);

        assertEquals(200, nodo.getCapacidadMax());
    }

    @Test
    void testSetCargaActualDentroDeCapacidad() {
        nodo.setCargaActual(30);
        assertEquals(30, nodo.getCargaActual());
    }

    @Test
    void testSetCargaActualSuperaCapacidad() {
        nodo.setCargaActual(110);

        assertEquals(100, nodo.getCargaActual());
    }

    @Test
    void testSetCargaActualIgualCapacidad() {
        nodo.setCargaActual(100);

        assertEquals(100, nodo.getCargaActual());
    }

}