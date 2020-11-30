/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author braya
 */
public class Rector extends Personas{
    private String UnidadEducativa;
    
    private List<Estudiante> listaEstudiante;
    private List<Docente> listaDocentes;

    public Rector() {
        listaDocentes = new ArrayList<>();
        listaEstudiante = new ArrayList<>();
    }

    public Rector(String UnidadEducativa, List<Estudiante> listaEstudiante, List<Docente> listaDocentes, String cedula, String nombre, String apellido, int edad, String telefono, String correo, String contrasenia) {
        super(cedula, nombre, apellido, edad, telefono, correo, contrasenia);
        this.UnidadEducativa = UnidadEducativa;
        this.listaEstudiante = listaEstudiante;
        this.listaDocentes = listaDocentes;
    }

    public String getUnidadEducativa() {
        return UnidadEducativa;
    }

    public void setUnidadEducativa(String UnidadEducativa) {
        this.UnidadEducativa = UnidadEducativa;
    }

    public List<Estudiante> getListaEstudiante() {
        return listaEstudiante;
    }

    public void setListaEstudiante(List<Estudiante> listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }

    public List<Docente> getListaDocentes() {
        return listaDocentes;
    }

    public void setListaDocentes(List<Docente> listaDocentes) {
        this.listaDocentes = listaDocentes;
    }

    @Override
    public String toString() {
        return "Rector{" + "UnidadEducativa=" + UnidadEducativa + ", listaEstudiante=" + listaEstudiante + ", listaDocentes=" + listaDocentes + '}';
    }
    
}
