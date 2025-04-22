package cuatro.cuatroTest;

import cuatro.Persona;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Agenda de contactos:
        Implementa una agenda de contactos en la que se puedan guardar los datos de una persona, como nombre,
        número de teléfono y dirección. Utiliza la serialización para guardar y cargar la lista de contactos
        desde un archivo. Agrega métodos para agregar contactos, buscar por nombre y mostrar la lista completa.*/

        Persona personaUno = new Persona("Sandra", 123456L, "Lanus");
        Persona personaDos = new Persona("Camila", 789456L, "Remedios de Escalada");
        Persona personaTres = new Persona("Lola", 456189L, "Lomas de zamora");

        List<Persona> listaPersonas = new ArrayList<>();


    }
}
