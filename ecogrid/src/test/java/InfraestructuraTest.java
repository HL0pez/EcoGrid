import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.aed.Consumidor;
import ucu.edu.aed.Infraestructura;
import ucu.edu.aed.NodoEnergia;
import ucu.edu.aed.Solicitud;

public class InfraestructuraTest {

    private Infraestructura infraestructura;
    private Consumidor consumidor;
    private NodoEnergia nodo1;
    private NodoEnergia nodo2;

    @BeforeEach
    void setUp() {
        infraestructura = Infraestructura.getInstancia();
        
        infraestructura.getColaSolicitudes().vaciar();;
        while (!infraestructura.getHistorial().esVacia()) {
            infraestructura.getHistorial().pop();
        }

        consumidor = new Consumidor("Casa", 1 ,23);
        nodo1 = new NodoEnergia("Solar", 100 , 23);
        nodo2 = new NodoEnergia("Eólica", 50, 35);

        infraestructura.registrarConsumidor(consumidor);
        infraestructura.registrarNodo(nodo1);
        infraestructura.registrarNodo(nodo2);
    }

    @Test
    void testCrearSolicitudEncolaSolicitud() {
        infraestructura.crearSolicitud(consumidor);

        assertFalse(infraestructura.getColaSolicitudes().esVacio());
    }

    @Test
    void testEncolarSolicitudManual() {
        Solicitud s = new Solicitud(consumidor);
        infraestructura.encolarSolicitud(s);

        assertFalse(infraestructura.getColaSolicitudes().esVacio());
    }

    @Test
    void testProcesarSolicitudMueveAHistorial() {
        infraestructura.crearSolicitud(consumidor);
        infraestructura.procesarSolicitud();

        assertTrue(infraestructura.getColaSolicitudes().esVacio());
        assertFalse(infraestructura.getHistorial().esVacia());
    }

    @Test
    void testDeshacerUltimaCargaRevierteHistorial() {
        infraestructura.crearSolicitud(consumidor);
        infraestructura.procesarSolicitud();

        int sizeAntes = infraestructura.getHistorial().tamaño();

        infraestructura.deshacerUltimaCarga();

        int sizeDespues = infraestructura.getHistorial().tamaño();

        assertEquals(sizeAntes - 1, sizeDespues);
    }

    @Test
    void testRegistrarNodoNoDuplicado() {
        boolean resultado = infraestructura.registrarNodo(nodo1);

        assertFalse(resultado);
    }

    @Test
    void testRegistrarConsumidorNoDuplicado() {
        boolean resultado = infraestructura.registrarConsumidor(consumidor);

        assertTrue(resultado);
    }

    @Test
    void testEncontrarNodoRecomendadoDevuelveNodoValido() {
        Solicitud solicitud = new Solicitud(consumidor);

        NodoEnergia nodo = infraestructura.encontrarNodoRecomendado(solicitud);

        assertNotNull(nodo);
    }

    @Test
    void testProcesarSolicitudProcesaPrioridad() {
        Consumidor consumidorBajaPrioridad = new Consumidor("Escuela", 1, 10);
        Consumidor consumidorAltaPrioridad = new Consumidor("Empresa", 5, 10);

        infraestructura.registrarConsumidor(consumidorBajaPrioridad);
        infraestructura.registrarConsumidor(consumidorAltaPrioridad);

        Solicitud solicitudBaja = new Solicitud(consumidorBajaPrioridad);
        Solicitud solicitudAlta = new Solicitud(consumidorAltaPrioridad);

        infraestructura.encolarSolicitud(solicitudAlta);
        infraestructura.encolarSolicitud(solicitudBaja);

        infraestructura.procesarSolicitud();

        Solicitud procesada = infraestructura.getHistorial().peek();

        assertNotNull(procesada);
        assertEquals(1, procesada.getPrioridad());
        assertEquals(consumidorBajaPrioridad, procesada.getConsumidor());
    }

    @Test
    void testProcesarSolicitudSinSolicitudes_noRompe() {
        assertDoesNotThrow(() -> infraestructura.procesarSolicitud());
    }

    @Test
    void testDeshacerSinHistorialNoRompe() {
        assertThrows(Exception.class, () -> infraestructura.deshacerUltimaCarga());
    }


}