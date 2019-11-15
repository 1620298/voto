/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voto;

import java.util.Vector;

/**
 *
 * @author LAB-USR-CAQP-C0203
 */
public class candidato extends UserDTO{
    
    private String id_candidato;
    private String id_persona;    
    private String tipo;
    private String id_partido;
    
    
    
    
    public boolean valid;

    

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getId_candidato() {
        return id_candidato;
    }

    public void setId_candidato(String id_candidato) {
        this.id_candidato = id_candidato;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getId_partido() {
        return id_partido;
    }

    public void setId_partido(String id_partido) {
        this.id_partido = id_partido;
    }

    

    
}
