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
import model.Getonroadprice;
import util.DButil;

/**
 *
 * @author DELL 1
 */
public class getonroadpricedao {
     private Connection connection;

    public getonroadpricedao() {
        connection = DButil.getConnection();
    }

    public void addgetonroadprice(Getonroadprice getonroadprice) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into getonroadprice(fullname,email,mobileno,buyingtime,pincode,cityid,brandid,modelid) values (?,?,?,?,?,?,?,?)");
            // Parameters start with 1
            preparedStatement.setString(1, getonroadprice.getFullname());
            preparedStatement.setString(2, getonroadprice.getEmail());
            preparedStatement.setString(3, getonroadprice.getMobileno());
            preparedStatement.setString(4, getonroadprice.getBuyingtime());
            preparedStatement.setString(5, getonroadprice.getPincode());
            preparedStatement.setInt(6, getonroadprice.getCityid());
            preparedStatement.setInt(7, getonroadprice.getBrandid());
            preparedStatement.setInt(8, getonroadprice.getModelid());



           
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public List<Getonroadprice> getAllgetonroadprices() {
        List<Getonroadprice> getonroadprices = new ArrayList<Getonroadprice>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select getonroadpriceid,fullname,email,mobileno,buyingtime,pincode,cityname,brandname,modelname from getonroadprice join city on getonroadprice.cityid=city.cityid join brand on getonroadprice.brandid=brand.brandid join model on getonroadprice.modelid=model.modelid");
            while (rs.next()) {
                Getonroadprice getonroadprice = new Getonroadprice();
                getonroadprice.setGetonroadpriceid(rs.getInt("getonroadpriceid"));
                getonroadprice.setFullname(rs.getString("fullname"));
                getonroadprice.setEmail(rs.getString("email"));
                getonroadprice.setMobileno(rs.getString("mobileno"));
                getonroadprice.setBuyingtime(rs.getString("buyingtime"));
                getonroadprice.setPincode(rs.getString("pincode"));
                getonroadprice.setCityname(rs.getString("cityname"));
                getonroadprice.setBrandname(rs.getString("brandname"));
                getonroadprice.setModelname(rs.getString("modelname"));
                getonroadprices.add(getonroadprice);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getonroadprices;
    }

   
    
}
