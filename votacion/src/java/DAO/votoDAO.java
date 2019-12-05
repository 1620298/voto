package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import voto.ConnectionManager;
import voto.partido;
import voto.voto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gianpiero
 */
public class votoDAO {
    static Connection currentCon=null;
    static ResultSet rs=null;
    
    
    
    
   

    public static  boolean Signup(voto bean) {
        Statement stmt=null;
        
        String presidente=bean.getPresidente();
      
        
        String insertQuery="insert into voto (presidente) values('"+presidente+"')";
        
       
        
        
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
