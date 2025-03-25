package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Contacto representa un contacto con un nombre y una lista de números de teléfono.
 *
 * @author TuNombre
 * @version 1.0
 * @since 2025
 */
public class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Constructor que inicializa un contacto con un nombre y un número de teléfono.
     *
     * @param name el nombre del contacto
     * @param phone el número de teléfono inicial del contacto
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return el nombre del contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtiene la lista de números de teléfono del contacto.
     *
     * @return la lista de números de teléfono
     */
    public List<String> getPhones() {
        return this.phones;
    }
}