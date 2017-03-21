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

import model.Fuel;
import util.DButil;

/**
 *
 * @author DELL 1
 */
            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DELL 1
 */
public class fueldao {
     private Connection connection;

    public fueldao() {
        connection = DButil.getConnection();
    }

    public void addfuel(Fuel fuel) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into fuel(fueltype) values (?)");
            // Parameters start with 1
            preparedStatement.setString(1, fuel.getFueltype());
           
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletefuel(int fuelid) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from fuel where fuelid=?");
            // Parameters start with 1
            preparedStatement.setInt(1, fuelid);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatefuel(Fuel fuel) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update fuel set fueltype=?" +
                            " where fuelid=?");
            // Parameters start with 1
            preparedStatement.setString(1, fuel.getFueltype());
            
            preparedStatement.setInt(2, fuel.getFuelid());
        
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Fuel> getAllfuels() {
        List<Fuel> fuels = new ArrayList<Fuel>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from fuel");
            while (rs.next()) {
                Fuel fuel = new Fuel();
                fuel.setFuelid(rs.getInt("fuelid"));
                fuel.setFueltype(rs.getString("fueltype"));
                fuels.add(fuel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return fuels;
    }

    public Fuel getfuelByid(int fuelid) {
        Fuel fuel = new Fuel();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from fuel where fuelid=?");
            preparedStatement.setInt(1, fuelid);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                fuel.setFuelid(rs.getInt("fuelid"));
                fuel.setFueltype(rs.getString("fueltype"));
              
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return fuel;
    }
    
}


