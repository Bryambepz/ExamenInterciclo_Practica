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
public class Docente extends Personas{
    
    private String cursoAcargo;
    private List<Estudiante> listaEstudiantes;

    public Docente() {listaEstudiantes = new ArrayList<>();}

    public Docente(String cursoAcargo, List<Estudiante> listaEstudiantes, String cedula, String nombre, String apellido, int edad, String telefono, String correo, String contrasenia) {
        super(cedula, nombre, apellido, edad, telefono, correo, contrasenia);
        this.cursoAcargo = cursoAcargo;
        this.listaEstudiantes = listaEstudiantes;
    }

    public String getCursoAcargo() {
        return cursoAcargo;
    }

    public void setCursoAcargo(String cursoAcargo) {
        this.cursoAcargo = cursoAcargo;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Docente{" + "cursoAcargo=" + cursoAcargo + ", listaEstudiantes=" + listaEstudiantes + '}';
    }
    
}
