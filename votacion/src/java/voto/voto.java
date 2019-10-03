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
public class voto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola");
        //UserDTO myuser=new UserDTO();
        //myuser.setUsername("vicente");
        //myuser.setPassword("123");
        
        //UserDAO dao=new UserDAO();
        //UserDTO myuser_result = dao.login(myuser);
        
        
        
        
        //System.out.println("Vector: " + myuser_result.getDireccion());
        
        //System.out.println(myuser_result.getFirstname());
        //System.out.println(myuser_result.getLastname());
        
        ////////////////////////////////////
        UserDTO myuser=new UserDTO();
        
        myuser.setFirstname("gianpiero");
        myuser.setLastname("montemayor");
        myuser.setDni("71978865");
        myuser.setPassword("123");
        myuser.setValid(true);
        
        
        
        
        UserDAO dao=new UserDAO();
        UserDTO myuser_result =dao.Signup(myuser);
        
        
    }
    
}
