/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.localDAO.currentCon;
import java.text.*;
import java.util.*;
import java.sql.*;
import voto.ConnectionManager;
import voto.mesa;

/**
 *
 * @author LAB-USR-CAQP-C0203
 */
public class mesaDAO {
    static Connection currentCon=null;
    static ResultSet rs=null;
    
    
    
    public static  boolean Signup(mesa bean) {
        Statement stmt=null;
        
        String id_local=bean.getId_local();
        
        String insertQuery="insert into mesa (id_local) values('"+id_local+"')";
        
        
        
        
        
        
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
