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
public class UserDAO {
    static Connection currentCon=null;
    static ResultSet rs=null;
    
    
    public static UserDTO login(UserDTO bean){
        Statement stmt=null;
        
        String dni=bean.getDni();
        String password=bean.getPassword();
        
        String searchQuery="select*from persona where dni= '"+ dni+ "' AND password='"+password+"' ";
        
        System.out.println("Your dni is "+ dni);
        System.out.println("Your password is "+ password);
        System.out.println("Query "+ searchQuery);
        
        
        try{
            currentCon = ConnectionManager.getConnection();
            stmt=currentCon.createStatement();
            rs=stmt.executeQuery(searchQuery);
            boolean more=rs.next();
            
           
            
            
            do{
                String firstname=rs.getString("nombres");
                String lastname=rs.getString("apellidos");
                    
                    
                    
                    
                System.out.println("welcome "+ firstname);
                bean.setFirstname(firstname);
                bean.setLastname(lastname);
                    
                    
                bean.setValid(true);
                    
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
        
        return bean;
    }
    
   

    public static  boolean Signup(UserDTO bean) {
        Statement stmt=null;
        
        String dni=bean.getDni();
        String password=bean.getPassword();
        String firstname=bean.getFirstname();
        String lastname=bean.getLastname();
        
        
        String insertQuery="insert into persona (dni, password, nombres, apellidos) values('"+dni+"', '"+password+"', '"+firstname+"', '"+lastname+"')";
        
        System.out.println("Your firstname is "+ firstname);
        System.out.println("Your lastname is "+ lastname);
        System.out.println("Your dni is "+ dni);
        System.out.println("Your password is "+ password);
        
        
        
        
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
