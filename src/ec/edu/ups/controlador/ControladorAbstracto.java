/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author braya
 * @param <T>
 */
public abstract class ControladorAbstracto<T> {
    private List<T> listaObjetos = new ArrayList<>();

    public ControladorAbstracto() {
        listaObjetos = new ArrayList<>();
    }
    
    public List<T> cargarDatos(String ruta) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archivo = new FileInputStream(ruta);
        ObjectInputStream datos = new ObjectInputStream(archivo);
        return listaObjetos = (List<T>) datos.readObject();
//        System.out.println(listaObjetos);
    }
    
    public void guardardatos(String ruta) throws FileNotFoundException, IOException{
        FileOutputStream archivo = new FileOutputStream(ruta);
        ObjectOutputStream datos = new ObjectOutputStream(archivo);
        datos.writeObject(listaObjetos);
    }
    
    public boolean create(T objeto){
        return listaObjetos.add(objeto);
    }
    
    public T read(String stringBuscar){
        return listaObjetos.stream().filter(buscar -> stringBuscar.equals(buscar)).findFirst().get();
    }
    
    public boolean comprobarCorreo(String correo) {
        return listaObjetos.stream().filter(c -> correo.equals(c)).noneMatch(c -> correo.equals(c));

    }
    
    public boolean comprobarCorreo(String correo, String ruta) {
        try {
            return cargarDatos(ruta).stream().filter(c -> correo.equals(c)).noneMatch(c -> correo.equals(c));
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ControladorAbstracto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public List<T> findAll(){
        return listaObjetos;
    }
    public List<T> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<T> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }
    
}
