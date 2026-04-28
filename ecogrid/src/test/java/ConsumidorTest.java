import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ucu.edu.aed.Consumidor;

public class ConsumidorTest {

    Consumidor consumidor;

    @BeforeEach
    void setUp(){
        consumidor = new Consumidor("Casa", 2 , 35);
    }

    @Test
    void testGetters(){
        assertEquals("Casa", consumidor.getNombre());
        assertEquals(2, consumidor.getPrioridad());
        assertEquals(35, consumidor.getDemanda());
        assertTrue(consumidor.getId() > 0);        
    }

    @Test
    void testSetters(){
        consumidor.setNombre("Edificio");
        consumidor.setPrioridad(5);
        consumidor.setDemanda(20);
        assertEquals("Edificio", consumidor.getNombre());
        assertEquals(5, consumidor.getPrioridad());
        assertEquals(20, consumidor.getDemanda());
        assertTrue(consumidor.getId() > 0);
    }
}
