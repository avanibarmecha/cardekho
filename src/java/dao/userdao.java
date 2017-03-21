/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.User;
import util.DButil;

/**
 *
 * @author student
 */
public class userdao {
     private Connection connection;

    public userdao() {
        connection = DButil.getConnection();
    }

    public String Register(User user) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into user(firstname,lastname,username,email,city,password,role) values (?,?,?,?,?,?,?)");
            // Parameters start with 1
           preparedStatement.setString(1,user.getFirstname());
           preparedStatement.setString(2,user.getLastname());
           preparedStatement.setString(3,user.getUsername());
           preparedStatement.setString(4,user.getEmail());
           preparedStatement.setString(5,user.getCity());
           preparedStatement.setString(6,user.getPassword());
        
           preparedStatement.setString(7,"Member");
          
            preparedStatement.executeUpdate();
            return "success";

        } catch (SQLException e) {
           return e.getMessage();
        }
    }
  
    public boolean Login(String username,String password,String role)
    {
        
         try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from user where username=? and password=? and role=?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, role);
             ResultSet rs =preparedStatement.executeQuery();
            boolean   status = rs.next();
            return status;
         
                
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
      

    }
    public void deleteuser(int userid) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from user where userid=?");
            // Parameters start with 1
            preparedStatement.setInt(1, userid);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public List<User> getAllusers() {
        List<User> users = new ArrayList<User>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select userid,firstname,lastname,username,email,city,role from user");
            while (rs.next()) {
                User user = new User();
                user.setUserid(rs.getInt("userid"));
                user.setFirstname(rs.getString("firstname"));
                user.setLastname(rs.getString("lastname"));
                user.setUsername(rs.getString("username"));
                user.setEmail(rs.getString("email"));
                user.setCity(rs.getString("city"));
                user.setRole(rs.getString("role"));
              
                users.add(user);
                
               
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

   
    
    
}
