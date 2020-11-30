/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Objects;

/**
 *
 * @author braya
 */
public class Estudiante extends Personas{
    private String cedulaRepresentante;
    private String NombreRepresentante;
    private String ApellidoRepresentante;
    private String telefonoRepresentante;
    private int edadRepresentante;
    private String correoRepresentante;
    private String contraseniaRepresentante;
    private String curso;

    public Estudiante() {}

    public Estudiante(String cedulaRepresentante, String NombreRepresentante, String ApellidoRepresentante, String telefonoRepresentante, int edadRepresentante, String correoRepresentante, String contraseniaRepresentante, String curso, String cedula, String nombre, String apellido, int edad, String telefono, String correo, String contrasenia) {
        super(cedula, nombre, apellido, edad, telefono, correo, contrasenia);
        this.cedulaRepresentante = cedulaRepresentante;
        this.NombreRepresentante = NombreRepresentante;
        this.ApellidoRepresentante = ApellidoRepresentante;
        this.telefonoRepresentante = telefonoRepresentante;
        this.edadRepresentante = edadRepresentante;
        this.correoRepresentante = correoRepresentante;
        this.contraseniaRepresentante = contraseniaRepresentante;
        this.curso = curso;
    }

    public String getCedulaRepresentante() {
        return cedulaRepresentante;
    }

    public void setCedulaRepresentante(String cedulaRepresentante) {
        this.cedulaRepresentante = cedulaRepresentante;
    }

    public String getNombreRepresentante() {
        return NombreRepresentante;
    }

    public void setNombreRepresentante(String NombreRepresentante) {
        this.NombreRepresentante = NombreRepresentante;
    }

    public String getApellidoRepresentante() {
        return ApellidoRepresentante;
    }

    public void setApellidoRepresentante(String ApellidoRepresentante) {
        this.ApellidoRepresentante = ApellidoRepresentante;
    }

    public String getTelefonoRepresentante() {
        return telefonoRepresentante;
    }

    public void setTelefonoRepresentante(String telefonoRepresentante) {
        this.telefonoRepresentante = telefonoRepresentante;
    }

    public int getEdadRepresentante() {
        return edadRepresentante;
    }

    public void setEdadRepresentante(int edadRepresentante) {
        this.edadRepresentante = edadRepresentante;
    }

    public String getCorreoRepresentante() {
        return correoRepresentante;
    }

    public void setCorreoRepresentante(String correoRepresentante) {
        this.correoRepresentante = correoRepresentante;
    }

    public String getContraseniaRepresentante() {
        return contraseniaRepresentante;
    }

    public void setContraseniaRepresentante(String contraseniaRepresentante) {
        this.contraseniaRepresentante = contraseniaRepresentante;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.cedulaRepresentante);
        hash = 43 * hash + Objects.hashCode(this.correoRepresentante);
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
        final Estudiante other = (Estudiante) obj;
        if (!Objects.equals(this.cedulaRepresentante, other.cedulaRepresentante)) {
            return false;
        }
        if (!Objects.equals(this.correoRepresentante, other.correoRepresentante)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "cedulaRepresentante=" + cedulaRepresentante + ", NombreRepresentante=" + NombreRepresentante + ", ApellidoRepresentante=" + ApellidoRepresentante + ", telefonoRepresentante=" + telefonoRepresentante + ", edadRepresentante=" + edadRepresentante + ", correoRepresentante=" + correoRepresentante + ", contraseniaRepresentante=" + contraseniaRepresentante + ", curso=" + curso + '}';
    }
    
}