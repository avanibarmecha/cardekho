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
import model.Budget;
import util.DButil;

/**
 *
 * @author DELL 1
 */
public class budgetdao {
     private Connection connection;

    public budgetdao() {
        connection = DButil.getConnection();
    }

    public void addbudget(Budget budget) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into budget(budget_range) values (?)");
            // Parameters start with 1
            preparedStatement.setString(1, budget.getBudget_range());
           
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletebudget(int budgetid) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from budget where budgetid=?");
            // Parameters start with 1
            preparedStatement.setInt(1, budgetid);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatebudget(Budget budget) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update budget set budget_range=?" +
                            " where budgetid=?");
            // Parameters start with 1
            preparedStatement.setString(1, budget.getBudget_range());
            
            preparedStatement.setInt(2, budget.getBudgetid());
        
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Budget> getAllbudgets() {
        List<Budget> budgets = new ArrayList<Budget>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from budget");
            while (rs.next()) {
                Budget budget = new Budget();
                budget.setBudgetid(rs.getInt("budgetid"));
                budget.setBudget_range(rs.getString("budget_range"));
                budgets.add(budget);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return budgets;
    }

    public Budget getbudgetByid(int budgetid) {
        Budget budget = new Budget();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from budget where budgetid=?");
            preparedStatement.setInt(1, budgetid);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                budget.setBudgetid(rs.getInt("budgetid"));
                budget.setBudget_range(rs.getString("budget_range"));
              
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return budget;
    }
    
}
