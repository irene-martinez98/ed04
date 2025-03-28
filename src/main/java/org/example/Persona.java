package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Contacto que representa a cada contacto
 * con su nombre y lista de teléfonos
 */
public class Persona {
    private String name;
    private List<String> phones;


    /**
     * Constructor de la clase Contacto
     * @param name nombre del contacto
     * @param phone teléfono del contacto
     */
    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * Devuelve el nombre del contacto
     * @return nombre del contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     * Devuelve la lista de números de teléfono
     * @return lista de número de teléfonos
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}