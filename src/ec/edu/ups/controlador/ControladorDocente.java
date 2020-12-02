/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

//import ec.edu.ups.modelo.Personas;
import ec.edu.ups.modelo.Docente;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import ec.edu.ups.modelo.Rector;

/**
 *
 * @author braya
 */
public class ControladorDocente extends ControladorAbstracto<Docente>{
    private Pattern patronlogico;
    private Matcher corpus;
    private static ControladorDocente instancia;
    private static Docente obtener;
    
    private ControladorDocente() {super();
        
    }
    
    
    public boolean inicarSesion(String correo, String contrasenia, String ruta) {
        var iniciar = true;
        try {
            iniciar = cargarDatos(ruta).stream().filter(a -> correo.equals(a.getCorreo()) && contrasenia.equals(a.getContrasenia()))
                    .anyMatch(b -> correo.equals(b.getCorreo()) && contrasenia.equals(b.getContrasenia()));
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ControladorDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (iniciar) {
            obtener = getListaObjetos().stream().filter(c -> correo.equals(c.getCorreo()) && contrasenia.equals(c.getContrasenia())).findFirst().get();
            return true;
        }
        return false;
    }
    
    public static ControladorDocente getInstance() {
        if (instancia == null) {
            instancia = new ControladorDocente();
        }
        return instancia;
    }
    
    public static Docente obtenerSesionInciada() {
        if (obtener == null) {
            obtener = new Docente();
        }
        return obtener;
    }
    public void ingresarActividad(String regex){
        patronlogico = Pattern.compile(regex);
    }
    
    
    public List<String> buscarCorpus(String url){
        List<String> r = new ArrayList<>();
        corpus = patronlogico.matcher(url);
        while (corpus.find()) {            
            r.add(url);
        }
        return r;
    }

    public Pattern getPatronlogico() {
        return patronlogico;
    }

    public void setPatronlogico(Pattern patronlogico) {
        this.patronlogico = patronlogico;
    }

    public Matcher getCorpus() {
        return corpus;
    }

    public void setCorpus(Matcher corpus) {
        this.corpus = corpus;
    }
    
}
