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
import model.Feedback;
import util.DButil;

/**
 *
 * @author DELL 1
 */
public class feedbackdao {
    private Connection connection;

    public feedbackdao() {
        connection = DButil.getConnection();
    }

    public void addfeedback(Feedback feedback) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into feedback(fullname,email,mobileno,cityid,comments) values ( ?,?,?,?,? )");
            // Parameters start with 1
            preparedStatement.setString(1, feedback.getFullname());
            preparedStatement.setString(2, feedback.getEmail());
            preparedStatement.setString(3, feedback.getMobileno());
            preparedStatement.setInt(4, feedback.getCityid());
            preparedStatement.setString(5, feedback.getComments());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletefeedback(int feedbackid) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from feedback where feedbackid=?");
            // Parameters start with 1
            preparedStatement.setInt(1, feedbackid);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    

    public List<Feedback> getAllfeedbacks() {
        List<Feedback> feedbacks = new ArrayList<Feedback>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select feedbackid,fullname,email,mobileno,cityname,comments from feedback join city on feedback.cityid=city.cityid ");
            while (rs.next()) {
                Feedback feedback = new Feedback();
                feedback.setFeedbackid(rs.getInt("feedbackid"));
                feedback.setFullname(rs.getString("fullname"));
                feedback.setEmail(rs.getString("Email"));
                feedback.setMobileno(rs.getString("mobileno"));
                feedback.setCityname(rs.getString("cityname"));
                feedback.setComments(rs.getString("comments"));
                feedbacks.add(feedback);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return feedbacks;
    }

    
}
