/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.text.*;
import java.util.*;
import java.sql.*;
import voto.ConnectionManager;
import voto.local;

/**
 *
 * @author LAB-USR-CAQP-C0203
 */
public class localDAO {
    static Connection currentCon=null;
    static ResultSet rs=null;
    
    
    

    public static  boolean Signup(local bean) {
        Statement stmt=null;
        
        String direccion=bean.getDireccion();
        String ubigeo=bean.getUbigeo();
        
        
        
        
        
        String insertQuery="insert into local (direccion, ubigeo) values('"+direccion+"', '"+ubigeo+"')";
        
        
        
        
        
        
        try{
            currentCon = ConnectionManager.getConnection();
            stmt=currentCon.createStatement();
            
            if(stmt.executeUpdate(insertQuery) == 1){
                return true;
            }
            
            
            
            
            
            
            
            
        }
        catch(Exception ex){
            System.out.println("Sign up failed: An exception has ocurred "+ ex);
        }
        
        finally{
            if(rs!=null){
                try{
                    rs.close();
                }catch(Exception e){
                    
                }
                
                if(stmt!=null){
                    try{
                        stmt.close();
                    }catch(Exception e){
                        
                    }
                    stmt=null;
                }
                
                if(currentCon !=null){
                    try{
                        currentCon.close();
                    }catch (Exception e){
                        
                    }
                    currentCon=null;
                }
                
            }
            
        }
        
        
        
        return false;
    
    }

    
}
