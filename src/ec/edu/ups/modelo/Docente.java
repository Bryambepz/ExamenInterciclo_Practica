/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author braya
 */
public class Docente extends Personas implements Serializable{
    
    private String cursoAsignado;
    private List<Estudiante> listaEstudiantes = listaEstudiantes = new ArrayList<>();;

    public Docente() {}

    public Docente(String cursoAcargo, List<Estudiante> listaEstudiantes, String cedula, String nombre, String apellido, int edad, String telefono, String correo, String contrasenia) {
        super(cedula, nombre, apellido, edad, telefono, correo, contrasenia);
        this.cursoAsignado = cursoAcargo;
        this.listaEstudiantes = listaEstudiantes;
    }

    public Docente(String cursoAsignado, String cedula, String nombre, String apellido, int edad, String telefono, String correo, String contrasenia) {
        super(cedula, nombre, apellido, edad, telefono, correo, contrasenia);
        this.cursoAsignado = cursoAsignado;
        
    }

    public String getCursoAcargo() {
        return cursoAsignado;
    }

    public void setCursoAcargo(String cursoAcargo) {
        this.cursoAsignado = cursoAcargo;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
    
    public boolean createEstudiante(Estudiante estudiante){
        return listaEstudiantes.add(estudiante);
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.cursoAsignado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Docente other = (Docente) obj;
        if (!Objects.equals(this.cursoAsignado, other.cursoAsignado)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n------==> Docente{" + "cursoAcargo=" + cursoAsignado + ", listaEstudiantes=" + listaEstudiantes + '}';
    }
    
}
