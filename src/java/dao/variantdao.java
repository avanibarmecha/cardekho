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
import model.Variant;
import util.DButil;

/**
 *
 * @author DELL 1
 */
public class variantdao {
     private Connection connection;

    public variantdao() {
        connection = DButil.getConnection();
    }

    public void addvariant(Variant variant) {
        try {
          
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into variant(variantname,exshowroom_price,features,modelid) values ( ?,?,?,?)");
            // Parameters start with 1
            preparedStatement.setString(1, variant.getVariantname());
            preparedStatement.setInt(2, variant.getExshowroom_price());
            preparedStatement.setString(3, variant.getFeatures());
            preparedStatement.setInt(4, variant.getModelid());
            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletevariant(int variantid) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from variant where variantid=?");
            // Parameters start with 1
            preparedStatement.setInt(1, variantid);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatevariant(Variant variant) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update variant set variantname=?,exshowroom_price=?,features=?,modelid=?" +
                            " where variantid=?");
            // Parameters start with 1
            preparedStatement.setString(1, variant.getVariantname());
            preparedStatement.setInt(2, variant.getExshowroom_price());
            preparedStatement.setString(3, variant.getFeatures());
            preparedStatement.setInt(4, variant.getModelid());
           
            preparedStatement.setInt(5, variant.getVariantid());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   public List<Variant> getAllvariants() {
        List<Variant> variants = new ArrayList<Variant>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select variantid,variantname,exshowroom_price,features,modelname from variant join model on variant.modelid=model.modelid ");
            while (rs.next()) {
                Variant variant = new Variant();
                variant.setVariantid(rs.getInt("variantid"));
                variant.setVariantname(rs.getString("variantname"));
                variant.setExshowroom_price(rs.getInt("exshowroom_price"));
                variant.setFeatures(rs.getString("features"));
                
                variant.setModelname(rs.getString("modelname"));
                
                variants.add(variant);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return variants;
    }

    public Variant getvariantByid(int variantid) {
        Variant variant = new Variant();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from variant where variantid=?");
            preparedStatement.setInt(1, variantid);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                variant.setVariantid(rs.getInt("variantid"));
                variant.setVariantname(rs.getString("variantname"));
                variant.setExshowroom_price(rs.getInt("exshowroom_price"));
                variant.setFeatures(rs.getString("features"));
                
                variant.setModelid(rs.getInt("modelid"));
               
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return variant;
    }
}

