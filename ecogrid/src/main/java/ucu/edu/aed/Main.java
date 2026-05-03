package ucu.edu.aed;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ucu.edu.aed.tda.implementaciones.ListaEnlazada;

public class Main {
    public static void main(String[] args) throws IOException {

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

        BufferedReader bReader = new BufferedReader(new FileReader("datos.txt"));
        bReader.readLine(); 
        String linea;
        while ((linea = bReader.readLine()) != null) {
        String[] partes = linea.split(",");
        if (partes[0].equals("nodo")) {
            infra.registrarNodo(new NodoEnergia(partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3])));
        } else if (partes[0].equals("consumidor")) {
            infra.registrarConsumidor(new Consumidor(partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3])));
        }
    }
    bReader.close();

    }
}