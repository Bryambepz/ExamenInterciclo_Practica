/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author braya
 */
public class Rector extends Personas implements Serializable{
    private String UnidadEducativa;
    
//    private List<Estudiante> listaEstudiante;
    private List<Docente> listaDocentes;

    public Rector() {
        listaDocentes = new ArrayList<>();
//        listaEstudiante = new ArrayList<>();
    }

    public Rector(String UnidadEducativa, List<Docente> listaDocentes, String cedula, String nombre, String apellido, int edad, String telefono, String correo, String contrasenia) {
        super(cedula, nombre, apellido, edad, telefono, correo, contrasenia);
        this.UnidadEducativa = UnidadEducativa;
//        this.listaEstudiante = listaEstudiante;
        this.listaDocentes = listaDocentes;
        listaDocentes = new ArrayList<>();
//        listaEstudiante = new ArrayList<>();
    }

    public Rector(String UnidadEducativa, String cedula, String nombre, String apellido, int edad, String telefono, String correo, String contrasenia) {
        super(cedula, nombre, apellido, edad, telefono, correo, contrasenia);
        this.UnidadEducativa = UnidadEducativa;
        listaDocentes = new ArrayList<>();
//        listaEstudiante = new ArrayList<>();
    }
    
    

    public String getUnidadEducativa() {
        return UnidadEducativa;
    }

    public void setUnidadEducativa(String UnidadEducativa) {
        this.UnidadEducativa = UnidadEducativa;
    }

//    public List<Estudiante> getListaEstudiante() {
//        return listaEstudiante;
//    }
//
//    public void setListaEstudiante(List<Estudiante> listaEstudiante) {
//        this.listaEstudiante = listaEstudiante;
//    }

    public List<Docente> getListaDocentes() {
        return listaDocentes;
    }

    public void setListaDocentes(List<Docente> listaDocentes) {
        this.listaDocentes = listaDocentes;
    }

    public boolean createDocente(Docente doc){
        return listaDocentes.add(doc);
    }
    
//    public boolean createEstudiante(Estudiante est){
//        return listaEstudiante.add(est);
//    }
//    
//    public Docente read(String nombre){
//        return listaDocentes.stream().filter(d -> nombre.equals(d.getNombre())).findFirst().get();
//    }
    
//    public Docente readD(String docente){
//        var docente = listaDocentes.stream().filter(d -> docente.equals(d.getNombre())).findFirst().get();
//    }
    
    @Override
    public String toString() {
        return super.toString() + "\n------==> Rector{" + "UnidadEducativa=" + UnidadEducativa + ", listaDocentes=" + listaDocentes + '}';
    }
    
}
