package ucu.edu.aed;

import ucu.edu.aed.tda.implementaciones.ListaEnlazada;

public class Main {
    public static void main(String[] args) {

        NodoEnergia ne1 = new NodoEnergia(null, 1, 1);
        NodoEnergia ne2 = new NodoEnergia(null, 2, 2);
        NodoEnergia ne3 = new NodoEnergia(null, 3, 3);

        ListaEnlazada<NodoEnergia> listaNodoE = new ListaEnlazada<>();

        listaNodoE.agregar(ne3);
        listaNodoE.agregar(ne2);
        listaNodoE.agregar(ne1);

        Consumidor c1 = new Consumidor("Miriam", 1, 2);

        // listaNodoE.buscar(ne1);
        System.out.println(listaNodoE.tamaño());
        listaNodoE.remover(ne3);
        System.out.println(listaNodoE.tamaño());
        
        Infraestructura infra = Infraestructura.getInstancia();
        infra.crearSolicitud(c1);

    }
}