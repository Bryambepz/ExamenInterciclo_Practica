/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Personas;
import ec.edu.ups.modelo.Rector;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author braya
 */
public class ControladorRector extends ControladorAbstracto<Personas> {
    
    private static ControladorRector instancia;
    private static Rector obtenerSesion;
    
    private ControladorRector() {
//        super();
    }
    

    public boolean inicarSesion(String correo, String contrasenia, String ruta) {
        var iniciar = true;
        try {
            iniciar = cargarDatos(ruta).stream().filter(c -> correo.equals(c.getCorreo()) && contrasenia.equals(c.getContrasenia()))
                    .anyMatch(i -> correo.equals(i.getCorreo()) && contrasenia.equals(i.getContrasenia()));
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ControladorRector.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (iniciar) {
            obtenerSesion = (Rector) getListaObjetos().stream().filter(c -> correo.equals(c.getCorreo()) && contrasenia.equals(c.getContrasenia())).findFirst().get();
            return true;
        }
        return false;
    }

    public static ControladorRector getInstance() {
        if (instancia == null) {
            instancia = new ControladorRector();
        }
        return instancia;
    }
    
    public static Rector obtenerSesionInciada() {
        if (obtenerSesion == null) {
            obtenerSesion = new Rector();
        }
        return obtenerSesion;
    }
//    public boolean comprobarCorreo(String correo) {
//        return getListaObjetos().stream().filter(c -> correo.equals(c.getCorreo())).noneMatch(c -> correo.equals(c.getCorreo()));
//    }
}
