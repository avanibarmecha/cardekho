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
import model.City;
import util.DButil;

/**
 *
 * @author DELL 1
 */
public class citydao {
    private Connection connection;

    public citydao() {
        connection = DButil.getConnection();
    }

    public void addcity(City city) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into city(cityname) values ( ? )");
            // Parameters start with 1
            preparedStatement.setString(1, city.getCityname());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletecity(int cityid) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from city where cityid=?");
            // Parameters start with 1
            preparedStatement.setInt(1, cityid);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatecity(City city) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update city set cityname=?" +
                            " where cityid=?");
            // Parameters start with 1
            preparedStatement.setString(1, city.getCityname());
            preparedStatement.setInt(2, city.getCityid());
        
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<City> getAllcities() {
        List<City> cities = new ArrayList<City>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from city");
            while (rs.next()) {
                City city = new City();
                city.setCityid(rs.getInt("cityid"));
                city.setCityname(rs.getString("cityname"));
                cities.add(city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cities;
    }

    public City getcityByid(int cityid) {
        City city = new City();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from city where cityid=?");
            preparedStatement.setInt(1, cityid);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                city.setCityid(rs.getInt("cityid"));
                city.setCityname(rs.getString("cityname"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return city;
    }
}
