/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DELL 1
 */
public class Budget {
    int budgetid;

    public int getBudgetid() {
        return budgetid;
    }

    public void setBudgetid(int budgetid) {
        this.budgetid = budgetid;
    }

    public String getBudget_range() {
        return budget_range;
    }

    public void setBudget_range(String budget_range) {
        this.budget_range = budget_range;
    }
    String budget_range;
}
