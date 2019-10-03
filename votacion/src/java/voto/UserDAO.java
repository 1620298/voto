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
        
        String username=bean.getUsername();
        String password=bean.getPassword();
        
        String searchQuery="select*from users u inner join direcciones d on u.id=d.users where username= '"+ username+ "' AND password='"+password+"' ";
        
        System.out.println("Your username is "+ username);
        System.out.println("Your password is "+ password);
        System.out.println("Query "+ searchQuery);
        
        
        try{
            currentCon = ConnectionManager.getConnection();
            stmt=currentCon.createStatement();
            rs=stmt.executeQuery(searchQuery);
            boolean more=rs.next();
            
            Vector<String> temp=new Vector<String>();
            
            
            do{
                String firstname=rs.getString("Firstname");
                    String lastname=rs.getString("Lastname");
                    String direccion=rs.getString("Direccion");
                    
                    
                    
                    System.out.println("welcome "+ firstname);
                    bean.setFirstname(firstname);
                    bean.setLastname(lastname);
                    
                    temp.add(direccion);
                    bean.setValid(true);
                    
            }while(rs.next());
            bean.setDireccion(temp);
            
            
            
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
    
   

    public static UserDTO Signup(UserDTO bean) {
        Statement stmt=null;
        
        String firstname=bean.getFirstname();
        String lastname=bean.getLastname();
        String username=bean.getUsername();
        String password=bean.getPassword();
        
        String insertQuery="insert into users (username, password, firstname, lastname, valid) values(?/?/?/?/?)";
        
        System.out.println("Your firstname is "+ firstname);
        System.out.println("Your lastname is "+ lastname);
        System.out.println("Your username is "+ username);
        System.out.println("Your password is "+ password);
        
        try{
            currentCon = ConnectionManager.getConnection();
            stmt=currentCon.createStatement();
            rs=stmt.executeQuery(insertQuery);
            boolean more=rs.next();
            
            Vector<String> temp=new Vector<String>();
            
            
            
            
            
            
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
        
        
        
        return bean;
    
    }
}
