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
import model.Model;
import util.DButil;

/**
 *
 * @author DELL 1
 */
public class modeldao {
    private Connection connection;

    public modeldao() {
        connection = DButil.getConnection();
    }

    public void addmodel(Model model) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into model(modelname,tengine,mileage,seat,fuelid,brandid,modellogo) values ( ?,?,?,?,?,?,?)");
            // Parameters start with 1
            preparedStatement.setString(1, model.getModelname());
            preparedStatement.setString(2, model.getTengine());
            preparedStatement.setString(3, model.getMileage());
            preparedStatement.setInt(4, model.getSeat());
            preparedStatement.setInt(5, model.getFuelid());
            preparedStatement.setInt(6, model.getBrandid());
            preparedStatement.setString(7, model.getModellogo());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletemodel(int modelid) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from model where modelid=?");
            // Parameters start with 1
            preparedStatement.setInt(1, modelid);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatemodel(Model model) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update model set modelname=?,tengine=?,mileage=?,seat=?,brandid=?,fuelid=?,modellogo=?" +
                            " where modelid=?");
            // Parameters start with 1
            preparedStatement.setString(1, model.getModelname());
            preparedStatement.setString(2, model.getTengine());
            preparedStatement.setString(3, model.getMileage());
            preparedStatement.setInt(4, model.getSeat());
            preparedStatement.setInt(5, model.getBrandid());
            preparedStatement.setInt(6, model.getFuelid());
            preparedStatement.setString(7, model.getModellogo());
            preparedStatement.setInt(8, model.getModelid());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Model> getAllmodels() {
        List<Model> models = new ArrayList<Model>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select modelid,modelname,tengine,mileage,seat,brandname,fueltype,modellogo from model join brand on model.brandid=brand.brandid join fuel on model.fuelid=fuel.fuelid");
            while (rs.next()) {
                Model model = new Model();
                model.setModelid(rs.getInt("modelid"));
                model.setModelname(rs.getString("modelname"));
                model.setTengine(rs.getString("tengine"));
                model.setMileage(rs.getString("mileage"));
                model.setSeat(rs.getInt("seat"));
                model.setBrandname(rs.getString("brandname"));
                model.setFueltype(rs.getString("fueltype"));
                model.setModellogo(rs.getString("modellogo"));
                models.add(model);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return models;
    }
  public List<Model> getModelByBrand(int brandid) {
        List<Model> models = new ArrayList<Model>();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select modelid,modelname from model where brandid=?");
            preparedStatement.setInt(1, brandid);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Model model = new Model();
                model.setModelid(rs.getInt("modelid"));
                model.setModelname(rs.getString("modelname"));
                models.add(model);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return models;
    }

    public Model getmodelByid(int modelid) {
        Model model = new Model();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from model where modelid=?");
            preparedStatement.setInt(1, modelid);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                model.setModelid(rs.getInt("modelid"));
                model.setModelname(rs.getString("modelname"));
                model.setTengine(rs.getString("tengine"));
                model.setMileage(rs.getString("mileage"));
                model.setSeat(rs.getInt("seat"));
                model.setBrandid(rs.getInt("brandid"));
                model.setFuelid(rs.getInt("fuelid"));
                model.setModellogo(rs.getString("modellogo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return model;
    }
}
