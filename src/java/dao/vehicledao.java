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
import model.Vehicle;
import util.DButil;

/**
 *
 * @author DELL 1
 */
public class vehicledao {
    private Connection connection;

    public vehicledao() {
        connection = DButil.getConnection();
    }

    public void addvehicle(Vehicle vehicle) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into vehicle(vtype) values (?)");
            // Parameters start with 1
            preparedStatement.setString(1, vehicle.getVtype());
            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletevehicle(int typeid) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from vehicle where typeid=?");
            // Parameters start with 1
            preparedStatement.setInt(1, typeid);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatevehicle(Vehicle vehicle) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update vehicle set vtype=?" +
                            " where typeid=?");
            // Parameters start with 1
            preparedStatement.setString(1, vehicle.getVtype());
           
            preparedStatement.setInt(2, vehicle.getTypeid());
        
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Vehicle> getAllvehicles() {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from vehicle");
            while (rs.next()) {
                Vehicle vehicle = new Vehicle();
                vehicle.setTypeid(rs.getInt("typeid"));
                vehicle.setVtype(rs.getString("vtype"));
                
                vehicles.add(vehicle);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vehicles;
    }

    public Vehicle getvehicleByid(int typeid) {
        Vehicle vehicle = new Vehicle();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from vehicle where typeid=?");
            preparedStatement.setInt(1, typeid);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                vehicle.setTypeid(rs.getInt("typeid"));
                vehicle.setVtype(rs.getString("vtype"));
               
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vehicle;
    }
}
