package org.example;

import java.util.*;

/**
 * Clase Agenda que tiene la lista de contactos y nos permite
 * añadir, modificar y eliminar contactos
 */
public class Agenda {
    private List<Persona> contacts; // Lista de Contacto


    /**
     * Constructor de la clase Agenda
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }


    /**
     * Método para añadir contactos
     * @param name nombre del contacto
     * @param phone número de teléfono del contacto
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Método para eliminar contactos
     * @param name nombre del contacto
     */

    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     *  Método para modificar contactos
     * @param name nombre del contacto
     * @param oldPhone número antiguo
     * @param newPhone número nuevo
     */

    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Lista de contactos que están guardados en la agenda
     * @return lista de contactos
     */

    public List<Persona> getContacts() {
        return this.contacts;
    }
}