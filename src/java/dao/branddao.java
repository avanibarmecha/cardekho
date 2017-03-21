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
import model.Brand;
import util.DButil;

/**
 *
 * @author DELL 1
 */
public class branddao {
     private Connection connection;

    public branddao() {
        connection = DButil.getConnection();
    }

    public void addbrand(Brand brand) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into brand(brandname,brandlogo) values (?,?)");
            // Parameters start with 1
            preparedStatement.setString(1, brand.getBrandname());
            preparedStatement.setString(2, brand.getBrandlogo());
            
           
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletebrand(int brandid) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from brand where brandid=?");
            // Parameters start with 1
            preparedStatement.setInt(1, brandid);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatebrand(Brand brand) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update brand set brandname=?,brandlogo=?   where brandid=?");
            // Parameters start with 1
            preparedStatement.setString(1, brand.getBrandname());
            preparedStatement.setString(2, brand.getBrandlogo());
            
            preparedStatement.setInt(3, brand.getBrandid());
        
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Brand> getAllbrands() {
        List<Brand> brands = new ArrayList<Brand>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from brand");
            while (rs.next()) {
                Brand brand = new Brand();
                brand.setBrandid(rs.getInt("brandid"));
                brand.setBrandname(rs.getString("brandname"));
                brand.setBrandlogo(rs.getString("brandlogo"));
              
                brands.add(brand);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return brands;
    }

    public Brand getbrandByid(int brandid) {
        Brand brand = new Brand();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from brand where brandid=?");
            preparedStatement.setInt(1, brandid);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                brand.setBrandid(rs.getInt("brandid"));
                brand.setBrandname(rs.getString("brandname"));
                brand.setBrandlogo(rs.getString("brandlogo"));
              
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return brand;
    }
    
}
