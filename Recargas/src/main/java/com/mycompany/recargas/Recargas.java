
package com.mycompany.recargas;

import com.mycompany.Persistencia.CelularJpaController;
import com.mycompany.Persistencia.ClienteJpaController;
import com.mycompany.Persistencia.RecargasJpaController;

public class Recargas {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            
            CelularJpaController jpaCelular = new CelularJpaController();
            ClienteJpaController jpaCliente = new ClienteJpaController();
            RecargasJpaController jpaRecargas = new RecargasJpaController();

            System.out.println("Tablas creadas correctamente.");
        } catch (Exception e) {
            System.out.println("Error al crear las tablas: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
