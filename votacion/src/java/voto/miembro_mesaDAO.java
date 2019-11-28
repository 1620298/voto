/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voto;

import java.text.*;
import java.util.*;
import java.sql.*;

/**
 *
 * @author LAB-USR-CAQP-C0203
 */
public class miembro_mesaDAO {
    static Connection currentCon=null;
    static ResultSet rs=null;
    
    
    
    public static  boolean Signup(miembro_mesa bean) {
        Statement stmt=null;
        
        String dni=bean.getDni();    
        String tipo=bean.getTipo();
        String id_mesa=bean.getId_mesa();
        
        
        
        String searchQuery="select*from persona where dni= '"+ dni+ "";
        
        
        //String insertQuery="insert into persona (dni, nombres, apellidos, ubigeo, direccion, sexo, estado_civil, fecha_caducidad, password) values('"+dni+"', '"+firstname+"', '"+lastname+"', '"+ubigeo+"', '"+direccion+"', '"+sexo+"', '"+estado_civil+"', '"+fecha_caducidad+"', '"+password+"')";
        
        
        
        
        
       try{
            currentCon = ConnectionManager.getConnection();
            stmt=currentCon.createStatement();
            rs=stmt.executeQuery(searchQuery);
            
            boolean more=rs.next();
            
           
            
            
            do{
                String id_persona=rs.getString("id_persona");
                bean.setId_persona(id_persona);
                
                
                
                
                String insertQuery="insert into miembro (tipo, id_persona, id_mesa) values('"+tipo +"', '"+id_persona +"', '"+id_mesa+"')";
                
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
    
    
      
                
                    
                    
                
                    
            }while(rs.next());
            
            
            
            
        }
        catch(Exception ex){
            System.out.println("Log in failed: An exception has ocurred "+ ex);
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
