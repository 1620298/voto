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
public class UserDTO {
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private Vector<String> direccion;
    public boolean valid;

    public Vector<String> getDireccion() {
        return direccion;
    }

    public void setDireccion(Vector<String> direccion) {
        this.direccion = direccion;
    }
    


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
    
    
}
